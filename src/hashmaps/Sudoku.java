package hashmaps;
import java.util.HashSet;

public class Sudoku {
    public boolean VerifySudokuBoard(int[][] board) {
        // criar um array de hashsets int para colocar rows
        // criar um array de hashsets int para colocar columns
        // criar um array de hashsets int para colocar os subgrids

        //step 1: declarar a porra toda
        HashSet<Integer>[] rows = new HashSet[9];
        HashSet<Integer>[] columns = new HashSet[9];
        HashSet<Integer>[][] boxes = new HashSet[3][3];

        //step 2: instanciar os hashsets
        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            columns[i] = new HashSet<>();
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                boxes[i][j] = new HashSet<>();
            }
        }

        for (int r = 0 ; r < board.length; r++) {
            for (int c = 0; c < board[r].length; c++) {
                //se for zero, continua pq nao preciso validar
                if (board[r][c] == 0)
                    continue;
                // nesse loop eu estou percorrendo cada item do meu sudoku
                // esse item pertence a uma coluna C e uma linha R
                int num = board[r][c];
                // nessa linha fazemos exatamente o seguinte:
                // verifico se em rows na coluna R tenho um num igual a esse
                if (rows[r].contains(num)) return false;
                //adiciono no hash
                rows[r].add(num);
                if (columns[r].contains(num)) return false;
                columns[c].add(num);

                int boxRow = r/3;
                int boxCol = c/3;
                if (boxes[boxRow][boxCol].contains(num)) return false;
                boxes[boxRow][boxCol].add(num);
            }
        }
        return false;
    }
}
