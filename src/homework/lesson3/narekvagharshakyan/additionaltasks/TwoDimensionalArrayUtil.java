package homework.lesson3.narekvagharshakyan.additionaltasks;



public class TwoDimensionalArrayUtil {

    public static void main(String[] args) {
        int[][] matrix = createSpiralMatrix(8);
        print(matrix);

    }

    /**
     * Initializes two dimensional array such as explained below:
     * For instance, if odd_size is 7 then the result should be
     * the matrix described below:
     * <p>
     * 31 30 29 28 27 26 49
     * 32 13 12 11 10 25 48
     * 33 14 3  2  9  24 47
     * 34 15 4  1  8  23 46
     * 35 16 5  6  7  22 45
     * 36 17 18 19 20 21 44
     * 37 38 39 40 41 42 43
     *
     * @param size size of columns and rows, should be odd number
     */
    public static int[][] createSpiralMatrix(int size) {
        int array[][] = new int[size][size];
        int step = 0;

        int final_row = (size - 1) / 2;
        int final_column = (size - 1) / 2;

        int column_down_start = 0;
        int column_down_end = size - 1;

        int row_left_start = size - 1;   //TODO: Java code convention violation. PLease use camelCase for instance, rowLeftStart
        int row_left_end = 0;

        int column_up_start = size - 1;
        int column_up_end = 0;

        int row_right_start = 0;
        int row_right_end = size;


        while (array[final_row][final_column] == 0) {

            //Collect number by column down
            for (int column_down = column_down_start; column_down <= column_down_end; column_down++) {
                if (array[column_down][column_down_end] == 0) {
                    array[column_down][column_down_end] = size * size - step;
                    step++;
                }
            }
            column_down_end--;
            column_down_start++;

            //Collect number by row left
            for (int row_left = row_left_start; row_left >= row_left_end; row_left--) {
                if (array[row_left_start][row_left] == 0) {
                    array[row_left_start][row_left] = size * size - step;
                    step++;
                }
            }

            row_left_start--;
            row_left_end++;

            //Collect number by column up
            for (int column_up = column_up_start; column_up >= column_up_end; column_up--) {
                if (array[column_up][column_up_end] == 0) {
                    array[column_up][column_up_end] = size * size - step;
                    step++;
                }
            }

            column_up_start--;
            column_up_end++;

            //Collect number by row right
            for (int row_right = row_right_start; row_right < row_right_end; row_right++) {
                if (array[row_right_start][row_right] == 0) {
                    array[row_right_start][row_right] = size * size - step;
                    step++;
                }
            }

            row_right_start++;
            row_right_end--;


        }

//        print(array);
        return array;
    }

    public static void print(int[][] matrix) {
        for (int kk = 0; kk < matrix.length; kk++) {
            for (int pp = 0; pp < matrix.length; pp++) {
                System.out.print("    " + matrix[kk][pp]);
            }
            System.out.println();
        }
    }

}