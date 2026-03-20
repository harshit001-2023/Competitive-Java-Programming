package TcsNqt;

/*Calculate gym membership according to the given months, membership as follows 1 */

import java.util.Scanner;

public class GymMembershipCostCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Check if input is an integer
        if (sc.hasNextInt()) {
            int months = sc.nextInt();

            // Map the months to prices
            switch (months) {
                case 1:
                    System.out.println(2000);
                    break;
                case 3:
                    System.out.println(5000);
                    break;
                case 6:
                    System.out.println(9000);
                    break;
                case 12:
                    System.out.println(16000);
                    break;
                default:
                    // Any other number of months is an error
                    System.out.println("Error");
            }
        } else {
            System.out.println("Error");
        }
        sc.close();
    }
}
