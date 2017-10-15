package homework.lesson5.davidgevorgyan.braceChecker;

public class Braces {
    int index;
    char symbol;

    public Braces(int index, char symbol){
        this.index = validateIndex(index);
        this.symbol = validateSymbol(symbol);
    }
    public void print(Braces value){
        System.out.println("Index is: " + value.index);
        System.out.println("Symbol is: " + value.symbol);
    }

    private int validateIndex(int index){
        if(index < 0){
            throw new IllegalArgumentException();
        }
        else {
            return index;
        }
    }
    private char validateSymbol(char symbol){
        if(symbol != '(' && symbol != '<' && symbol != '{' && symbol != '['){
            throw new IllegalArgumentException();
        }
        else {
            return symbol;
        }
    }


}
