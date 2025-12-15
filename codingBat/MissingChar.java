package codingBat;

public class MissingChar {
    static void main() {
        // Input and Printing Result
        String str = IO.readln("Enter a word: ");
        int n = Integer.parseInt(IO.readln("Enter a num: "));
        IO.println(missingChar(str, n));
    }


    public static String missingChar(String str, int n) {
        // Edge case if Num is more than String size then error
        if(n >= str.length()) {
            System.err.println("Enter valid number according to String size.");
            System.exit(0);
        }
        // Calculating front
        // Ex. str = Mission, n = 2
        String front = str.substring(0,n); // 0,n = 0,2 = front : Mi
        String back = str.substring((n+1),str.length()); // 2+1, 7 = 3,7= back : sion
        return front + back; // Mi + sion = Mision
    }

}
