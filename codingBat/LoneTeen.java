package codingBat;

public class LoneTeen {
    static void main() {
        int a = Integer.parseInt(IO.readln("Enter first number: "));
    }
    public boolean loneTeen(int a, int b) {
        boolean aTeen = (a >= 13 && a <= 19);
        boolean bTeen = (b >= 13 && b <= 19);
        return (aTeen && !bTeen) || (!aTeen && bTeen);
    }
}
