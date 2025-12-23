package codingBat;

public class LastDigit {
    private static int a;

    static void main() {
        int a = Integer.parseInt(IO.readln("Enter an number: "));
        int b = Integer.parseInt(IO.readln("Enter an number: "));
        IO.println("Last Digits are same: "+lastDigit(a, b));
    }

    public static boolean lastDigit(int a, int b) {
        return (a%10) == (b%10);
    }
}
