package TcsNqt;

/*Q4) For enhancing the book reading, the school distributed story books to students as part of the
Children’s Day celebrations. To increase the reading habit, the class teacher decided to exchange
the books every week so that everyone will have a different book to read. She wants to know how
many possible exchanges are possible.
If they have 4 books and students, the possible exchanges are 9. Bi is the book of i-th student and
after the exchange, he should get a different book, other than Bi.
B1 B2 B3 B4 – first state, before exchange of the books
B2 B1 B4 B3
B2 B3 B4 B1
B2 B4 B1 B3
B3 B1 B4 B2
B3 B4 B1 B2
B3 B4 B2 B1
B4 B1 B2 B3
B4 B3 B1 B2
B4 B3 B2 B1
Find the number of possible exchanges, if the books are exchanged so that every student will receive
a different book.
Constraints
1<= N <= 1000000
Input Format
Input contains one line with N, indicates the number of books and number of students.
Output Format
Output the answer modulo 100000007.
Refer the sample output for formatting
Sample Input :
4
Sample Output :
9*/

import java.util.Scanner;

public class DerangementProblem {
    public static final int MOD = 100000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // Handle base cases
        if (n == 0) {
            System.out.println(1);
        } else if (n == 1) {
            System.out.println(0);
        } else {
            // Create DP array
            long[] derangements = new long[n + 1];

            // Base cases
            derangements[0] = 1;  // !0 = 1
            derangements[1] = 0;  // !1 = 0

            // Fill the array using the recurrence relation
            for (int i = 2; i <= n; i++) {
                derangements[i] = ((i - 1) * (derangements[i - 1] + derangements[i - 2])) % MOD;
            }

            System.out.println(derangements[n]);
        }

        sc.close();
    }
}
