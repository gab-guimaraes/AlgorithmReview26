package graphs.review;

public class CountIsland {

    public int countIsland(int[][] matrix) {
        int count = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1) {
                    count++;
                    dfs(i, j, matrix);
                }
            }
        }
        return count;
    }

    public void dfs(int i, int j, int[][] matrix) {
        if (i < 0 || j < 0 ||
                i >= matrix.length || j >= matrix[0].length ||
                matrix[i][j] != 1) {
            return;
        }
        matrix[i][j] = -1;
        dfs(i - 1, j, matrix);
        dfs(i + 1, j, matrix);
        dfs(i, j + 1, matrix);
        dfs(i, j - 1, matrix);
    }
}