package homework.lesson5.edgar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Notepad extends JFrame {
    private JTextArea textArea;
    private JButton verifyBraces;
    private JButton clear;
    private JTextField textField;
    BraceCheker braceChecker = new BraceCheker();

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

        //Button clear
        clear = new JButton("Clear");
        buttonsPanel.add(clear);
        add(buttonsPanel,BorderLayout.BEFORE_FIRST_LINE);

        //Scroll
        add (scrollPane, BorderLayout.CENTER);

        //TextField
        textField = new JTextField("Result will be displayed here",50);
        textField.setEditable(false);
        add(textField, BorderLayout.SOUTH);

        //ParseActionListener Handler
        verifyBraces.addActionListener(new ParseActionListener());
        clear.addActionListener(new ClearTextArea());
    }

    public class ClearTextArea implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            textArea.setText(null);
        }
    }

    public class ParseActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String resultMessage = braceChecker.parse(textArea.getText()).parseResultToString() ;
            textField.setText(resultMessage);
        }
    }
}
