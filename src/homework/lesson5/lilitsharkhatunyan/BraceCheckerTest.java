package homework.lesson5.lilitsharkhatunyan;

/**
 * Created by lilitsharkhatunyan on 11/8/17.
 */
public class BraceCheckerTest {

    public static void main(String[] args) {

        String testBrackets = new String();

//        System.out.println("Please enter a text to parse brackets: ");
//        Scanner scanner = new Scanner(System.in);
//        testBrackets = scanner.nextLine();

        // testBrackets = "{}\n[]{}\n]"; //exc

        testBrackets = "{{{\n}}})";

        BraceChecker braceChecker = new BraceChecker(testBrackets);

        braceChecker.parse(testBrackets);
    }

    public static void parse_OpenedButNotClosed() {

    }
}
