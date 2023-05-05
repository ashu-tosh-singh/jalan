import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = {-4, 1, 3, -2, -1};
        System.out.println(Arrays.toString(findZeroSum(arr)));
    }

    public static int[] findZeroSum(int[] arr) {
        Map<Integer, Boolean> seenValues = new HashMap<>();

        for (int value : arr) {
            if (seenValues.containsKey(-value)) {
                return new int[]{value, -value};
            } else {
                seenValues.put(value, true);
            }
        }

        return new int[]{};
    }
}
