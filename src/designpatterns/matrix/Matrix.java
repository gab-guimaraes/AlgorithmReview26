package designpatterns.matrix;

public class Matrix {
    public static void main(String[] args) {
        int[][] myMatrix = {
                {1,0, 30},
                {2,3, 90},
                {9,10, 200}};

        printMatrix(myMatrix);
        System.out.println(sumMatrix(myMatrix));
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println(matrix[i][j]);
            }
        }
    }

    public static int sumMatrix(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }

    public int[] findInMatrix(Character[][] matrix, Character element) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j].equals(element)) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
