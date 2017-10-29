package homework.lesson5.davidgevorgyan.braceChecker;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Notepad extends JFrame {
    private JTextArea textArea;
    private JButton verifyBraces;
    private JTextField textField;
    BraceChecker braceChecker = new BraceChecker();

    public Notepad() {
    //Panel
        JPanel buttonsPanel = new JPanel(new FlowLayout());
    //TextArea
        textArea = new JTextArea();
    //Pane
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.getViewport().add(textArea);

    //Button
        verifyBraces = new JButton("Verify Braces");
        buttonsPanel.add(verifyBraces);
        add(buttonsPanel, BorderLayout.NORTH);

    //Scroll
        add (scrollPane, BorderLayout.CENTER);

    //TextField
        textField = new JTextField("Result will be displayed here",50);
        textField.setEditable(false);
        add(textField, BorderLayout.SOUTH);

    //ParseActionListener Handler
        verifyBraces.addActionListener(new ParseActionListener());

    }

    public class ParseActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e){

            String resultMessage = braceChecker.parse(textArea.getText()).parseResultToString() ;
            textField.setText(resultMessage);
        }
    }

    public static void main(String[] args) {
        Notepad gui = new Notepad();
        gui.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        gui.setTitle("Notepad");
        gui.setBounds(400,400, 700, 400);
        gui.setVisible(true);
    }
}