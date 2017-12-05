package homework.lesson5.vardankhalatyan.braceChecker;

import java.io.BufferedReader;
import java.io.FileReader;

public class NewBraceChecker {

    private int row, column;


    public NewBraceChecker() {
        Stack stack = new Stack();
    }




    class BraceObject {

        private int rowNumber;
        private int columnNumner;
        private char object;


        public BraceObject(char brace, int rowNumber, int columnNumber) {
            this.object = brace;
            this.rowNumber = rowNumber;
            this.columnNumner = columnNumber;
        }

        public int getRowNumber() {
            return rowNumber;
        }

        public int getColumnNumner() {
            return columnNumner;
        }

        public void setRowNumber(int rowNumber) {
            this.rowNumber = rowNumber;
        }

        public void setColumnNumner(int columnNumner) {
            this.columnNumner = columnNumner;
        }

        public void setObject(char object) {
            this.object = object;
        }

        public char getObject() {
            return object;
        }

        private void validate(){

        }


    }

}
