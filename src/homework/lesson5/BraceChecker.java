package homeWork.lesson5;

public class BraceChecker {
    private Stack stack;
    private String resultMessage;
    private static char closedBracket = 0;
    private static char addedBracket = ' ';

    public static char getAddedBracket() {
        return addedBracket;
    }

    public static char getClosedBracket() {
        return closedBracket;
    }

    public BraceChecker(String s){
        stack = new Stack(s.length());
        resultMessage = "No Errors";
    }

    //TODO add fields at your discretion


    public boolean parse(String text) {
        boolean isCorrect = true;
        int i = 0;
        lab:for (; i < text.length(); i++) {
            addedBracket = text.charAt(i);
            switch (addedBracket){
                case '[':
                case '{':
                case '(':
                    stack.push(addedBracket);
                    break;
                case ']':
                    closedBracket = stack.pop();
                    if (closedBracket != '['){
                        break lab;
                    }
                    break;
                case '}':
                    closedBracket = stack.pop();
                    if (closedBracket != '{'){
                        break lab;
                    }
                    break;
                case ')':
                    closedBracket = stack.pop();
                    if (closedBracket != '('){
                        break lab;
                    }
                    break;
            }
        }
        ResultMessage resualt;
        if (i == text.length()){
            if ((closedBracket = stack.pop()) != 0){
                isCorrect = false;
                resualt = ResultMessage.OPENBUTNOTCLOSED;
                resualt.getResultMessage();
            }
        }else if (closedBracket == 0){
            isCorrect = false;
            resualt = ResultMessage.CLOSEDBUTNOTOPENED;
            resualt.getResultMessage();
        }else{
            isCorrect = false;
            resualt = ResultMessage.CLOSEDBUTOPENED;
            resualt.getResultMessage();
        }
        //TODO add implementation

        return isCorrect;

    }

}
