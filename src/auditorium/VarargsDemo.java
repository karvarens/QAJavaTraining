package auditorium;

public class VarargsDemo {

    public static void main(String[] args) {
        int[] someArray = null;

        int a = 2;
        int b = 20;
        int c = 200;


        System.out.println(getSum(a, b, c));

//        System.out.println(getSum(someArray)); //This code will fail, because of the someArray is null
    }

    static int getSum(int... numbers) {

        int sum = 0;
        for (int n : numbers) {
            sum += n;
        }
        return sum;
    }
}
