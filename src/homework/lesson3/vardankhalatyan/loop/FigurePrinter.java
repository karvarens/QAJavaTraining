package homework.lesson3.vardankhalatyan.loop;


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
        for (int i = 0; i <= length; i++) {
            printFullRow(i);
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
        for(int i = 0, j = length - 1; i < length; i++, j--) {
            printFullRow(j, "  ");
            printFullRow(i);
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
        for (int i = length-1; i >= 0; i--){
            printFullRow(i);
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
            printFullRow(i, "  ");
            printFullRow(length-1-i);
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
        for (int i = 0, j = length - 1; i < length; i++, j--){
            printFullRow(j, " ");
            printFullRow(i);
            System.out.println("");
        }
        for (int i = 1, j = length - 2; i < length; i++, j--){
            printFullRow(i, " ");
            printFullRow(j);
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
        printFullRow(width-1, printingSymbols);
        System.out.println("");
        for (int i = 0; i < height - 2; i++){
            printEmptyRow(width, printingSymbols);
            System.out.println("");
        }
        printFullRow(width-1, printingSymbols);
        System.out.println("");
    }

    static  void  printEmptyRow(int length){printEmptyRow(length, " *");
    }

     static  void  printEmptyRow(int length, String printingSymbols){
         System.out.print(printingSymbols);
         int spacesCount = (length - 2) * printingSymbols.length();
         for (int i = 0; i < spacesCount; i++) {
             System.out.print(" ");
         }
         System.out.print(printingSymbols);

    }

    static void printFullRow(int length){
        printFullRow(length, " *");
    }

    static void printFullRow(int length, String printingSymbols){
        for(int i = 0; i <= length; i++){
            System.out.print(printingSymbols);
        }
    }

    public static void main(String[] args) {
        System.out.println("uptriangle");
        drawLeftUpTriangle(10);
        System.out.println("buttomtriangle");
        drawRightBottomTriangle(3);
        System.out.println("emptyrectangle");
        drawEmptyRectangle(7, 4, "@@");
        System.out.println("");
        System.out.println("ruptriangle");
        drawRightUpTriangle(4);
        System.out.println("lbuttomtriangle");
        drawLeftBottomTriangle(4);
        System.out.println("rbuttomtriangle");
        drawRightBottomTriangle(4);
        System.out.println("");
        drawRhombus(8);
        System.out.println("");
        drawEmptyRectangle(4, 6);

    }


}
