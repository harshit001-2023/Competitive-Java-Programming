import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.Arrays;

public class ArrayProblems {
    static int findMax(int arr[]){
        if(arr.length == 0){
            System.out.println("Array is empty");
            return Integer.MIN_VALUE;
        }
            int max = Arrays.stream(arr).max().getAsInt();
            System.out.println("Maximum element: " + max);
            return max;
    }
    static int largestElementInArray(int arr[]){
        
        int largest = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }

        System.out.println("Largest Element = " +largest);
        return largest;
    }
    static int seconLargestELementInArray(int arr[]){
        //for non repeating elements
        if(arr.length < 2){
            System.out.println("Not enough elements");
            return 0;
        }
       
        Arrays.sort(arr);
        int largest = arr[arr.length-1];
        int secondLargest = Integer.MIN_VALUE;
        
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] < largest) {
                secondLargest = arr[i];
                break;
            }
        }

        if(secondLargest == Integer.MIN_VALUE){
            System.out.println("All values are same, no element is largest");
            return 0;
        }
        System.out.println("Second Largest = " +secondLargest);
        return secondLargest;

    }
    static int minElement(int arr[]){
        if(arr.length < 2){
            System.out.println("Not enough elements");
            return 0;
        }
        Arrays.sort(arr);
        System.out.println("Minimum element "+arr[0]);
        return arr[0];
    }
    static int minElement1(int arr[]){
        if(arr.length < 2){
            System.out.println("Not enough elements");
            return 0;
        }
        int min = arr[0];

        for(int i: arr){
            if(i < min){
                min = i;
            }
        }
        System.out.println("Minimum element " +min);
        return min;
    }
    static int minElement2(int arr[]){
        int min = Arrays.stream(arr).min().getAsInt();
        System.out.println(min);
        return min;
    }
    static int countEvenNumbers(int arr[]){
        int count = 0;
        for(int i : arr){
            if(i%2==0){
                count++;
            }
        }
        System.out.println("Even Numbers are "+count);
        return count;
    }
    static int countOddNumbers(int arr[]){
        int count = 0;
        for(int i : arr){
            if(i%2!=0){
                count++;
            }
        }
        System.out.println("Odd Numbers are "+count);
        return count;
    }
    static void reverseArray(int arr[]){
        for(int i = arr.length-1; i >= 0; i--){
            System.out.print(arr[i]);
            
        }
    }
    static int reverseArray1(int arr[]){
        int i = 0, j = arr.length -1, temp = 0;
        if(arr.length < 2){
            System.out.println("Not Enough Elements");
        }

        while(i < j){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
        System.out.print(" "+Arrays.toString(arr));
        return i;
    }
    static void findAllOccurrences(int arr[]){
        for(int num : arr){
            int count = 0;
            StringBuilder positions = new StringBuilder();
            for(int i = 0; i < arr.length; i++){
                if(arr[i] == num){
                    count++;
                    positions.append(i+1).append(" ");
                }
            }
                System.out.println(num + " occurs " + count + " times at positions " + positions.toString().trim());
            
        }
    }
    static void positinOfElement(int arr[]){
        int element = 12;

        for(int i= 0; i < arr.length; i++){
            if(arr[i] == element){
                int j = i + 1;
                System.out.println("Element found at " +j);
            }
        }
    }
    static int binarySearch(int arr[]){
        int toFind = 34;
        int low = 0, high = arr.length - 1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(arr[mid] == toFind){
                return mid;
                // System.out.println(mid);
            } else if(arr[mid] < toFind){
                low = mid + 1;
                // System.out.println(low);
            } else {
                high = mid - 1;
                // System.out.println(high);
            }
            
        }
        return -1;
    }


    public static void main(String[] args) {
        try {
            System.setIn(new FileInputStream("input.txt"));
            System.setOut(new PrintStream(new FileOutputStream("output.txt")));
        } catch (Exception e) {
            System.out.println("Error");
        }

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            // int num = sc.nextInt();


        }
        // findMax(arr);
        // largestElementInArray(arr);
        // seconLargestELementInArray(arr);
        // minElement(arr);
        // minElement1(arr);
        // minElement2(arr);
        // countEvenNumbers(arr);
        // countOddNumbers(arr);
        // reverseArray(arr);
        // findAllOccurrences(arr);
        // positinOfElement(arr);
        // System.out.println(binarySearch(arr));
       
        sc.close();
    }
}
