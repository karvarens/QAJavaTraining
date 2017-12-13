package auditorium.mobrectangle;


public class Rectangle {
    private int width;
    private int height;

    Rectangle(int width, int height) {
            this.width = width;
            this.height = height;
    }

    private void fullRow() {
        isValid();
        for (int i = 0; i < width; i++) {
            System.out.print(" * ");
        }
        System.out.println();
    }

    private void nonFullRow() {
       isValid();
            for (int i = 0; i < width; i++) {
                if (i == 0 || i == width - 1) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
        System.out.println();
        }


    public void print() {
        isValid();
        for (int i = 0; i < height; i++) {
            if (i == 0 || i == height - 1) {
                fullRow();
            } else {
                nonFullRow();
            }
        }
    }

    private void isValid() {
        if (width <= 0 && height < 0) {
            throw new IllegalArgumentException("BRRRR- Assigned value is not valid");
        }
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(7, 3);
        rectangle.print();

        Rectangle rectangle2 = new Rectangle(-10, -20);
        rectangle2.print();

        Rectangle rectangle3 = new Rectangle(-10,-11);
        rectangle3.fullRow();
    }
}

class outsideOfRectangle {
    Rectangle abc = new Rectangle(10,20);

    public void main() {
        abc.print();
    }
}