public class CountElementByPreviousGreater {
    static int arraycount(int arr[]) {
        if(arr.length == 0) {
            return 0;
        }
        
        int count = 1;  // Start with 1 to count first element
        int maxSoFar = arr[0];  // Track maximum value seen so far
        
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > maxSoFar) {
                count++;
                maxSoFar = arr[i];  // Update max when we find a bigger element
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        int[] arr = {7,4,8,2,9};
        System.out.println(arraycount(arr));  // Will print 3
    }
}
