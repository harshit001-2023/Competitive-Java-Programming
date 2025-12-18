/*
* Given a string, return true if the string starts with "hi" and false otherwise.


* startHi("hi there") → true
* startHi("hi") → true
* startHi("hello hi") → false
* */

package codingBat;

public class StartWithHI {
    static void main(String[] args) {
        IO.println(startHi("Kitten Hi"));
    }

    public static boolean startHi(String str) {
        if(str.length() < 2) return false;
        else return (str.substring(0,2).equalsIgnoreCase("hi"));
    }
}
