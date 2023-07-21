import java.util.Scanner;

public class spira {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n * m];
        int rowmin = 0, rowmax = n - 1, colmin = 0, colmax = m - 1;
        int count = 0;
        while (rowmin <= rowmax && colmin <= colmax) {
            for (int i = colmin; i <= colmax; i++) {
                arr[count++] = sc.nextInt();
            }
            rowmin++;
            for (int i = rowmin; i <= rowmax; i++) {
                arr[count++] = sc.nextInt();
            }
            colmax--;
            if (rowmin <= rowmax) {
                for (int i = colmax; i >= colmin; i--) {
                    arr[count++] = sc.nextInt();
                }
                rowmax--;
            }
            if (colmin <= colmax) {
                for (int i = rowmax; i >= rowmin; i--) {
                    arr[count++] = sc.nextInt();
                }
                colmin++;
            }
        }
		for (int i = 0; i < n * m; i++) {
    if (i % m == 0 && i / m <= rowmax) {
        System.out.print(arr[i / m * m + colmax] + " ");
    } else if (i % m == colmax && i / m >= rowmin) {
        System.out.print(arr[(i / m - rowmin + 1) * m + colmin] + " ");
    } else if (i % m == colmin && i / m < rowmax) {
        System.out.print(arr[(i / m + 1) * m + colmin] + " ");
    } else if (i % m == colmin && i / m >= rowmin) {
        System.out.print(arr[(i / m - rowmin) * m + colmax] + " ");
    }
}

}


    }

