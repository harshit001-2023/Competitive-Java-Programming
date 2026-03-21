public class ArrayProblems2 {
    public static void main(String[] args) {
        int[] arr = {10, 10, 10};
        System.out.println(getSecondLargest(arr));
    }

    public static int getSecondLargest(int[] arr) {
        //By using Filter Pass Approach
        int[] newArr = new int[arr.length];

        if (arr.length > 0) {
            // 1. Find the maximum (Initialize with the first element, not 0)
            int max = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max) max = arr[i];
            }

            // 2. Filter out the maximum
            int k = 0;
            for (int j : arr) {
                if (j != max) {
                    newArr[k] = j;
                    k++;
                }
            }

            // 3. Find the second max in the filtered array
            if (k == 0) return -1; // No second largest found (all numbers were the same)

            int newMax = newArr[0];
            for (int i = 1; i < k; i++) { // Only loop up to 'k' (the filled portion)
                if (newArr[i] > newMax) newMax = newArr[i];
            }
            return newMax;

        } else {
            return -1;
        }
    }

}
