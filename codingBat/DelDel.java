package codingBat;

public class DelDel {
    static void main() {
        String str = IO.readln();
        IO.println(delDel(str));
    }

    private static String delDel(String str) {
/*        if(str.toLowerCase().contains("del".toLowerCase())){
            return str.replaceFirst("del", "");
        }else return str;*/
        if (str.length()>=4 && str.startsWith("del", 1)) {
            // First char + rest of string starting at 4
            return str.charAt(0) + str.substring(4);
        }
        // Otherwise return the original string.
        return str;
    }
}
