import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.client.solrj.request.ContentStreamUpdateRequest;
import org.apache.solr.common.util.ContentStreamBase;

public class SolrIndexingExample {

    public static void main(String[] args) {
        String solrUrl = "http://localhost:8983/madhu";
        SolrClient solrClient = new HttpSolrClient.Builder(solrUrl).build();

        try {
            String jsonData = {"patents":[{"patent_number":"10000000","patent_date":"2018-06-19","patent_title":"Coherent LADAR using intra-pixel quadrature detection"},{"patent_number":"10000001","patent_date":"2018-06-19","patent_title":"Injection molding machine and mold thickness control method"},{"patent_number":"10000002","patent_date":"2018-06-19","patent_title":"Method for manufacturing polymer film and co-extruded film"},{"patent_number":"10000003","patent_date":"2018-06-19","patent_title":"Method for producing a container from a thermoplastic"},{"patent_number":"10000004","patent_date":"2018-06-19","patent_title":"Process of obtaining a double-oriented film, co-extruded, and of low thickness made by a three bubble process that at the time of being thermoformed provides a uniform thickness in the produced tray"},{"patent_number":"10000005","patent_date":"2018-06-19","patent_title":"Article vacuum formation method and vacuum forming apparatus"},{"patent_number":"10000006","patent_date":"2018-06-19","patent_title":"Thermoforming mold device and a process for its manufacture and use"},{"patent_number":"10000007","patent_date":"2018-06-19","patent_title":"PEX expanding tool"},{"patent_number":"10000008","patent_date":"2018-06-19","patent_title":"Bracelet mold and method of use"},{"patent_number":"10000009","patent_date":"2018-06-19","patent_title":"Sterile environment for additive manufacturing"},{"patent_number":"10000010","patent_date":"2018-06-19","patent_title":"3-D electrostatic printer using rack and pinion registration system"},{"patent_number":"10000011","patent_date":"2018-06-19","patent_title":"Supports for sintering additively manufactured parts"},{"patent_number":"10000014","patent_date":"2018-06-19","patent_title":"Method for producing thermoplastic foam panels by means of at least two heating elements offset in parallel with each other"},{"patent_number":"10000015","patent_date":"2018-06-19","patent_title":"Methods for making optical components, optical components, and products including same"},{"patent_number":"10000016","patent_date":"2018-06-19","patent_title":"Film edge sealing device"},{"patent_number":"10000017","patent_date":"2018-06-19","patent_title":"Method for mounting a vortex generator and mounting apparatus for carrying out the method"},{"patent_number":"10000018","patent_date":"2018-06-19","patent_title":"Pull tab design for stretch release adhesive"},{"patent_number":"10000019","patent_date":"2018-06-19","patent_title":"Installation assembly and associated method for forming a bonded joint"},{"patent_number":"10000020","patent_date":"2018-06-19","patent_title":"Method and device for producing areas in a printed object having different coefficients of friction"},{"patent_number":"10000021","patent_date":"2018-06-19","patent_title":"Method for manufacturing three-dimensional shaped object and three-dimensional shaped object obtained by the same"},{"patent_number":"10000022","patent_date":"2018-06-19","patent_title":"Method for processing PAEK and articles manufactured from the same"},{"patent_number":"10000023","patent_date":"2018-06-19","patent_title":"Apparatus and method for forming three-dimensional objects using linear solidification"},{"patent_number":"10000024","patent_date":"2018-06-19","patent_title":"Apparatus and method for control of three-dimensional printing"},{"patent_number":"10000025","patent_date":"2018-06-19","patent_title":"Optimized cross-ply orientation in composite laminates"},{"patent_number":"10000026","patent_date":"2018-06-19","patent_title":"Composite induction consolidation apparatus and method"}],"count":25,"total_patent_count":4728501};

            ContentStreamUpdateRequest request = new ContentStreamUpdateRequest("/update/json");
            request.addContentStream(new ContentStreamBase.StringStream(jsonData));
            request.setParam("wt", "json");

            solrClient.request(request);
            solrClient.commit();
            System.out.println("JSON data indexed successfully.");
        } catch (Exception e) {
            System.err.println("An error occurred during indexing: " + e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                solrClient.close();
            } 
			catch (Exception e) {
                System.err.println("An error occurred while closing Solr client: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }
}