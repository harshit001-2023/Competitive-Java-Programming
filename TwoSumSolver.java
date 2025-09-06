import java.util.Arrays;

public class TwoSumSolver {
    public static int[] twoSum(int[] numbers, int target) {
        // Step 1: Set up the pointers
        int left = 0;
        int right = numbers.length - 1;

        // Step 2: Loop until the pointers meet
        while (left < right) {
            // Step 3: Calculate the sum
            int sum = numbers[left] + numbers[right];

            // Step 4: Make a decision
            if (sum > target) {
                // Sum is too high, move the right pointer left
                right--;
            } else if (sum < target) {
                // Sum is too low, move the left pointer right
                left++;
            } else {
                // Sum is exactly the target, we found it!
                // Return the 1-based indices
                return new int[]{left + 1, right + 1};
            }
        }

        // This part should not be reached since a solution always exists
        return new int[]{};
    }

    public static void main(String[] args){
        int[] numbers = {1, 3, 5, 8, 9, 11};
        int target = 10;

        System.out.println(Arrays.toString(TwoSumSolver(numbers, target)));
    }
}