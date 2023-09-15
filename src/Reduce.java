public class Reduce {
    public static void main(String[] args) {
        int n = 100;  // Starting number
        int steps = 0; // Initialize step counter

        while (n > 0) {
            if (n % 2 == 0) {
                // If n is even, divide it by 2
                n = n / 2;
            } else {
                // If n is odd, subtract 1
                n = n - 1;
            }
            steps++; // Increment the step counter
        }
        System.out.println("Number of steps to reduce 100 to 0: " + steps);
    }s
}
