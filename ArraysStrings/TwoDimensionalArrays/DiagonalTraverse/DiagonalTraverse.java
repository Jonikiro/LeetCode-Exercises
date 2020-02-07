import java.util.ArrayList;
import java.util.Collections;

public class DiagonalTraverse {
    public static void main(String[] args) {
        DiagonalTraverse dt = new DiagonalTraverse();
        dt.go();
    }

    public void go() {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};

        for (int x : diagonalTraverse(matrix)) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public int[] diagonalTraverse(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return new int[0];
        }

        int rows = matrix.length;
        int columns = matrix[0].length;
        int[] result = new int[rows * columns];
        int k = 0;
        ArrayList<Integer> intermediate = new ArrayList<Integer>();

        for (int diagonal = 0; diagonal < rows + columns - 1; diagonal++) {
            intermediate.clear();

            // Runs through the heads of the columns,
            // before running through the tails of the rows.
            int r = diagonal < columns ? 0 : diagonal - columns + 1;
            int c = diagonal < columns ? diagonal : columns - 1;

            // Takes a value, then moves index down a row and left a column.
            while (r < rows && c > -1) {
                intermediate.add(matrix[r][c]);
                ++r;
                --c;
            }

            // Reverses to account for zig-zag pattern
            if (diagonal % 2 == 0) {
                Collections.reverse(intermediate);
            }

            // Adds intermediate values to result array
            for (int i = 0; i < intermediate.size(); i++) {
                result[k++] = intermediate.get(i);
            }
        }
        return result;
    }
}