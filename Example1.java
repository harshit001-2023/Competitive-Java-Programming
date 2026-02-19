import java.util.Arrays;
import java.util.stream.IntStream;

void main() {
    int []arr = {10, 80, 6, 5, 20, 44, 66};
}

public static int arraySum(int[] arr) {
    return IntStream.of(arr).sum();
}