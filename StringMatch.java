void main() {
    IO.println(stringMatch("xxcaazz", "xxbaaz"));
}

/*
Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring. So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place in both strings.
stringMatch("xxcaazz", "xxbaaz") → 3
stringMatch("abc", "abc") → 2
stringMatch("abc", "axc") → 0*/
public int stringMatch(String a, String b) {
    int len = Math.min(a.length(), b.length());
    int count = 0;

    for(int i = 0; i < len-1; i++){
        String aSub = a.substring(i, i+2);
        String bSub = b.substring(i, i+2);

        if(aSub.equals(bSub)) count++;
    }

    return count;
}


public String stringX(String str) {
    String result = "";
    for (int i=0; i<str.length(); i++) {
        // Only append the char if it is not the "x" case
        if (!(i > 0 && i < (str.length()-1) && str.substring(i, i+1).equals("x"))) {
            result = result + str.substring(i, i+1); // Could use str.charAt(i) here
        }
    }
    return result;
}