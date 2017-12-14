package auditorium.mobrectangle;


public class Rectangle {
    private int width;
    private int height;

    Rectangle(int width, int height) {
        validate(width, height);
        this.width = width;
        this.height = height;
    }

    private String fullRow() {
//        isValid();
        StringBuilder resultBuilder = new StringBuilder();
        for (int i = 0; i < width; i++) {
            resultBuilder.append(' ').append('*');

        }
        resultBuilder.append('\n');
        return resultBuilder.toString();
    }

    private String nonFullRow() {
//       isValid();
//        for (int i = 0; i < width; i++) {
//            if (i == 0 || i == width - 1) {
//                System.out.print(" * ");
//            } else {
//                System.out.print("   ");
//            }
//        }
//        System.out.println();

        StringBuilder resultBuilder = new StringBuilder();
        for (int i = 0; i < width; i++) {
            if (i == 0 || i == width - 1) {
                resultBuilder.append(" *");
            } else {
                resultBuilder.append("  ");
            }

        }
        resultBuilder.append('\n');
        return resultBuilder.toString();
    }


    public void print() {  //TODO: override toString method.
//        isValid(); Print method should not check fields values, it should just print the value
//        for (int i = 0; i < height; i++) {
//            if (i == 0 || i == height - 1) {
//                fullRow();
//            } else {
//                nonFullRow();
//            }
//        }
        System.out.println(this);
    }

    @Override
    public String toString() {
        StringBuilder resultBuilder = new StringBuilder();

        resultBuilder.append(fullRow());
        for (int i = 1; i < height - 1; i++) {
            resultBuilder.append(nonFullRow());
        }
        resultBuilder.append(fullRow());

        return resultBuilder.toString();
    }

    private void validate(int width, int height)/*isValid()*/ { //TODO it should be validated the parameter value not a field value.   //Java code convention violation: methods with form isXXX should return boolean
        if (width <= 0 && height <= 0) {
            throw new IllegalArgumentException("BRRRR- Assigned value is not valid");
        }
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(7, 3);
        System.err.println(rectangle);

        Rectangle rectangle2 = new Rectangle(-10, -20);
        System.out.println(rectangle2);

        Rectangle rectangle3 = new Rectangle(-10, -11);
        rectangle3.fullRow();
    }
}

class outsideOfRectangle {
    Rectangle abc = new Rectangle(10, 20);

    public void main() {
//        Rectangle.main(new String[0]);
        abc.print();
    }
}