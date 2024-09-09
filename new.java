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
 
            // end-line
            System.out.println();
        }
    }
#vesion2.2change by vinay
public class MultiplyTwoNumbers {

    public static void main(String[] args) {

        float first = 1.5f;
        float second = 2.0f;

        float product = first * second;

        System.out.println("The product is: " + product);
    }
 
    // Driver Function
    public static void main(String args[])
    {
        int k = 5;
        StarleftTriangle(k);
    }
}
#end of vesion2.2