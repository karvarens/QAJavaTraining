package auditorium.braceChecker;

public class BraceChecker {
    private Stack stack;
    //TODO add fields at your discretion

    public BraceChecker(){
        stack = new Stack(10);

    }

    public boolean parse(String text) {
        boolean isCorrect = true;
        int i = 0;
        kuku:
        for (; i < text.length(); i++) {
            char ch = text.charAt(i);

            switch(ch) {
                case '{':
                case '(':
                case '[':
                    stack.push(ch);
                case '}':
                    char lastBracket = (char)stack.pop();
//              TODO: check correctness
                if(lastBracket != '{'){
                    break kuku;
                }
                break;

//           .......
            }
        }

        if(i < text.length()){

        }
        //TODO add implementation

        return isCorrect;

    }

}
