package homework.lesson3.bagrat.loop;

import homework.lesson2.bagrat.util.MathUtil;


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
        for (int y = 1; y <= length; y++) {
            for (int x = 1; x <= y; x++) {
                System.out.print('*');
            }
            System.out.println();
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
        for (int y = 1; y <= length; y++) {
            int x;
            for (x = 1; x <= length - y; x++) {
                System.out.print(' ');
            }
            for (; x <= length; x++) {
                System.out.print('*');
            }
            System.out.println();
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
        for (int y = 1; y <= length; y++) {
            for (int x = length; x >= y; x--) {
                System.out.print('*');
            }
            System.out.println();
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
        for (int y = 1; y <= length; y++) {
            int x;
            for (x = 1; x < y; x++) {
                System.out.print(' ');
            }
            for (; x <= length; x++) {
                System.out.print('*');
            }
            System.out.println();
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
        for (int y = 1; y < length*2; y++) {
            int padding = MathUtil.abs(length - y);
            for (int i = 1; i <= padding ; i++) {
                System.out.print(' ');
            }
            for (int i = 1; i <= (length - MathUtil.abs(length - y)) * 2; i++) {
                if (i % 2 == 1) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }
//            for (int i = 1; i <= padding ; i++) {
//                System.out.print(' ');
//            }
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
    public static void drawEmptyRectangle(int width, int height){
        drawEmptyRectangle(width, height, " *");
    }

    public static void drawEmptyRectangle(int width, int height , String printingSymbols) {
        printFullRow(width, printingSymbols);
        int count = height - 2;
        for (int i = 1; i <= count; i++) {
            printEmptyRow(width, printingSymbols);
        }
        printFullRow(width, printingSymbols);
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
        for (int i = 1; i <= length; i++) {
            System.out.print(printingSymbols);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        drawLeftUpTriangle(10);
        System.out.println();
        drawRightUpTriangle(10);
        System.out.println();
        drawLeftBottomTriangle(10);
        System.out.println();
        drawRightBottomTriangle(3);
        System.out.println();
        drawRightBottomTriangle(4);
        System.out.println();
        drawRightBottomTriangle(7);
        System.out.println();
        drawRhombus(18);
        System.out.println();
        drawEmptyRectangle(7, 4, "@@");
        System.out.println();

    }


}
