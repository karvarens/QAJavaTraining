package homework.lesson5.edgar;


public class BraceChecker {
    private Stack stack;
    private static int rowNumber = 1;
    private static int indexNotCorrectValue = 0;
    private static char closedBracket = 0;
    private static char addedBracket = ' ';
    private int i = 0;
    private boolean isCorrect = true;

    public static int getRowNumber() {
        return rowNumber;
    }

    public static int getIndexNotCorrectValue() {
        return indexNotCorrectValue;
    }

    public static char getAddedBracket() {
        return addedBracket;
    }

    public static char getClosedBracket() {
        return closedBracket;
    }

    public BraceChecker(String s){
        stack = new Stack(s.length());
    }

    //TODO add fields at your discretion


    public boolean parse(String text) {
        lab:for (; i < text.length(); i++) {
            addedBracket = text.charAt(i);
            indexNotCorrectValue = i+1;
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
                case'\n':{
                    rowNumber++;
                }
                break;
            }
        }

        class Result{
            private ResultMessage resualtmessage;
            private void errorType(){
                if (i == text.length()){
                    if ((closedBracket = stack.pop()) != 0){
                        isCorrect = false;
                        resualtmessage = ResultMessage.OPENBUTNOTCLOSED;
                        resualtmessage.getResultMessage();
                    }
                }
                else if (closedBracket == 0){
                    isCorrect = false;
                    resualtmessage = ResultMessage.CLOSEDBUTNOTOPENED;
                    resualtmessage.getResultMessage();
                }else{
                    isCorrect = false;
                    resualtmessage = ResultMessage.CLOSEDBUTOPENED;
                    resualtmessage.getResultMessage();
                }
            }
        }
        Result result = new Result();
        result.errorType();

        //TODO add implementation

        return isCorrect;

    }

}

