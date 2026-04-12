package hashmaps;

import java.util.HashSet;

public class ZeroStripping {
    public int[][] matrixToZero(int [][] matrix) {
        HashSet<Integer> zeroRows = new HashSet<>();
        HashSet<Integer> zeroColumns = new HashSet<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    zeroRows.add(i);
                    zeroColumns.add(j);
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (zeroRows.contains(i) || zeroColumns.contains(j)) {
                    matrix[i][j] = 0;
                }
            }
        }
        return matrix;
    }
}
