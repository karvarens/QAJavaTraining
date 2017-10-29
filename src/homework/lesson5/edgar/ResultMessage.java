package homework.lesson5.edgar;

public enum ResultMessage {
    OPENBUTNOTCLOSED("In line -> " + BraceChecker.getRowNumber() + " index = " + BraceChecker.getIndexNotCorrectValue() +
            " Opened '" + BraceChecker.getClosedBracket() + "'" + "not closed:"),
    CLOSEDBUTNOTOPENED("In line -> " + BraceChecker.getRowNumber() + " index = " + BraceChecker.getIndexNotCorrectValue() +
            " Closed " + "'" + BraceChecker.getAddedBracket() + "'" + "but not opened"),
    CLOSEDBUTOPENED("In line -> " + BraceChecker.getRowNumber() + " index = " + BraceChecker.getIndexNotCorrectValue() +
            " Closed " + "'" + BraceChecker.getAddedBracket() + "'" + "but opened'" + BraceChecker.getClosedBracket()+ "'");
    private final String resultMessage;
    ResultMessage(String str){
        this.resultMessage = str;
    }
    public void getResultMessage(){
        System.out.println(this.resultMessage);
    }
}