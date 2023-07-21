import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrInputDocument;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class hashsol {
    public static void main(String[] args) {
        String solrUrl = "http://localhost:8983/solr/sol";
        String dataUrl = "https://api.patentsview.org/patents/query?q={%22_gte%22:{%22patent_date%22:%222007-01-04%22}}&f=[%22patent_number%22,%22patent_date%22,%22patent_title%22]";

        try {
            // Initialize Solr client
            SolrClient solrClient = new HttpSolrClient.Builder(solrUrl).build();

            // Fetch JSON data
            JSONObject json = readJsonFromUrl(dataUrl);
            JSONArray patents = json.getJSONArray("patents");

            // Index each document into Solr
            for (int i = 0; i < patents.length(); i++) {
                JSONObject patent = patents.getJSONObject(i);

                SolrInputDocument document = new SolrInputDocument();
                document.addField("patent_number", patent.getString("patent_number"));
                document.addField("patent_date", patent.getString("patent_date"));
                document.addField("patent_title", patent.getString("patent_title"));

                solrClient.add(document);
            }

            // Commit the changes to make them visible immediately
            solrClient.commit();
            solrClient.close();

            System.out.println("Data indexed successfully.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static JSONObject readJsonFromUrl(String url) throws IOException {
        BufferedReader reader = null;
        try {
            URL dataUrl = new URL(url);
            reader = new BufferedReader(new InputStreamReader(dataUrl.openStream()));
            StringBuilder jsonStr = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                jsonStr.append(line);
            }
            return new JSONObject(jsonStr.toString());
        } finally {
            if (reader != null) {
                reader.close();
            }
        }
    }
}
