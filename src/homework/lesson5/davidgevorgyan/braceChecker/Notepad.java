package homework.lesson5.davidgevorgyan.braceChecker;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Notepad extends JFrame {
    JTextArea textArea;
    JButton verifyBraces;
    JTextField textField;
    public Notepad() {
        setLayout(new FlowLayout());

    //Panel
        JPanel buttonsPanel = new JPanel(new FlowLayout());
    //TextArea
        textArea = new JTextArea(15,50);
    //Pane
        JScrollPane scroll = new JScrollPane ( textArea );
    //Button
        verifyBraces = new JButton("Verify Braces");
        add(buttonsPanel);
        buttonsPanel.add(verifyBraces);
    //Scroll
        scroll.setVerticalScrollBarPolicy ( ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS );
        this.add ( scroll );
    //TextField
        textField = new JTextField("Result will be displayed here",50);
        textField.setEditable(false);
        this.add(textField);
    //Event Handler
        event e = new event();
        verifyBraces.addActionListener(e);

    }

    public class event implements ActionListener{
        public void actionPerformed(ActionEvent e){
            BraceChecker result = new BraceChecker(textArea.getText());
            String text = BraceChecker.ParseResultToString(result.parse());

            textField.setText(text);
        }
    }

    public static void main(String[] args) {
        Notepad gui = new Notepad();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setTitle("Notepad");
        gui.setBounds(400,400, 700, 400);
        gui.setVisible(true);
    }
}