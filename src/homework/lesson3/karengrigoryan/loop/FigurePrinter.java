package homework.lesson3.karengrigoryan.loop;


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
    public static void drawLeftUpTriangle(int length) {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
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
     public static void drawRightUpTriangle(int length) {

         for (int i = 0; i < length; i++) {

             for (int j = 0; j < length; j++) {

                 if (length - i - 1 <= j) {
                     System.out.print("* ");
                 } else {
                     System.out.print("  ");
                 }

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
    public static void drawLeftBottomTriangle(int length) {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - i; j++) {
                System.out.print("* ");
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
     public static void drawRightBottomTriangle(int length) {

         for (int i = length; i >= 0; i--) {

             for (int j = 0; j < length; j++) {

                 if (length - i <= j) {
                     System.out.print("* ");
                 } else {
                     System.out.print("  ");
                 }

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
     public static void drawRhombus(int length) {
         for (int i = 0; i < length; i++) {

             for (int j = 0; j < length; j++) {

                 if (length - i <= j) {
                     System.out.print("* ");
                 } else {
                     System.out.print(" ");
                 }

             }
             System.out.println();

         }

         for (int i = length; i >= 0; i--) {

             for (int j = 0; j < length; j++) {

                 if (length - i <= j) {
                     System.out.print("* ");
                 } else {
                     System.out.print(" ");
                 }

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

                if (j == 0 || j == width - 1 || i == 0 || i == height - 1) {
                    System.out.print(printingSymbols);
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }


    }

    public static  void  printEmptyRow(int length){
        printEmptyRow(length, " k");
    }

    static void printEmptyRow(int length, String printingSymbols) {

        for (int i = 0; i < length; i++) {

            if (i == 0 || i == length - 1) {
                System.out.print(printingSymbols);
            } else {
                System.out.print(" ");
            }

        }
        System.out.println();


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

    public static void main(String[] args) {
        drawLeftUpTriangle(5);
        drawRightUpTriangle(5);
        drawLeftBottomTriangle(5);
        drawRightBottomTriangle(5);
        drawRhombus(5);
        drawEmptyRectangle(5,5);
        printEmptyRow(50);
        printFullRow(20);



    }


}
