package homework.lesson5.lilitsharkhatunyan;

import static  homework.lesson5.lilitsharkhatunyan.BraceChecker.BracketItemInfo;
public class Stack {

    private BracketItemInfo[] values;
    private int tos;

    public Stack(int size) {
        values = new BracketItemInfo[size];
        tos = -1;
    }

    public void push(BracketItemInfo val) {
        if (tos == values.length-1) {
            ensureCapacity();
        }
        values[++tos] = val;
    }

    public BracketItemInfo pop() {
        if (tos == -1) {
            return null;
        }
        return values[tos--];
    }

    private void ensureCapacity() {
        BracketItemInfo[] newValues = new BracketItemInfo[values.length * 3 / 2];
        System.arraycopy(values, 0, newValues, 0, values.length);
        values = newValues;
        System.out.println("StackImpl is refilled!");
    }

    private void reduceCapacity(){
        //TODO
    }

    public boolean isEmpty() {
        return tos == -1;
    }

    public void clear(){
        reduceCapacity();
        tos = -1;
    }

//    public BracketItemInfo getPeek() {
//        if (tos == -1) {
//            return null;
//        }
//        return values[tos];
//    }
}