import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.*;

public class LeetCode {
    static int NumberOfStepsToZero(int num){
        //1342. Number of Steps to Reduce a Number to Zero
        /*In one step, if the current number is even, 
        you have to divide it by 2, otherwise, 
        you have to subtract 1 from it.
        
        Example 1:

            Input: num = 8
            Output: 4
            Explanation: 
            Step 1) 8 is even; divide by 2 and obtain 4. 
            Step 2) 4 is even; divide by 2 and obtain 2. 
            Step 3) 2 is even; divide by 2 and obtain 1. 
            Step 4) 1 is odd; subtract 1 and obtain 0.
        */
        int steps = 0;

        while(num > 0){
            if(num % 2 == 0){
                num /= 2;
            } else{
                num--;
            }

            steps++;
        }
        System.out.println(steps);
        return steps;
    }

    static List<String> FizzBuzz(int num){
        /*Given an integer n, return a string array answer (1-indexed) where:

            answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
            answer[i] == "Fizz" if i is divisible by 3.
            answer[i] == "Buzz" if i is divisible by 5.
            answer[i] == i (as a string) if none of the above conditions are true.
           
            Example 1:

                Input: n = 3
                Output: ["1","2","Fizz"]
         */
        List<String> answer = new ArrayList<>(num);
        
        for(int i = 1; i <= num; i++){
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            if(divisibleBy3 && divisibleBy5){
                answer.add("FizzBuzz");

            } else if(divisibleBy3){
                answer.add("Fizz");

            } else if(divisibleBy5){
                answer.add("Buzz");
            } else{
                answer.add(String.valueOf(i));
            }
        }
        System.out.println(answer);
        return answer;
    }

    static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, arr, 0, nums1.length);
        System.arraycopy(nums2, 0, arr, nums1.length, nums2.length);
        Arrays.sort(arr);

        int n = arr.length;
        if (n % 2 == 0) {
            // Even length, average two middle elements
            System.out.println("Median = "+(arr[n / 2 - 1] + arr[n / 2]) / 2.0);
            return (arr[n / 2 - 1] + arr[n / 2]) / 2.0;
        } else {
            // Odd length, return middle element
            System.out.println("Median = "+arr[n / 2]);
            return arr[n / 2];
        }
    }

    static int maxFrequency(int[] nums, int k, int numOperations) {
       
        /* 
         Problem3347. Maximum Frequency of an Element After Performing Operations II
            Solved
            Hard
            Topics : Array, Binary Search, Sliding Window, Sorting, Prefix Sum
            Companies
            
            Hint
            You are given an integer array nums and two integers k and numOperations.

            You must perform an operation numOperations times on nums, where in each operation you:

            Select an index i that was not selected in any previous operations.
            Add an integer in the range [-k, k] to nums[i].
            Return the maximum possible frequency of any element in nums after performing the operations.
            
            Example 1:

            Input: nums = [1,4,5], k = 1, numOperations = 2

            Output: 2

            Explanation:

            We can achieve a maximum frequency of two by:

            Adding 0 to nums[1], after which nums becomes [1, 4, 5].
            Adding -1 to nums[2], after which nums becomes [1, 4, 4].
        */  


        int n = nums.length, ans = 0, left = 0, right = 0;
        Arrays.sort(nums);

        HashMap<Integer, Integer> count = new HashMap<>();
        for(int num : nums) count.put(num, count.getOrDefault(num, 0) + 1);

        for(int mid = 0; mid < n; mid++) {
            while(nums[mid] - nums[left] > k) {
                left++;
            }

            while(right < n - 1 && nums[right + 1] - nums[mid] <= k) {
                right++;
            }

            int total = right - left + 1; 
            ans = Math.max(ans, Math.min(total - count.get(nums[mid]), numOperations) + count.get(nums[mid]));
        }

        left = 0;
        for(right = 0; right < n; right++) {
            int mid = (nums[left] + nums[right]) / 2;

            while(mid - nums[left] > k || nums[right] - mid > k) {
                left++;
                mid = (nums[left] + nums[right]) / 2;
            }
            ans = Math.max(ans, Math.min(right - left + 1, numOperations));
        }

        return ans;
    }


public static void main(String args[]){
    try{
        System.setIn(new FileInputStream("input.txt"));
        System.setOut(new PrintStream(new FileOutputStream("output.txt")));
    } catch(Exception e){
        System.out.println("Error");
    }

        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
        int nums1[] = new int[t];
        int nums2[] = new int[t];

        // NumberToWords english =  new NumberToWords();


		for (int i = 0; i < t; i++) {
			// int num = sc.nextInt();
            nums1[i] = sc.nextInt();
            nums2[i] = sc.nextInt();
                
		}
        findMedianSortedArrays(nums1, nums2);
        // NumberOfStepsToZero(num);
        // FizzBuzz(num);
        //Problem3347
        int[] nums = {1, 4, 5};
        maxFrequency(nums, 1, 2);
        
		sc.close();
    }
}