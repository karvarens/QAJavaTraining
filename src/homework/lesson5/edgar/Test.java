package homework.lesson5.edgar;

import javax.swing.*;

public class Test {
    public static void main(String[] args) {
        Notepad notepad = new Notepad();
        notepad.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        notepad.setTitle("Notepad");
        notepad.setBounds(400,400, 700, 400);
        notepad.setVisible(true);
    }
}
