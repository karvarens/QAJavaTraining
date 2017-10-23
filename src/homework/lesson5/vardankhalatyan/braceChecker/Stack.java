package homework.lesson5.vardankhalatyan.braceChecker;

public class Stack {

    private int[] values;
    private int tos;

    public Stack(int size) {
        values = new int[size];
        tos = -1;
    }

    public void push(int val) {
        if(tos+1 == values.length){
            int[] newValues = new int [values.length * 3 / 2];
            System.arraycopy(values, 0, newValues, 0, values.length);
            values = newValues;
        }
        values[++tos] = val;
    }

    public int pop(){
//        if (isEmpty()){
//            JOptionPane.showMessageDialog(null,"Game Over - The Stack is empty","Warning", JOptionPane.WARNING_MESSAGE);
//            return Integer.MIN_VALUE;
//        }
        if (tos == values.length * (1/3)){
            int[] newValues = new int[values.length * 2/3];
            System.arraycopy(values, 0, newValues, 0, newValues.length);
            values = newValues;
        }
        try {
            char val = (char)values[tos--];
            values[tos+1] = 0;
            return val;
        }catch (IndexOutOfBoundsException e){
            System.out.println("The Game is Over!");
            return Integer.MIN_VALUE;
        }
    }

    public boolean isEmpty(){
        if (tos < 0){
            System.out.println("The Stack is empty");
            return tos == -1;
        }
        return false;
    }

    public int lenght(){
        return values.length;
    }
}
