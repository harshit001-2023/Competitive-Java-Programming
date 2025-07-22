/*
    // Number Manipulation
    // 1. Check if a result is a perfect square.
    // 2. Find the sum of squares of digits.
    // 3. Count the result of zeros in a result.
    // 4. Swap two numbers without using a temporary variable.
    // 5. Check if a result is a Harshad result (divisible by the sum of its digits).
    // Digit Operations
    // 6. Find the maximum and minimum digit sum.
    // 7. Check if all digits are unique.
    // 8. Count the result of digits that are divisible by 3.
    // 9. Replace all occurrences of a digit with another.
    // 10. Find the difference between the sum of even-indexed and odd-indexed digits.
    // Number Patterns
    // 11. Check if a result is a magic result (sum of its digits is 9).
    // 12. Find the nth term of a geometric progression.
    // 13. Check if a result is a palindrome in binary.
    // 14. Find the sum of the first n natural numbers.
    // 15. Check if a result is a triangular result.
    // Prime Numbers
    // 16. Check if a result is a prime result using trial division.
    // 17. Find the next prime result.
    // 18. Check if a result is a composite result.
    // Miscellaneous
    // 19. Check if two numbers are coprime (gcd is 1).
    // 20. Find the sum of the factors of a result.
    // 21. Check if a result is a power of 2.
    // 22. Find the largest factor of a result.
    // 23. Check if a result is a perfect cube.
    // 24. Find the sum of the digits of a factorial.
    // 25. Check if a result is an automorphic result.
     */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Code1 {
    //Number Manipulation
    static void perfectSquare(int num){
        double sqrt = Math.sqrt(num);
        System.out.println(sqrt);
        double perfectSquare = sqrt - Math.floor(sqrt);
         if(perfectSquare == 0){
            System.out.println("Perfect Square");
         } else {
            System.out.println("Not Perfect Square");
         } 
    }
    static void digitSquareSum(int num){
        int sqsum = 0;

        while(num>0){
            int digit = num % 10;
            sqsum = sqsum + (digit * digit);
            num /= 10;
        }

        System.out.println(sqsum);
    }
    static void countNumberOfZeros(int num){
        int count = 0;

        while(num>0){
            int digit = num % 10;
            if(digit == 0) count++;
            num /= 10;
        }
        System.out.println(count);
    }
    static void swapWithTwoDigits(int num, int num1){
        // num = num - num1;
        // num1 = num + num1;
        // num = num1 - num;
        num = (num + num1) - (num1 = num);

        System.out.println(num);
        System.out.println(num1);
    }
    static void harshadNumber(int num){
        int sumDivide = 0, digitsum = 0;
        int original = num;

        while(num!=0){
            int digit = num % 10;
            digitsum += digit;
            num /= 10;
        }
        sumDivide = original % digitsum;
        System.out.println(digitsum);
        System.out.println(sumDivide);
        if(sumDivide == 0){
            System.out.println("Harshad Value");
        } else {
            System.out.println("Not Harshad");
        }
    }
    //Number Patterns
    static void magicNumber(int num){
        //Sum of Digit is 9

        int sum = 0;

        while(num>0){
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        if(sum == 9){
            System.out.println("Magic Number");
        } else {
            System.out.println("Not");
        }
    }
    static void MaxMinDigitSum(int a){
        int max =0, min = 9;
        
        while(a>0){
            int digit = a % 10;
            if(digit > max){
                max = digit;
            }
            if(digit < min){
                min = digit;
            }
            a /= 10;
        }
        System.out.println("Max: "+max+" Min: "+min+" Sum: "+(max+min));
    }
    static void MaxMinDigitSum1(int a) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        
        while (a > 0) {
            int digit = a % 10;
            max = Math.max(max, digit);
            min = Math.min(min, digit);
            a /= 10;
        }
        System.out.println("Max: " + max + " Min: " + min + " Sum: " + (max + min));
    }
    static void digitsUniqueOrNot(int num){
        boolean digits[] = new boolean[10];

        while(num>0){
            int digit = num % 10;

            if(digits[digit]){
                System.out.println("Not Unique");
                return;
            }
            digits[digit] = true;
            num /= 10;
        }
        System.out.println("Unique");
    }
    static void countDigitsDivisibleBy3(int num){
        int count = 0;

        while(num>0){
            int digit = num % 10;
            if(digit%3==0){
                count++;
            }
            num /= 10;
        }
        System.out.println(count);
    }
    static void replaceAllOccurances(int num){
        int toReplace = 4, replaceWith = 1, result=0, result1=0;

        while(num>0){
            int digit = num % 10;

            if(digit == toReplace){
                digit = replaceWith;
                
            }
            result = (digit + result * 10);
            num /= 10;
        }
        while(result>0){
            int digit = result % 10;
            result1 = (digit + result1 * 10);
            result /= 10;
        }
        System.out.println(result1);
    }
    static void isTriangular(int num){
        //10
        int sum = 0;
        int i = 1;

        while (sum < num) {
            sum = sum + i;
            i++;
        }
        if (sum == num) {
            System.out.println("Number is Triangular");
            int count = 1;
            for (int j = 0; j < i - 1; j++) {
                for (int k = 0; k <= j; k++) {
                    System.out.print("* ");
                    if (count == num) {
                        return;
                    }
                    count++;
                }
                System.out.println();
            }
        } else {
            System.out.println("Not Triangular");
        }
    }



    public static void main(String[] args) {
        try{
            System.setIn(new FileInputStream("input.txt"));
            System.setOut(new PrintStream(new FileOutputStream("output.txt")));
        } catch (Exception e){
            System.out.println("Error");
        }

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i = 0; i < t; i++){
            int num = sc.nextInt();
            // int num1 = sc.nextInt();

            // perfectSquare(num);
            // digitSquareSum(num);
            // countNumberOfZeros(num);
            // swapWithTwoDigits(num, num1);
            // harshadNumber(num);
            // magicNumber(num);
            // MaxMinDigitSum(num);
            // MaxMinDigitSum1(num);
            // digitsUniqueOrNot(num);
            // countDigitsDivisibleBy3(num);
            // replaceAllOccurances(num);
            isTriangular(num);

        }

        sc.close();
    }
}
