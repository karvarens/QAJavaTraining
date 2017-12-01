package homework.lesson5.narekvagharshakyan.braceChecker;
//
//import com.sun.java.util.jar.pack.Instruction;
//import com.sun.xml.internal.ws.api.message.ExceptionHasMessage;

public class Stack {
    private char [] values;
    private int tos;

    public Stack(int size) {
        values = new char [size];
        tos = -1;
    }

    public void push(char val) {
        if(tos == values.length - 1) {  // TODO: Move this piece to separate private method
            char [] newValues = new char [values.length * 3 / 2];
            System.arraycopy(values, 0, newValues, 0, values.length);
            values = newValues;
            System.out.println("StackImpl is refilled");
        }
        values[++tos] = val;
    }

    public char pop() /*throws NumberFormatException*/ {
//        if(tos < 0) {
//            //throw new NumberFormatException("TEST FAILED: Program found unopened brace: " + number +"-th symbol of text");
////            System.out.println("TEST FAILED: Program found unopened brace: " + number +"-th symbol of text");
//            return 0;
//        }
//        else {
//            return tos < 0 ? 0 : values[tos--];
//        }
        return isEmpty() ? 0 : values[tos--];
    }

    public char reverseSymbol(char symbol){ //TODO: move this logic to BraceChecker class
         switch (symbol) {
            case '(':
                symbol = ')';
                break ;
            case ')':
                symbol = '(';
                break;
            case '}':
                symbol = '{';
                break;
            case '{':
                symbol = '}';
                break;
//            case '[':
//                symbol = ']';
//                break;
            case ']':
                symbol = '[';
                break;
        }
            return symbol;
    }

    public boolean isEmpty(){
//        if(tos == -1) {
//            return true;
//        }
//        else {
//            System.out.println("TEST FAILED: Program found unclosed brace(s):");
//            for (int p = tos; p > -1; p--) {
//               System.out.println(values[p]);
//            }
//            return false;
//        }
        return tos == -1;
    }
}

