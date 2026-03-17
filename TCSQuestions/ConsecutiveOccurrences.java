package TCSQuestions;

/*
* Q1) Given an array of integers where every element appears even number of times except one
element which appears odd number of times, write a program to find that odd occurring element
in O(log n) time. The equal elements must appear in pairs in the array but there cannot be more
than two consecutive occurrences of an element.

For example :
3
2 3 2
It doesn't have equal elements appear in pairs
7
1 1 2 2 2 3 3
It contains three consecutive instances of an element.
5
2 2 3 1 1
It is valid and the odd occurring element present in it is 3.
Enter only valid inputs.

Sample Input :
5
2 2 3 1 1
Sample Output :
3
*/

import java.util.*;

public class ConsecutiveOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Check if array length is valid
        if (n == 1) {
            System.out.println(arr[0]);
            return;
        }

        // Check first element
        if (arr[0] != arr[1]) {
            System.out.println(arr[0]);
            return;
        }

        // Check last element
        if (arr[n - 1] != arr[n - 2]) {
            System.out.println(arr[n - 1]);
            return;
        }

        // Binary search for the odd occurring element
        int left = 0, right = n - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if mid is the odd occurring element
            if (mid > 0 && mid < n - 1) {
                if (arr[mid] != arr[mid - 1] && arr[mid] != arr[mid + 1]) {
                    System.out.println(arr[mid]);
                    return;
                }
            }

            // Determine which half to search
            // If mid is even index (0-based), first occurrence of pair should be at even index
            if (mid % 2 == 0) {
                // If current element equals next element, odd element is in right half
                if (mid < n - 1 && arr[mid] == arr[mid + 1]) {
                    left = mid + 2; // Skip the pair
                } else {
                    right = mid - 1;
                }
            } else {
                // If mid is odd index, first occurrence should be at previous even index
                if (arr[mid] == arr[mid - 1]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
    }
}