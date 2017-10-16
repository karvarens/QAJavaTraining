package homework.lesson3.avetikbabayan.loop.additionaltasks;



public class TwoDimensionalArrayUtil {

    public static void main(String[] args) {
    int[][] matrix = createSpiralMatrix(21);
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
        int matrix[][] = new int[size][size];
        int change_var = 0;

        int colUptoDownBegin = 0;
        int colUptoDownEnd = (size-1);

        int rowRighttoLeftBegin = (size-1);
        int rowRighttoLeftEnd = 0;

        int colDowntoUpBegin= size-1;
        int colDowntoUpEnd = 0;

        int rowLefttoRightBegin = 0;
        int rowLefttoRightEnd = size;

        int last_row = (size - 1) / 2;
        int last_col = (size - 1) / 2;

        while (matrix[last_row][last_col] == 0) {

            //ColumnUptoDown
            for (int i = colUptoDownBegin; i <= colUptoDownEnd; i++) {
                if (matrix[i][colUptoDownEnd] == 0) {
                    matrix[i][colUptoDownEnd] = size * size - change_var;
                    change_var++;
                }
            }
            colUptoDownBegin++;
            colUptoDownEnd--;

            //RawRighttoLeft
            for (int i = rowRighttoLeftBegin; i > rowRighttoLeftEnd-1; i--) {
                if (matrix[rowRighttoLeftBegin][i] == 0) {
                    matrix[rowRighttoLeftBegin][i] = size * size - change_var;
                    change_var++;
                }
            }

            rowRighttoLeftBegin--;
            rowRighttoLeftEnd++;

            //ColumnDowntoUp
            for (int i = colDowntoUpBegin; i > colDowntoUpEnd-1; i--) {
                if (matrix[i][colDowntoUpEnd] == 0) {
                    matrix[i][colDowntoUpEnd] = size * size - change_var;
                    change_var++;
                }
            }
            colDowntoUpBegin--;
            colDowntoUpEnd++;

            //RawLefttoRight
            for (int i = rowLefttoRightBegin; i < rowLefttoRightEnd; i++) {
                if (matrix[rowLefttoRightBegin][i] == 0) {
                    matrix[rowLefttoRightBegin][i] = size * size - change_var;
                    change_var++;
                }
            }
            rowLefttoRightBegin++;
            rowLefttoRightEnd--;
        }
        return matrix;
    }

    public static void print(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array [i][j]< 10) {
                    System.out.print("     " + array[i][j]);
                }
                else
                if (array [i][j]< 100) {
                    System.out.print("    " + array[i][j]);
                }
                else
                    System.out.print("   " + array[i][j]);
            }
            System.out.println();
        }
    }
}