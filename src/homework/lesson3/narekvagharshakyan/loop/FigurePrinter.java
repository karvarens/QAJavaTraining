package homework.lesson3.narekvagharshakyan;


public class FigurePrinter {

    public static void main(String[] args) {
        drawLeftUpTriangle(10);
        printFullRow(30);
        drawRightUpTriangle(10);
        printFullRow(30);
        drawLeftBottomTriangle(10);
        printFullRow(30);
        drawRightBottomTriangle(10);
        printFullRow(30);
        drawRhombus(10);
        printFullRow(30);
        drawEmptyRectangle(11, 7, "@@");
        printFullRow(30);

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
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
        System.out.println();
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
        // TODO : complete the method
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (j < length - i)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println("*");
        }
        System.out.println();
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
        // TODO : complete the method
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
        System.out.println();
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
            for (int j = 0; j < length; j++) {
                if (j > i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println("*");
        }
        System.out.println();
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
        for (int i = 1; i < 2 * length; i++) {
            for (int j = 0; j < length; j++) {
                if ((i < length && j > length - i - 1) || (i >= length && length - j - 1 < 2 * length - i))
                    System.out.print("* ");
                else
                    System.out.print(" ");

            }
            System.out.println();
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
    public static void drawEmptyRectangle(int width, int height) {
        drawEmptyRectangle(width, height, " *");
    }

    public static void drawEmptyRectangle(int width, int height, String printingSymbols) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i == 0 || i == height - 1 || j == 0 || j == width - 1)
                    System.out.print(printingSymbols);
                else
                    System.out.print("  ");
            }
            System.out.println();
        }

    }


    //=========================================================================================
    static void printEmptyRow(int length) {
        printEmptyRow(length, " *");
    }

    static void printEmptyRow(int length, String printingSymbols) {
        System.out.print(printingSymbols);
        int spacesCount = (length - 2) * printingSymbols.length();
        for (int i = 0; i < spacesCount; i++) {
            System.out.print(' ');
        }
        System.out.print(printingSymbols + '\n');

    }

    static void printFullRow(int length) {
        printFullRow(length, "=");
    }

    static void printFullRow(int length, String printingSymbols) {
        System.out.println();
        for (int i = 0; i < length; i++) {

            System.out.print(printingSymbols);

        }
        System.out.println();
    }
}