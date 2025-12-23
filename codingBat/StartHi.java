package codingBat;

public class StartHi {
    static void main() {

    }
    public boolean startHi(String str) {
        if(str.length() < 2) return false;
        /*else if(str.substring(0,2).equals("hi")) return true;
        else return false;*/
        return str.startsWith("hi");
    }
}
