package homework.lesson3.davidgevorgyan.loop;


public class FigurePrinter {

    /**
     * Draws the triangle by specified length number
     * for example when n = 4 , it must be such as
     * drawn below :
     *      *
     *      * *
     *      * * *
     *      * * * *
     *
     * @param length  specified length of triangle will be drawn
     */
    public static void drawLeftUpTriangle(int length){
        for (int i = 0; i < length; i++){
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

     /**
     * Draws the triangle by specified length number
     * for example when n = 4 , it must be such as
     * drawn below :
     *             *
     *           * *
     *         * * *
     *       * * * *
     *
     * @param length  specified length of triangle will be drawn
     */
    public static void drawRightUpTriangle(int length){
        for (int i = 1; i <= length; i++){
            for (int j = 0; j < length - i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }


    /**
     * Draws the triangle by specified length number
     * for example when n = 4 , it must be such as
     * drawn below :
     *
     *       * * * *
     *       * * *
     *       * *
     *       *
     *
     * @param length  specified length of triangle will be drawn
     */
    public static void drawLeftBottomTriangle(int length){
        for (int i = 0; i < length; i++){
            for (int j = 0; j < length - i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

     /**
     * Draws the triangle by specified length number
     * for example when n = 4 , it must be such as
     * drawn below :
      *
     *       * * * *
     *         * * *
     *           * *
     *             *
     *
     * @param length  specified length of triangle will be drawn
     */
    public static void drawRightBottomTriangle(int length){
        for (int i = 0; i < length; i++){
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < length - i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

     /**
     * Draws the rhombus by specified length number
     * for example when n = 4 , it must be such as
     * drawn below :
     *
     *        *
     *       * *
     *      * * *
     *     * * * *
     *      * * *
     *       * *
     *        *
     * @param length  specified length of rhombus will be drawn
     */
    public static void drawRhombus(int length){
        for (int i = 1; i < length; i++){
            for (int j = 0; j < length - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        for (int i = 0; i < length; i++){
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < length - i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    /**
     * Draws the rhombus by specified length number
     * for example when n = 4 , it must be such as
     * drawn below :
     *
     *     * * * *
     *     *     *
     *     *     *
     *     * * * *
     *
     * @param width  specified width of rectangle will be drawn
     */
    public static void drawEmptyRectangle(int width, int height){
        drawEmptyRectangle(width, height, " *");
    }

    public static void drawEmptyRectangle(int width, int height , String printingSymbols) {
        for (int i = 0; i < height; i++) {
            if (i == 0 || i == height - 1)
                printFullRow(width,printingSymbols);
            else
                printEmptyRow(width,printingSymbols);
            }
    }

    static  void  printEmptyRow(int length){
        printEmptyRow(length, " *");
    }

     static  void  printEmptyRow(int length, String printingSymbols){
         System.out.print(printingSymbols);
         int spacesCount = (length - 2) * printingSymbols.length();
         for (int i = 0; i < spacesCount; i++) {
             System.out.print(' ');
         }
         System.out.print(printingSymbols + '\n');
     }

    static void printFullRow(int length){
        printFullRow(length, "*");
    }

    static void printFullRow(int length, String printingSymbols){
        for (int i = 0; i < length; i++) {
            System.out.print(printingSymbols);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        drawLeftUpTriangle(4);
        printFullRow(20,"~");
        drawRightUpTriangle(4);
        printFullRow(20,"~");
        drawLeftBottomTriangle(4);
        printFullRow(20,"~");
        drawRightBottomTriangle(4);
        printFullRow(20,"~");
        drawRhombus(5);
        printFullRow(20,"~");
        drawEmptyRectangle(3, 3, "@");
    }
}