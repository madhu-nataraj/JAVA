import java.util.Scanner;
class LavaTubes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] h = new int[n][m];

        // Read in the height map
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                h[i][j] = sc.nextInt();
            }
        }

        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int sum = 0;

        // Find low points and calculate risk levels
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int height = h[i][j];
                boolean isLow = true;

                for (int[] dir : directions) {
                    int Row = i + dir[0];
                    int Col = j + dir[1];

                    if (Row < 0 || Row >= n || Col < 0 || Col >= m) {
                        continue;
                    }

                    if (h[Row][Col] <= height) {
                        isLow = false;
                        break;
                    }
                }

                if (isLow) {
                    sum += height + 1;
                }
            }
        }

        System.out.println(sum);
    }
}
