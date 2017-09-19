package homework.lesson3.anighazaryan;

public class FigurePrinter {
    /**
     * Draws the triangle by specified length number
     * for example when n = 4 , it must be such as
     * drawn below :
     * *
     * * *
     * * * *
     * * * * *
     *
     * @param length specified length of triangle will be drawn
     */
    public static void drawLeftUpTriangle(int length) {

        if(length < 1) {
            return;
        }

        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /**
     * Draws the triangle by specified length number
     * for example when n = 4 , it must be such as
     * drawn below :
     *       *
     *     * *
     *   * * *
     * * * * *
     *
     * @param length specified length of triangle will be drawn
     */
    public static void drawRightUpTriangle(int length) {

        if(length < 1) {
            return;
        }

        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= length; j++) {
                if(length - j >= i) {
                    System.out.print("  ");
                } else {
                    System.out.print(" *");
                }
            }
            System.out.println();
        }
    }


    /**
     * Draws the triangle by specified length number
     * for example when n = 4 , it must be such as
     * drawn below :
     * <p>
     * * * * *
     * * * *
     * * *
     * *
     *
     * @param length specified length of triangle will be drawn
     */
    public static void drawLeftBottomTriangle(int length) {

        if(length < 1) {
            return;
        }

        for (int i = length; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }

    /**
     * Draws the triangle by specified length number
     * for example when n = 4 , it must be such as
     * drawn below :
     * <p>
     * * * * *
     *   * * *
     *     * *
     *       *
     *
     * @param length specified length of triangle will be drawn
     */
    public static void drawRightBottomTriangle(int length) {

        if(length < 1) {
            return;
        }

        // add a space before/after the symbol
        for (int i = length; i >= 1; i--) {
            for (int j = 1; j <= length; j++) {
                if(length - j >= i) {
                    System.out.print("  ");
                } else {
                    System.out.print(" *");
                }
            }
            System.out.println();
        }
    }

    /**
     * Draws the rhombus by specified length number
     * for example when n = 4 , it must be such as
     * drawn below :
     * <p>
     *    *
     *   * *
     *  * * *
     * * * * *
     *  * * *
     *   * *
     *    *
     *
     * @param length specified length of rhombus will be drawn
     */
    public static void drawRhombus(int length) {

        if(length < 1) {
            return;
        }

        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= length ; j++) {
                if(length - j >= i) {
                    System.out.print(" ");
                } else {
                    System.out.print("* ");
                }

            }
            System.out.println();
        }

        for (int k = 1; k <= length; k++) {
            for (int h = length; h >= 1 ; h--) {
                if(length - h >= k) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

        System.out.println();
    }

    /**
     * Draws the rhombus by specified length number
     * for example when n = 4 , it must be such as
     * drawn below :
     * <p>
     * * * * *
     * *     *
     * *     *
     * * * * *
     *
     * @param width specified width of rectangle will be drawn
     */
    public static void drawEmptyRectangle(int width, int height) {
        drawEmptyRectangle(width, height, " *");
    }

    public static void drawEmptyRectangle(int width, int height, String printingSymbols) {

        if(width < 1 || height < 1) {
            return;
        }

        for (int i = 1; i <= width ; i++) {
            if (i == 1 || i == width) {
                printFullRow(width, printingSymbols);
            } else {
                printEmptyRow(width, printingSymbols);
            }
        }
    }

    static void printEmptyRow(int length) {
        printEmptyRow(length, " *");
    }

    static void printEmptyRow(int length, String printingSymbols) {

        if(length < 1) {
            return;
        }

       /* System.out.print(printingSymbols);
        int spacesCount = (length - 2) * printingSymbols.length();
        for (int i = 0; i < spacesCount; i++) {
            System.out.print(' ');
        }
        System.out.print(printingSymbols + '\n');
        */
        for (int i = 1; i <= length ; i++) {
            if(i == 1 || i == length) {
                System.out.print(printingSymbols);
            } else {
                System.out.print("  ");
            }
        }
        System.out.println();

    }

    static void printFullRow(int length) {

        printFullRow(length, " *");
    }

    static void printFullRow(int length, String printingSymbols) {

        if(length < 1) {
            return;
        }

        for (int i = 1; i <= length; i++) {
            System.out.print(printingSymbols);
        }
        System.out.println();
    }

    public static void main(String[] args) {

        System.out.println("drawLeftUpTriangle");
        drawLeftUpTriangle(4); //10

        System.out.println("drawRightUpTriangle");
        drawRightUpTriangle(3);

        System.out.println("drawLeftBottomTriangle");
        drawLeftBottomTriangle(4);

        System.out.println("drawRightBottomTriangle");
        drawRightBottomTriangle(7);

        System.out.println("drawEmptyRectangle");
        drawEmptyRectangle(7, 4, "@@");

        System.out.println("printFullRow and printEmptyRow");
        printFullRow(8, "^");

        System.out.println("drawRhombus");
        drawRhombus(4);

        System.out.println("printEmptyRow");
        printEmptyRow(7);

    }

}
