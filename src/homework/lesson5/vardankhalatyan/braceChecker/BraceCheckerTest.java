package homework.lesson5.vardankhalatyan.braceChecker;

/**
 * Created by vardankhalatyan on 10/20/17.
 */
public class BraceCheckerTest {
    public static void main(String[] args) {
        String str = "}{this is [ testing ( string  ) so  ] it should pass{ }";
        BraceChecker brch = new BraceChecker(str);
        if (brch.parse(str)){
            System.out.println("PASSED");
        }else {
            System.out.println("FAILED");
        }
    }
}
