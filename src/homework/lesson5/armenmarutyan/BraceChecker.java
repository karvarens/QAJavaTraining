package homework.lesson5.armenmarutyan;

public class BraceChecker {

    private Stack stack;

    public BraceChecker(){
        stack = new Stack(10);
    }

    public boolean parse(String text) {

        char [] array_braces = text.toCharArray();

        for (int i = 0; i < array_braces.length ; i++) {
            if (array_braces[i] == '(' || array_braces[i] == '{' || array_braces[i] == '[') {
                stack.push(array_braces[i]);
            }
            else  {

                switch (array_braces[i]) {
                    case ')':
                        if (stack.peek() == '(') {
                            stack.pop();
                            break;
                        }
                    case '}':
                        if (stack.peek() == '{') {
                            stack.pop();
                            break;
                        }
                    case ']':
                        if (stack.peek() == '[') {
                            stack.pop();
                            break;
                        }
                }
            }
        }

        boolean isCorrect = true;
        if (!stack.isEmpty()) {
            isCorrect = false;
        }

        return isCorrect;
    }

    public static void main(String[] args) {
        BraceChecker brak = new BraceChecker();
        boolean parse = brak.parse("kasjhdgfhjg(kejf)kjejhsa(({{(akj)efkahfkjh}}))");
        System.out.println(parse);
    }
}
