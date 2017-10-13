package homework.lesson3.vardankhalatyan.additionaltasks;

public class TwoDimensionalArrayUtil {

    public static void main(String[] args) {
        int[][] matrix = createSpiralMatrix(21);
        printM(matrix);
        int[][] nmatrix = createSpiralMatrix(-1);
        printM(nmatrix);
        int[][] ematrix = createSpiralMatrix(4);
        printM(ematrix);
    }

    public static int[][] createSpiralMatrix (int size) {
        if (size < 1){
            System.out.println("Please, specify positive array leght(odd number) >= 1");
            System.out.println("Returned empty two-dimensional array");
            int[][] a = new int[0][0];
            return a;
        }
        if (size%2==0){
            System.out.println("Please, specify odd integer number");
            System.out.println("Returned empty two-dimensional array");
            int[][] a = new int[0][0];
            return a;
        }
        int[][] matrix = new int[size][size];
        int nums = size * size;
        for (int i = 1; i <=size; i+=2){
            drawSquare(matrix,i);
        }
        return matrix;
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

    private static void printM(int[][] a){
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a.length; j++){
                if (a[i][j] < 10) {
                    System.out.print(a[i][j] + "   ");

                } else if (a[i][j] < 100){
                    System.out.print(a[i][j] + "  ");
                }else if (a[i][j] < 1000){
                    System.out.print(a[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println("\n\n");
    }

    private static int getCountOfDigits(int number) {
        if (number < 10)         return 1;
        if (number < 100)        return 2;
        if (number < 1000)       return 3;
        if (number < 10000)      return 4;
        if (number < 100000)     return 5;
        if (number < 1000000)    return 6;
        if (number < 10000000)   return 7;
        if (number < 100000000)  return 8;
        if (number < 1000000000) return 9;
        return 10;
    }

    private static final String[] spaces = {
            " ",
            "  ",
            "   ",
            "    ",
            "     ",
            "      ",
            "       ",
            "        ",
            "         ",
            "          "
    };

    public static void print(int[][] matrix) {
        int max = matrix.length * matrix.length;
        int maxLength = getCountOfDigits(max);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int val = matrix[i][j];
                System.out.print(val + spaces[maxLength - getCountOfDigits(val)] );
            }
            System.out.println();
        }
        System.out.println();
    }

}