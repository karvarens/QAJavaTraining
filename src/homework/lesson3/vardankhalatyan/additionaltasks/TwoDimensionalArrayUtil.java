package homework.lesson3.vardankhalatyan.additionaltasks;



public class TwoDimensionalArrayUtil {

    public static void main(String[] args) {
//        int[][] matrix = createSpiralMatrix(21);
//        print(matrix);
//        createSpiralMatrix(5);
        int[][] matrix = new int[7][7];
        drawSquare(matrix,3);
        drawSquare(matrix,1);
        drawSquare(matrix,5);
        drawSquare(matrix,7);
        ptintM(matrix);
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

        int nums = size * size;
        int[][] matrix = new int[size][size];
        for (int i = 1; i <=size; i++){
            drawSquare(matrix,i);
        }
        ptintM(matrix);
        return matrix;
    }




    private static void ptintM(int[][] a){
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a.length; j++){
                if (a[i][j] < 10){
                    System.out.print(a[i][j] + "  ");

                }else{
                    System.out.print(a[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    private static void drawSquare(int[][] a ,int radius){
        int size = a.length;
        int offset = (size - radius)/2;
        int nums = radius * radius;
        for (int i = offset; i < size - offset; i++){
            a[i][size - offset-1] = nums;
            nums--;
        }
        for (int i = size - offset - 2; i >= offset; i--){
            a[size-offset-1][i] = nums;
            nums--;
        }
        for (int i = size - offset - 2; i >= offset; i--){
            a[i][offset] = nums;
            nums--;
        }
        for (int i = offset + 1; i < size - offset - 1; i++){
            a[offset][i] = nums;
            nums--;
        }
    }

}