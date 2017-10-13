package auditorium.classintro;

public class Rectangle {
    static int maxWidth = 110;

    int width;
    int height;

    Rectangle(){

    }

    Rectangle(int width, int height){
       this.height = height;
       this.width = width;
    }

    int getSquare(){
        return width * height;
    }

}
