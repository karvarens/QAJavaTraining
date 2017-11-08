package homework.lesson5.vardankhalatyan.braceChecker;

/**
 * Created by vardankhalatyan on 10/19/17.
 */
public class StackTest {
    public static void main(String[] args) {
        Stack st1 = new Stack(2);
        st1.push(1);
        st1.push(2);
        st1.push(3);
        st1.push(4);
        st1.push(5);
        System.out.println(st1.pop());
        System.out.println(st1.pop());
        System.out.println(st1.pop());
        System.out.println(st1.pop());
        System.out.println(st1.pop());
//        System.out.println(st1.lenght()); TODO: Stack hasn't length() method
        st1.isEmpty();
        System.out.println(st1.pop());
//        System.out.println(st1.lenght());
        st1.isEmpty();
        System.out.println(st1.pop());
//        System.out.println(st1.lenght());
        st1.isEmpty();
    }

}
