/**
 * */

package IBMHackerRankSampleProb;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'getOneBits' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER n as parameter.
     */

    public static List<Integer> getOneBits(int n) {
        // Write your code here
        String binaryString = Integer.toBinaryString(n);

        List<Integer> positions = new ArrayList<>();
        for(int i = 0; i < binaryString.length(); i++){
            if(binaryString.charAt(i) == '1'){
                positions.add(i+1);
            }
        }

        List<Integer> result = new ArrayList<>();
        result.add(positions.size());
        result.addAll(positions);
        return result;

    }

}

public class CountingBits {
    public static void main(String[] args) throws IOException {
        // Using String Buffer for more functions
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        // Creating an list variable
        List<Integer> result = Result.getOneBits(n);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining("\n"))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}

