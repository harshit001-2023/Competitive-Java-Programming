/*
startOz
prev  |  next  |  chance
Given a string, return a string made of the first 2 chars (if present), however include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".

startOz("ozymandias") → "oz"
startOz("bzoo") → "z"
startOz("oxx") → "o"

Expected	Run
startOz("ozymandias") → "oz"	"oz"	OK
startOz("bzoo") → "z"	"z"	OK
startOz("oxx") → "o"	"o"	OK
startOz("oz") → "oz"	"oz"	OK
startOz("ounce") → "o"	"o"	OK
startOz("o") → "o"	"o"	OK
startOz("abc") → ""	""	OK
startOz("") → ""	""	OK
startOz("zoo") → ""	""	OK
startOz("aztec") → "z"	"z"	OK
startOz("zzzz") → "z"	"z"	OK
startOz("oznic") → "oz"	"oz"	OK
*/

package codingBat;

public class startOz {
    static void main() {
        IO.println(startOz("ozymandias"));
    }
    public static String startOz(String str) {
        if(str.length() < 2) return str;
        else if(str.contains("oz")) return "oz";
        else if(str.charAt(1) == 'z') return "z";
        else if(str.charAt(0) == 'o') return "o";
        else return "";
    }

}
