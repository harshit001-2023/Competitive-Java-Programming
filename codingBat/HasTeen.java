package codingBat;

public class HasTeen {
    static void main() {
        int a = Integer.parseInt(IO.readln("Enter second number: "));
        int b = Integer.parseInt(IO.readln("Enter first number: "));
        int c = Integer.parseInt(IO.readln("Enter third number: "));
        IO.println("Last Digits are same: "+hasTeen(a, b, c));
    }
    public static boolean hasTeen(int a, int b, int c) {
        return ((a >= 13 && a <= 19) || (b >= 13 && b <= 19) ||  (c >= 13 && c <= 19));
    }
}
