package hashmaps;

import java.util.HashSet;

public class ContainsDuplicate {
    private static boolean checkDuplicate(int[][] matrix) {
        HashSet<Integer> numbers = new HashSet<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int number = matrix[i][j];
                if (numbers.contains(number)) return true;
                numbers.add(number);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] line1 = new int[]{1,2,3};
        int[] line2 = new int[]{9,5,-10};
        int[][] matrix = new int[][] {line1, line2};
        System.out.println(checkDuplicate(matrix));
    }
}
