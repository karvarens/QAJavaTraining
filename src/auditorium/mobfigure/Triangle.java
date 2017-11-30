package auditorium.mobfigure;

/**
 * Created by lilitsharkhatunyan on 11/29/17.
 */
public class Triangle {
    private int sideOne; // indicates Side 1 of the triangle
    private int sideTwo; // indicates Side 2 of the triangle
    private int sideThree; // indicates Side 3 of the triangle

    //Building constructor

    Triangle(int sideOne, int sideTwo, int sideThree){


            this.sideOne = sideOne;
            this.sideTwo = sideTwo;
            this.sideThree = sideThree;


    }

    public static void main(String[] args) {

        Triangle triangle = new Triangle(4,5,6);
        int sumOfTriangle = triangle.sum();
        System.out.println("sum " + sumOfTriangle);

    }
    private boolean isValid(Triangle triangle){
        if(triangle.sideOne <= 0 || triangle.sideTwo <= 0 || triangle.sideThree <= 0){ //checking sides are zero or negative
            System.out.println("Sides are zero or negative");
            return false;
        }

        ////checking whether these sides are triangle
        if(sideOne + sideTwo <= sideThree || sideOne + sideThree <= sideTwo || sideThree + sideTwo <= sideOne) {
            System.out.println("This is not a triangle");
            return false;
        }

        return true;
    }

    // Calculates the perimeter of triangle
    public int sum() {

        if (isValid(this)){
            return this.sideOne + this.sideTwo + this.sideThree;
        }

        return 0;

    }

    public int getSideOne() {
        return sideOne;
    }

    public int getSideTwo() {
        return sideTwo;
    }

    public int getSideThree() {
        return sideThree;
    }

    public void setSideOne(int sideOne) {
        this.sideOne = sideOne;
    }

    public void setSideTwo(int sideTwo) {
        this.sideTwo = sideTwo;
    }

    public void setSideThree(int sideThree) {
        this.sideThree = sideThree;
    }
}
