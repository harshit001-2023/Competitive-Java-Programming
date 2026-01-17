void main() {
//    IO.println(stringMatch("xxcaazz", "xxbaaz"));
//    IO.println(stringX("xxHalxxlxoxx"));
//    IO.println(stringX1("x"));
//    IO.println(altPairs("abcdefghij"));
    IO.println(stringYak("pakyakya"));
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

/*
Given a string, return a version where all the "x" have been removed. Except an "x" at the very start or end should not be removed.
stringX("xxHxix") → "xHix"
stringX("abxxxcd") → "abcd"
stringX("xabxxxcdx") → "xabcdx"*/
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

//This is my solution
public String stringX1(String str) {
    if(str.isEmpty() || str.equals("x")) return str;
    if(str.charAt(0) == 'x' && str.endsWith("x")){
        String newStr = str.replaceAll("[x]", "");
        return ("x".concat(newStr).concat("x"));
    }
    return (str.replaceAll("[x]", ""));
}

/*Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".
altPairs("kitten") → "kien"
altPairs("Chocolate") → "Chole"
altPairs("CodingHorror") → "Congrr"*/

public String altPairs(String str){
    String res = "";

    for(int i = 0; i < str.length(); i+=4){
        int end = i+2;
        if(end>str.length()){
            end = str.length();
        }
        res = res + str.substring(i, end);
    }
    return res;
}

/*Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are removed, but the "a" can be any char. The "yak" strings will not overlap.
stringYak("yakpak") → "pak"
stringYak("pakyak") → "pak"
stringYak("yak123ya") → "123ya"*/
public String stringYak(String str) {
    String result = "";

    for (int i=0; i<str.length(); i++) {
        // Look for i starting a "yak" -- advance i in that case
        if (i+2<str.length() && str.charAt(i)=='y' && str.charAt(i+2)=='k') {
            i =  i + 2;
        } else { // Otherwise do the normal append
            result = result + str.charAt(i);
        }
    }

    return result;
}