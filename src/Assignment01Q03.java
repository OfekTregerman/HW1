public class Assignment01Q03 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);

        System.out.println("The first " + x + " Fibonacci numbers are:");
        int prev = 1;
        int curr = 1;
        int numOdd = 0;

        for (int i = 0; i < x; i++) {
            System.out.print(prev);

            if (prev % 2 != 0)
            {
                numOdd++;
            }

            int val = prev + curr;
            prev = curr;
            curr = val;

            if (i < x - 1) 
                System.out.print(" "); // Make sure we don't print a trailing space
        }

        System.out.println();        
        System.out.println("The number of odd numbers is: " + numOdd);
    }
}
