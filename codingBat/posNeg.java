package codingBat;

public class posNeg {
    static void main() {
        IO.println(posNeg(-1,1,true));
    }
    public static boolean posNeg(int a, int b, boolean negative) {
        return (a < 0 || b < 0 || !negative);
    }
}
