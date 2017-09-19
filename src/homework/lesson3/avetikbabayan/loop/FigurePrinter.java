package homework.lesson3.avetikbabayan.loop;

/**
 * Created by AvetikAdmin on 9/18/17.
 */
public class FigurePrinter {
    /**
     * Draws the triangle by specified length number
     * for example when n = 4 , it must be such as
     * drawn below :
     *      *
     *      * *
     *      * * *
     *      * * * *
     **/

    /**
     * @param length specified length of triangle will be drawn
     */
    /**
     * done
     **/
    public static void drawLeftUpTriangle(int length) {
        int i, j;
        for (i = 0; i < length; i++) {
            for (j = 0; j < length - i; j++) {
                System.out.print("  ");
            }
            System.out.println("");
            for (j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
        }
    }

    //        /**
//         * Draws the triangle by specified length number
//         * for example when n = 4 , it must be such as
//         * drawn below :
//         *             *
//         *           * *
//         *         * * *
//         *       * * * *
//         *
//         * @param length  specified length of triangle will be drawn
//         */
    public static void drawRightUpTriangle(int length) {
        for (int i = 1; i < length + 1; i++) {
            for (int j = 0; j < length - i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }


//        /**
//         * Draws the triangle by specified length number
//         * for example when n = 4 , it must be such as
//         * drawn below :
//         *
//         *       * * * *
//         *       * * *
//         *       * *
//         *       *
//         */
// @param length  specified length of triangle will be drawn

    public static void drawLeftBottomTriangle(int length){
        int i, j;
        for (i = 0; i < length - 1; i++) {
            for (j = 0; j < length - i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println("");
            for (j = 0; j < i - 1; j++) {
                System.out.print("* ");
            }
        }
    }

//        /**
//         * Draws the triangle by specified length number
//         * for example when n = 4 , it must be such as
//         * drawn below :
//         *
//         *       * * * *
//         *         * * *
//         *           * *
//         *             *
//         *
//         * @param length  specified length of triangle will be drawn
//         */
    public static void drawRightBottomTriangle(int length) {
        int i, j;
        for (i = 0; i < length; i++) {
            for (j = 0; j < length - i; j++) {
                System.out.print("* ");
            }
            System.out.println("  ");
            for (j = 0; j < i + 1; j++) {
                System.out.print("  ");
            }
        }
    }

//        /**
//         * Draws the rhombus by specified length number
//         * for example when n = 4 , it must be such as
//         * drawn below :
//         *
//         *        *
//         *       * *
//         *      * * *
//         *     * * * *
//         *      * * *
//         *       * *
//         *        *
//         * @param length  specified length of rhombus will be drawn
//         */
//        public static void drawRhombus(int length){
//            // TODO : complete the method
//        }
//
//        /**
//         * Draws the rhombus by specified length number
//         * for example when n = 4 , it must be such as
//         * drawn below :
//         *
//         *     * * * *
//         *     *     *
//         *     *     *
//         *     * * * *
//         *
//         * @param width  specified width of rectangle will be drawn
//         */
//        public static void drawEmptyRectangle(int width, int height){
//            drawEmptyRectangle(width, height, " *");
//        }
//
//        public static void drawEmptyRectangle(int width, int height , String printingSymbols) {
//
//
//        }
//
//        static  void  printEmptyRow(int length){
//            printEmptyRow(length, " *");
//        }
//
//        static  void  printEmptyRow(int length, String printingSymbols){
//            System.out.print(printingSymbols);
//            int spacesCount = (length - 2) * printingSymbols.length();
//            for (int i = 0; i < spacesCount; i++) {
//                System.out.print(' ');
//            }
//            System.out.print(printingSymbols + '\n');
//
//        }
//
//        static void printFullRow(int length){
//            printFullRow(length, " *");
//        }
//
//        static void printFullRow(int length, String printingSymbols){
//
//        }

    public static void main(String[] args) {

        drawLeftUpTriangle(10);
        System.out.println( );
        System.out.println( );
        drawRightUpTriangle(4);
        System.out.println( );
        System.out.println( );
        drawLeftBottomTriangle(4);
        System.out.println( );
        System.out.println( );
        drawRightBottomTriangle(7);
        System.out.println( );
        System.out.println( );

//        drawEmptyRectangle(7, 4, "@@");

    }
}

