public class FrontBack {
    static void main() {

        while(true) {
            IO.print("Enter a String: ");
            String str = IO.readln();
            IO.println(frontBack(str));
            char choice = IO.readln("Continue [y/n]: ").charAt(0);
            if(choice == 'n' || choice == 'N') break;
        }
    }
    public static String frontBack(String str) {
        if(str.length() <= 1) return str;

        char first = str.charAt( str.length()-1);
        char last = str.charAt(0);
        String middle = str.substring(1, str.length()-1);

        return first+middle+last;
    }
}
