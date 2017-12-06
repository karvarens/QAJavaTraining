package auditorium.mobrectangle;


public class Rectangle {
    private int width;
    private int height;

    private Rectangle(int width, int height)
    {
        if(isValid()) {
            this.width = width;
            this.height = height;
        }
        else {
            this.width = 1;
            this.height = 2;

        }

    }

    private void fullRow()
    {
        for (int i = 0; i < width; i++)
        {
            System.out.print(" * ");
        }

        System.out.println();
    }

    private void nonFullRow()
    {
        for (int i = 0; i < width; i++)
        {
            if(i == 0 || i == width - 1)
            {
                System.out.print(" * ");
            } else {
                System.out.print("   ");
            }
        }

        System.out.println();
    }

    void print(){
        for (int i = 0; i < height; i++) {
            if(i == 0 || i == height-1 ){
                fullRow();
            }
            else {
                nonFullRow();
            }
        }
    }

    private boolean isValid(){
        if (width > 0 && height > 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5,3);
        //rectangle.fullRow(10);
        //rectangle.nonFullRow(10);
        rectangle.print();
        System.out.println("LLLOL");
        Rectangle rectangle2 = new Rectangle(-10,-20);
        rectangle2.print();
    }
}