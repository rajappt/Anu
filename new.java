public class GFG {
    // Function to demonstrate printing pattern
    public static void StarleftTriangle(int k)
    {
        int a, b;
 
        // 1st loop
        for (a = 0; a < k; a++) {
 
            // nested 2nd loop
            for (b = 2 * (k - a); b >= 0; b--) {
                // printing spaces
                System.out.print(" ");
            }
 
            // nested 3rd loop
            for (b = 0; b <= a; b++) {
                // printing stars
                System.out.print("* ");
            }
 #vesion2.1 change by raja
 public static void main(String[] args)
    {
        int num = 5;
        int x = 0;
 
        // Outer loop for rows
        for (int i = 1; i <= num; i++) {
            x = i - 1;
 
            // inner loop for "i"th row printing
            for (int j = i; j <= num - 1; j++) {
 
                // First Number Space
                System.out.print(" ");
 
                // Space between Numbers
                System.out.print("  ");
            }
            // end-line
            System.out.println();
        }
    }
 
    // Driver Function
    public static void main(String args[])
    {
        int k = 5;
        StarleftTriangle(k);
    }
}
#end of vesion2.1 