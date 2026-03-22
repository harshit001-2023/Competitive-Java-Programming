import java.util.Arrays;

void main() {
    int[] arr = {8, 7, 5, 0, 3, 0, 0, 2, 3, 0, 2,};

    IO.println(Arrays.stream(arr).average().getAsDouble());
}