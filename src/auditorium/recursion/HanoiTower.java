package auditorium.recursion;

public class HanoiTower {
    public static void main(String[] args) {
        moveDisks(2,1,2,3);
    }

    static void moveDisks (int n, int first, int second, int third) {
        if(n == 1) {
            System.out.println(first + " -> " + third);
        } else {
            moveDisks(n-1, first, third, second);
            System.out.println(first + " -> " + third);
            moveDisks(n-1, second, first, third);
        }
    }
}
