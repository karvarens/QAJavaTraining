package homework.lesson3.davidgevorgyan.additionaltasks;



public class TwoDimensionalArrayUtil {

    public static void main(String[] args) {
        int[][] matrix = createSpiralMatrix(101);
        print(matrix);
    }

    /**
     *  Initializes two dimensional array such as explained below:
     *  For instance, if odd_size is 7 then the result should be
     *  the matrix described below:
     *
     *   31 30 29 28 27 26 49
     *   32 13 12 11 10 25 48
     *   33 14 3  2  9  24 47
     *   34 15 4  1  8  23 46
     *   35 16 5  6  7  22 45
     *   36 17 18 19 20 21 44
     *   37 38 39 40 41 42 43
     *
     * @param size size of columns and rows, should be odd number
     */
    public static int[][] createSpiralMatrix (int size) {
        int matrix[][]= new int[size][size];
        int count = size * size + 1;
        int x = -1;
        int delta = 0;
        int y = size -1;
        for (int z = 1; z < size - 2; z++) {
            for (int i = 0; i < size - delta; i++) {
                count--;
                x++;
                matrix[x][y] = count;
            }
            for (int i = 1; i < size - delta; i++) {
                count--;
                y--;
                matrix[x][y] = count;
            }
            for (int i = 1; i < size - delta ; i++) {
                count--;
                x--;
                matrix[x][y] = count;
            }
            for (int i = 1; i < size - delta - 1; i++) {
                count--;
                y++;
                matrix[x][y] = count;
            }
            delta+=2;
        }





        return matrix;
    }


    public static void print(int[][] matrix) {
        int max = matrix[0][matrix.length - 1];
        int maxDigitsCount = digitsCount(max);
        for ( int x[] : matrix) {
            for (int y : x) {
                System.out.print(y);
                for (int i = digitsCount(y); i <= maxDigitsCount; i++) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }


    public static int digitsCount(int number) {
        return (int) Math.log10(number) + 1;

    }
}