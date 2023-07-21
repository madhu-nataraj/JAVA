import java.util.*;
class  stri{
    public static void main(String[] args) {
        int rows = 7; // Number of rows in the pattern

        // Loop to print the upper half of the pattern
        for (int i = 1; i <= rows; i += 2) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Loop to print the middle section of the pattern
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= rows; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
		

        // Loop to print the lower half of the pattern
        for (int i = rows - 2; i >= 1; i -= 2) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
