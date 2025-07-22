import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayProblems1 {
    static int maxArrayElement(int array[]){
        //First is to sort the array

        if(array.length < 2){
            System.out.println("Not enough elements");
            return 0;
        }
        Arrays.sort(array); 
        //Then return the last element
        
        // System.out.println("Max Element = " + array[array.length-1]);
        return array[array.length-1];

    }

    static int minArrayElement(int array[]){
        //First is to sot the array
        if(array.length < 2){
            System.out.println("Not enough elements");
            return 0;
        }

        Arrays.sort(array);

        //Then return the first element
        // System.out.println("Min Element = " + array[0]);
        return array[0];
    }

    static int reverseArray(int array[]){
        //First is to reverse the array
        if(array.length < 2){
            System.out.println("Not enough elements");
            return 0;
        }

        int n = array.length;

        for(int i = 0; i < n/2; i++){
            int temp = array[i];
            array[i] = array[n-i-1];
            array[n-i-1] = temp;
        }

        //Then return the reversed array
        System.out.println("Reversed Array = " + Arrays.toString(array));
        return 0;
    }

    static int arrayElementSum(int array[]){
        if(array.length < 2){
            System.out.println("Not enough elements");
            return 0;
        }

        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return sum;
    }

    static int countEvenOddElement(int array[]){
        if(array.length < 2){
            System.out.println("Not enough elements");
            return 0;
        }

        int Ecount = 0;
        int Ocount = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 == 0){
                Ecount++;
            }else{
                Ocount++;
            }
        }
        System.out.println("Even Count = " + Ecount);
        System.out.println("Odd Count = " + Ocount);

        return 0;
    }

    static int alternatePositionElement(int array[]){
        if(array.length < 2){
            System.out.println("Not enough elements");
            return 0;
        }

        for(int i = 0; i < array.length; i++){
            if(i % 2 == 0){
                System.out.print(array[i] + " ");
            }
        }
        
        return 0;
    }

    static int secondLargestElement(int array[]){
        if(array.length < 2){
            System.out.println("Not enough elements");
            return 0;
        }

        Arrays.sort(array);
        System.out.println("Second Largest Element = " + array[array.length-2]);
        return 0;
    }

    static int secondMinElement(int array[]){
        if(array.length < 2){
            System.out.println("Not enough elemenr");
            return 0;
        }

        Arrays.sort(array);
        System.out.println("Second Smallest Element = " + array[1]);
        return 0;
    }

    static int kthLargestElement(int array[], int k){
        if(array.length < 2){
            System.out.println("Not enough elements");
            return 0;
        }
        Arrays.sort(array);
        System.out.println(k + "th Largest Element = " + array[array.length-k]);
        return 0;
    }

    static int[] mergeTwoArrays(int array[], int array2[]){
        if(array.length < 2 || array2.length < 2){
            System.out.println("Not enough elements");
            return null;
        }

        int n = array.length;
        int m = array2.length;
        int result[] = new int[n+m];

        for(int i = 0; i < n; i++){
            result[i] = array[i];
        }

        for(int i = 0; i < m; i++){
            result[n+i] = array2[i];
        }

        return result;
    }

    static int arraySortedOrNot(int array[]){
        if(array.length < 2){
            System.out.println("Not enough elements");
            return 0;
        }

        for(int i =0; i < array.length-1; i++){
            if(array[i] > array[i+1]){
                System.out.println("Array is not sorted");
                return 0;
            }
        }

        System.out.println("Array is sorted");
        return 0;
    }

    static int arrayRightRotateion(int array[]){
        if(array.length < 2){
            System.out.println("Not enough elements");
            return 0;
        }

        //Explaination
        // 1. Store the last element in a temp variable
        // 2. Shift all the elements to the right
        // 3. Store the temp variable in the first position
        // 4. Print the array
        // 5. Done
        // Time Complexity = O(n)
        // Space Complexity = O(1)
        // n = number of elements in the array

        int n = array.length;
        int temp = array[n-1];

        //explain this loop
        // 1. Start from the last element
        // 2. Move the element to the right
        // 3. Repeat until the first element
        // 4. Done

        for(int i = n-1; i > 0; i--){
            array[i] = array[i-1];
        }
        array[0] = temp;

        System.out.println("Right Rotated Array = " + Arrays.toString(array));

        return 0;
    }

    static int arrayLength(int array[]){
        if(array.length < 2){
            System.out.println("Not enough elements");
            return 0;
        }

        return array.length;
    }

    static int largestSumContiguousSubarray(int array[]){
        //Kadane's Algorithm
        //Explaination
        // 1. Initialize two variables max_so_far and max_ending_here to 0
        // 2. Loop through the array
        // 3. Add the current element to max_ending_here
        // 4. If max_ending_here is less than 0, set it to 0
        // 5. If max_so_far is less than max_ending_here, set max_so_far to max
        // 6. Done
        // Time Complexity = O(n)
        // Space Complexity = O(1)
        // n = number of elements in the array
        
        int n = array.length;
        
        arrayLength(array);
                
        int max_so_far = 0, max_ending_here = 0;
        
        //Explain this loop
        // 1. Loop through the array
        // 2. Add the current element to max_ending_here
        // 3. If max_ending_here is less than 0, set it to 0
        // 4. If max_so_far is less than max_ending_here, set max_so_far to max
        // 5. Done

        //Example array = [-2, -3, 4, -1, -2, 1, 5, -3]
        for(int i =0; i < n; i++){
            max_ending_here = Math.max(array[i], max_ending_here + array[i]);
            max_so_far = Math.max(max_so_far, max_ending_here);
        }
        System.out.println("Largest Sum Contiguous Subarray = " + max_so_far);
        return max_so_far;
        
    }

    static int arrayLeftRotation(int array[]){
        arrayLength(array);

        int n = array.length;

        int temp = array[0];

        for(int i = 0; i < n-1; i++){
            array[i] = array[i+1];
        }

        array[n-1] = temp;

        System.out.println("Left Rotated Array = " + Arrays.toString(array));
        return 0;

    }
    
    static int arrayLeftRotationByK(int array[], int k){
        arrayLength(array);

        int n = array.length;
        
        for(int i = 0; 1 < k; i++){
            int temp = array[0];
            for(int j = 0; j < n-1; j++){
                array[j] = array[j-1];

            }
            array[n-1] = temp;

        }

        System.out.println("Left Rotated Array = " + Arrays.toString(array));
        return 0;
    }

    static int arrayElementFrequency(int array[]){
        arrayLength(array);

        int n = array.length;

        //Explaination
        // 1. Loop through the array
        // 2. Count the frequency of each element
        // 2.1 If the element is already counted, skip it
        // 2.2 If the element is not counted, count it
        // 2.3 Set the element to -1
        // 2.4 Done
        // 3. Print the element and its frequency
        // 4. Done
        // Time Complexity = O(n^2)
        //Explain Time Complexity = O(n^2) 
        // = O(n) * O(n)
        // = O(n) * O(n-1)
        // = O(n) * O(n-2)
        
        // Space Complexity = O(1)
        // n = number of elements in the array

        for(int i = 0; i < n; i++){
            int count = 1;
            for(int j = i+1; j < n; j++){
                if(array[i] == array[j]){
                    count++;
                    array[j] = -1;
                }
            }
            if(array[i] != -1){
                System.out.println(array[i] + " : " + count);
            }
        }
        return 0;
    }

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
        try {
            System.setIn(new FileInputStream("input.txt"));
            System.setOut(new PrintStream(new FileOutputStream("output.txt")));
        } catch (Exception e) {
            System.out.println("Error");
        }

        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the value of k");
        // int k = sc.nextInt();


        int t = sc.nextInt();
        int array[] = new int[t];
        // int array2[] = new int[t];

        for (int i = 0; i < t; i++) {
            array[i] = sc.nextInt();
            // array2[i] = sc.nextInt();
        }

        // System.out.println(maxArrayElement(array));
        // System.out.println(minArrayElement(array));
        // reverseArray(array);
        // System.out.print(arrayElementSum(array));
        // countEvenOddElement(array);
        // alternatePositionElement(array);
        // secondLargestElement(array);
        // secondMinElement(array);
        // kthLargestElement(array, k);
        // int[] mergedArray = mergeTwoArrays(array2, array);
        // System.out.println("Merged Array = " + Arrays.toString(mergedArray));
        // arraySortedOrNot(array);
        // arrayRightRotateion(array);
        // largestSumContiguousSubarray(array);
        // arrayLeftRotation(array);
        // arrayLeftRotationByK(array, k);
        // arrayElementFrequency(array);
        System.out.println(arraycount(array));


        sc.close();
    }
}
