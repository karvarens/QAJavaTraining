package auditorium.braceChecker;

public class BraceChecker {
    private StackRowType stack;
    //TODO: Try to use StackRowType
    public BraceChecker(){
        stack = new StackRowType(10);

    }

    public boolean parse(String text) {
        boolean isCorrect = true;
        int i = 0;
        lab:
        for (; i < text.length(); i++) {
            char ch = text.charAt(i);

            Character character = new Character('[');
            ch = character;
            switch(ch) {
                case '{':
                case '(':
                case '[':
                    stack.push(ch);
                case '}':
                    char lastBracket = (char)stack.pop();
//              TODO: check correctness
                if(lastBracket != '{'){
                    break lab;
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
