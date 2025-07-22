import java.util.Scanner;

public class NumberToWords {
    //Here in this problem the Aim is to Convert a number into its English Name
    //For Example 1 = One, 15 = Fifteen, 132 = One Hundred Thirty Two,... 90000000000 = Ninety Billion
     
        private static final String[] ones = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Eighteen", "Nineteen"};
        private static final String[] tens = {"", "", "Twenty", "Thirty", "Fourty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
        private static final String[] hundreds = {"", "One Hundred", "Two Hundred", "Three Hundred", "Four Hundred", "Five Hundred", "Six Hundred", "Seven Hundred", "Eight Hundred", "Nine Hundred"};

    public static String convertThreeDigits(int num) {
        if (num < 20) return ones[num];
        if (num < 100) return tens[num / 10] + (num % 10 != 0 ? " " + ones[num % 10] : "");
        return hundreds[num / 100] + (num % 100 != 0 ? " " + convertThreeDigits(num % 100) : "");
    }

    public static String convertNumberToWords(int num) {
        if (num == 0) return "Zero";

        String result = "";
        int billion = num / 1000000000;
        int million = (num % 1000000000) / 1000000;
        int thousand = (num % 1000000) / 1000;
        int remaining = num % 1000;

        if (billion != 0) result += convertThreeDigits(billion) + " Billion ";
        if (million != 0) result += convertThreeDigits(million) + " Million ";
        if (thousand != 0) result += convertThreeDigits(thousand) + " Thousand ";
        if (remaining != 0) result += convertThreeDigits(remaining);

        return result.trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number to Convert into their English version : ");
        int num = sc.nextInt();

        System.out.println(convertNumberToWords(num)); // One Hundred Twenty-Three
     
        sc.close();
    }
}