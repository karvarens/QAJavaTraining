package homework.lesson5.vardankhalatyan.braceChecker;

public class BraceChecker {
    //TODO add fields at your descreption - ?
    private Stack stack;
    private String resultMessage;


    public BraceChecker(String fileName){
        stack = new Stack(10);
        resultMessage = "No Error";
    }


    public boolean parse(String text) {
        boolean isCorrect = true;
      //  BufferedReader file = new BufferedReader(new FileReader("text"));
      //  line = file.readLine();
        char lastOpenedBracket = 0;
        int i = 0;

        lab: for (; i < text.length(); i++) {
            char ch = text.charAt(i);

            switch (ch){
                case '{':
                case '[':
                case '(':
                    stack.push(ch);
                    break;
                case ')':
                    if (stack.isEmpty()){
                        isCorrect = false;
                        break lab;
                    } else {
                        //lastOpenedBracket = (char)stack.pop().intValue();
                        if (lastOpenedBracket != '(') {
                            isCorrect = false;
                            break lab;
                        }
                    }
                    break;
                case ']':
                    if (stack.isEmpty()){
                        isCorrect = false;
                        break lab;
                    } else {
                      //  lastOpenedBracket = (char)stack.pop().intValue();
                        if (lastOpenedBracket != '[') {
                            isCorrect = false;
                            break lab;
                        }
                    }
                    break;
                case '}':
                    if (stack.isEmpty()){
                        isCorrect = false;
                        break lab;
                    } else {
                       // lastOpenedBracket = (char)stack.pop().intValue();
                        if (lastOpenedBracket != '{') {
                            isCorrect = false;
                            break lab;
                        }
                    }
                    break;
            }

        }

        if(i < text.length()) {
            if(lastOpenedBracket == 0) {
                resultMessage = "Error: Closed '" + text.charAt(i) + "' but not opened";
            } else {
                resultMessage = "Additional closed '" + text.charAt(i) + "' bracket";
            }

        } else if (!stack.isEmpty()) {
          //  resultMessage = "Error: Opened '" + (char)stack.pop().intValue() + "' but not closed";
        }

        System.out.println(resultMessage);
        return isCorrect;

    }

}
