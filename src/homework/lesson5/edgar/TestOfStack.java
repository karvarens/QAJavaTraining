package homework.lesson5.edgar;


public class TestOfStack {
    public static void main(String[] args) {
        String str = "123456789[\nfasfaf]dfafaf\n {  }  fasdf[fsdfsd      af]f   asf[sfa   s()}]";
        BraceChecker braceChecker = new BraceChecker(str);
        if(braceChecker.parse(str)){
            System.out.println("Correct input");
        }
    }
}
