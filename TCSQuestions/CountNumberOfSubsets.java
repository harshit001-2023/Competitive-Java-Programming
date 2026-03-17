package TCSQuestions;

/*Q2) Given an array of integers and a sum, the task is to count all subsets of given array with sum
equal to given sum.
Input :
The first line of input contains an integer T denoting the number of test cases. Then T test
cases follow. Each test case contains an integer n denoting the size of the array. The next line
contains n space separated integers forming the array. The last line contains the sum.
Output :
Count all the subsets of given array with sum equal to given sum.
https://www.freshersnow.com/
NOTE: Since result can be very large, print the value modulo 109+7.
Constraints :
1<=T<=100
1<=n<=103
1<=a[i]<=103
1<=sum<=103
Example :
Input :
2
6
2 3 5 6 8 10
10
5
1 2 3 4 5
10
Output :
3
3
Explanation :
Testcase 1: possible subsets : (2,3,5) , (2,8) and (10)
Testcase 2: possible subsets : (1,2,3,4) , (2,3,5) and (1,4,5)
*/

import java.util.Scanner;

public class CountNumberOfSubsets {
    private static final int MOD = 1000000007;

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Read number of test cases
        int T = sc.nextInt();

        while (T-- > 0) {
            // Read array size
            int n = sc.nextInt();
            int[] arr = new int[n];

            // Read array elements
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // Read target sum
            int s = sc.nextInt();

            // DP array: dp[j] = number of subsets with sum j
            int[] dp = new int[s + 1];

            // Base case: empty subset has sum 0
            dp[0] = 1;

            // Process each element
            for (int i = 0; i < n; i++) {
                // Iterate backwards to avoid reusing the same element multiple times
                for (int j = s; j >= arr[i]; j--) {
                    dp[j] = (dp[j] + dp[j - arr[i]]) % MOD;
                }
            }

            // Print the result
            System.out.println(dp[s]);
        }

        sc.close();
    }
}