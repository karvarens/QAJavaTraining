package homework.lesson3.lilitsharkhatunyan;


import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

public class FigurePrinter {

    public static void main(String[] args) {

        drawLeftUpTriangle(4);
        drawRightUpTriangle(4);
        drawLeftBottomTriangle(4);
        drawRightBottomTriangle(4);
        drawRhombus(4);
        drawEmptyRectangle(4, 6);
    }

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
        for (int i = 0; i < length ; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println("* ");
        }
        printSeparator();
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
        for (int i = 0; i < length; i++) {
            for (int j = length; j > 0; j--) {
                if(i<j)
                    System.out.print("  ");
                else
                    System.out.print("* ");
            }
            System.out.println("* ");
        }
        printSeparator();
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

        for (int i = 0; i < length; i++) {
            for (int j = length; j > i+1; j--) {
                System.out.print("* ");
            }
            System.out.println("* ");
        }
        printSeparator();
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
        for (int i = 0; i < length; i++) {
            for (int j = length-1; j > 0; j--) {
                if (i < length -j)
                    System.out.print(" *");
                else
                    System.out.print("  ");
            }
            System.out.println(" * ");
        }
        printSeparator();
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
        drawTrinagle(length);
        drawReverseTrinagle(length);

        printSeparator();
    }

    static void drawTrinagle(int length){
        for (int i = 0; i < length; i++) {
            for (int j = length-1; j > 0; j--) {
                if(i<j)
                    System.out.print(" ");
                else
                    System.out.print("* ");
            }
            System.out.println("* ");
        }
    }

    static void drawReverseTrinagle(int length){
        for (int i = length-2; i >= 0; i--) {
            for (int j = length-1; j > 0; j--) {
                if(i<j)
                    System.out.print(" ");
                else
                    System.out.print("* ");
            }
            System.out.println("* ");
        }
    }

    /**
     * Draws the rectangle by specified length number
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
            if (i==0 || i==(height-1))
                printFullRow(width, printingSymbols);
            else
                printEmptyRow(width);
        }
        printSeparator();
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
        printFullRow(length, " *");
    }

    static void printFullRow(int length, String printingSymbols){

        for (int i = 0; i < length; i++) {
            System.out.print(printingSymbols);
        }
        System.out.println();
    }

    static void printSeparator (){
        System.out.println("===============================");
    }
}
