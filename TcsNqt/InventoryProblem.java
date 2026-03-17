package TcsNqt;

import java.util.Arrays;

public class InventoryProblem {

    public static void moveMultiplesOfTen(int[] arr) {

        int j = 0;  // position for non-multiple of 10

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 10 != 0) {

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                j++;
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {15, 20, 33, 40, 55, 60};

        moveMultiplesOfTen(arr);

        System.out.println(Arrays.toString(arr));
    }
}
