package codingBat;

public class Front3 {
    static void main() {
        while(true) {
            IO.print("Enter a String: ");
            String str = IO.readln();
            IO.println(front3(str));
            char choice = IO.readln("Continue [y/n]: ").charAt(0);
            if(choice == 'n' || choice == 'N') break;
        }
    }
    public static String front3(String str) {
        String sub = "";
        if(str.isEmpty()) return "";
        else if(str.length() <= 3) sub = str.substring(0, str.length());
        else sub = str.substring(0,3);

        String temp = "";
        for(int i = 0; i < 3; i++){
            temp = temp + sub;
        }
        return temp;
    }

}
