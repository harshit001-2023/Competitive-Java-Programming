import java.util.Scanner;

public class Recursion {
    public static int factorial(int n) {
        // Base Case: The condition that stops the recursion.
        // The factorial of 1 or 0 is 1.
        if (n <= 1) {
            return 1;
        }
        // Recursive Step: The function calls itself with a smaller problem.
        else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        int result = factorial(number);
        System.out.println("The factorial of " + number + " is " + result); // Output: 120
    }
}
