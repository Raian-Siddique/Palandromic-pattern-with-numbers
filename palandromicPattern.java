/**
 * palandromicPattern
 */
public class palandromicPattern {

    public static void palandromic_pattern(int n) {
        // Outer Loop
        for (int i = 1; i <= n; i++) {
            // Inner Loop
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Inner Loop, Descending number
            // first half
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            // Inner Loop, Ascending order
            // second half
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        palandromic_pattern(5);
    }
}