package homework.lesson3.vardankhalatyan.additionaltasks;



public class TwoDimensionalArrayUtil {

    public static void main(String[] args) {
//        int[][] matrix = createSpiralMatrix(21);
//        print(matrix);
        createSpiralMatrix(1);
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
     *   3  2  9
     *   4  1  8
     *   5  6  7
     *
     *   1 2 3 4 5 6 7 8 9
     *
     * @param size size of columns and rows, should be odd number
     */
    public static int[][] createSpiralMatrix (int size) {

        int[][] a = new int[3][3];
        a[1][1] = 1;
        a[0][1] = 2;
        a[0][0] = 3;
        a[1][0] = 4;
        a[2][0] = 5;
        a[2][1] = 6;
        a[2][2] = 7;
        a[1][2] = 8;
        a[0][2] = 9;
        for (int i =0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(a[i][j]);
            }
            System.out.println("");
        }
        return null;

    }


    public static void print(int[][] matrix) {
        //TODO implement
    }
}