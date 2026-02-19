import java.util.stream.IntStream;

void main() {
    int []arr = {10, 80, 6, 5, 20, 44, 66};

    int sum = IntStream.of(arr).sum();
    IO.println(sum);
}