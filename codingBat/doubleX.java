void main() {
    String str = IO.readln("Enter a String: ");
    IO.println("Number of xx are "+doubleX(str));
}

boolean doubleX(String str) {
    int i = str.indexOf("x");
    if (i == -1) return false;
    if (i+1 >= str.length()) return false; // check i+1 in bounds?
    return str.substring(i+1, i+2).equals("x");
//    return str.charAt(i + 1) == 'x';
//     String x = str.substring(i);
//     return x.startsWith("xx");
}