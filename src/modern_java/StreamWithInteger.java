package modern_java;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class StreamWithInteger {


    public static OptionalInt getMin(int[] arr) {
        return IntStream.of(arr).min();
    }

    public int[]  sortAndFilter(int[] arr) {
        return IntStream.of(arr)
                .filter(value -> value % 2 == 0)
                .sorted()
                .toArray();
    }

    public static void main(String[] args) {
        System.out.println(getMin(new int[]{1,2,3, 6,7}).getAsInt());

    }
}
