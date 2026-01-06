void main() {
    String str = IO.readln("Enter a String: ");
    IO.println("Number of xx are "+countXX(str));
}

public static int countXX(String str) {
    int count = 0;
    for(int i = 0; i < str.length() - 1; i++){
//      if(str.startsWith("xx", i))
        if(str.substring(i, i+2).equals("xx"))
            count++;
    }
    return count;
}
