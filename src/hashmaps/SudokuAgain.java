package hashmaps;


import java.util.ArrayList;
import java.util.HashSet;

public class SudokuAgain {
    public boolean verifySudoku(int[][] sudoku) {
        //2 arrays de hashsets para linha/coluna
        //1 array de hashset para subsets

        ArrayList<HashSet<Integer>> rows = new ArrayList<>();
        ArrayList<HashSet<Integer>> columns = new ArrayList<>();
        HashSet<Integer>[][] subgrid = new HashSet[3][3];

        for (int i = 0; i < 9; i++) {
            rows.add(new HashSet<>());
            columns.add(new HashSet<>());
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                subgrid[i][j] = new HashSet<>();
            }
        }

        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku[i].length; j++) {
                int num = sudoku[i][j];
                if (num == 0) continue;
                if (rows.get(i).contains(num)) return false;
                if (columns.get(i).contains(num)) return false;
                if (subgrid[i/3][j/3].contains(num)) return false;
                rows.get(i).add(num);
                columns.get(i).add(num);
                subgrid[i/3][j/3].add(num);
            }
        }
        return true;
    }
}
