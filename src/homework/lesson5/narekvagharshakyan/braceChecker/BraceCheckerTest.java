package homework.lesson5.narekvagharshakyan.braceChecker;

public class BraceCheckerTest {
    public static void main(String[] args) {
        BraceChecker myBraceChecker = new BraceChecker();
        String textForChecking = "(sds{ss()()(())s(21245 {}{{}} dsfsd)}dsd) \n ([])";
        myBraceChecker.parse(textForChecking);
        System.out.println();
    }
}
