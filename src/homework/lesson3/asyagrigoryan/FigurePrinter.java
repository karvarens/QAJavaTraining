package homework.lesson3.asyagrigoryan;


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

        for (int i = 0; i <= length - 1; i++)
        {
            for (int j = 0; j <= i; j++){
                System.out.print("* ");
            }
        System.out.println(" ");
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

        for (int i = 0; i <= length - 1; i++)
        {
            for (int j = 0; j <= length -1; j++)

            {
                if (j >= length - i - 1) {
                    System.out.print("* ");
                }
                else System.out.print(" ");
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
        for (int i = 0; i <= length - 1; i++)
        {
            for (int j = 0; j <= length -1; j++)

            {
                if (j >= length - i) {
                    System.out.print(" ");
                }
                else System.out.print("* ");
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

        for (int i = 0; i <= length - 1; i++){
            for (int j = 0; j <= length - 1; j++){

                if (j < i){
                    System.out.print("  ");
                }
                else System.out.print("* ");
            }
            System.out.println(" ");
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

       for (int i = 0; i <= length - 1; i++){
            for (int j = 0; j <= length - 1; j++){

                if (j < i){
                    System.out.print(" ");
                }
                else System.out.print("* ");
            }
            System.out.println(" ");
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

    }

    public static void main(String[] args) {
    //   drawLeftUpTriangle(4);
  //        drawRightUpTriangle(4);
  //        drawLeftBottomTriangle(4);
   //    drawRightBottomTriangle(4);
//        drawRightBottomTriangle(4);
//        drawRightBottomTriangle(7);
        drawRhombus(4);
  //      drawEmptyRectangle(7, 4, "@@");


    }


}
