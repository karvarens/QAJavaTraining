package homework.lesson5.edgar;


public class TestOfStack {
    public static void main(String[] args) {
        String str = "[Java{is(the{best[language]})in}the]World{";
        BraceChecker braceChecker = new BraceChecker(str);
        if(braceChecker.parse(str)){
            System.out.println("Correct input");
        }
    }
}
