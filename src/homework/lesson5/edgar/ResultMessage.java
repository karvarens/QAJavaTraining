package homework.lesson5.edgar;

public enum ResultMessage {
    OPENBUTNOTCLOSED("Opened '" + BraceChecker.getClosedBracket() + "'" + "not closed:"),
    CLOSEDBUTNOTOPENED("Closed " + "'" + BraceChecker.getAddedBracket() + "'" + "but not opened"),
    CLOSEDBUTOPENED("Closed " + "'" + BraceChecker.getAddedBracket() + "'" + "but opened'" + BraceChecker.getClosedBracket()+ "'");
    private final String resultMessage;
    ResultMessage(String str){
        this.resultMessage = str;
    }
    public void getResultMessage(){
        System.out.println(this.resultMessage);
    }
}
