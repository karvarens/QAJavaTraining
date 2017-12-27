package homework.lesson5.vardankhalatyan.braceChecker;

import javafx.event.ActionEvent;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * Created by vardankhalatyan on 10/20/17.
 */
public class BraceCheckerTest {
    public static void main(String[] args) {
//        String str = "{this is [ testing ( string  }) so  ] it should pass} }";
//        BraceChecker brch = new BraceChecker(str);
//        brch.parse(str);

        JFrame frame = new JFrame("NotePad+-");
        frame.setVisible(true);
        frame.setSize(800, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("hello");
        JPanel panel = new JPanel();
        frame.add(panel);
        panel.add(label);

        final JTextField input = new JTextField(5); // The input field with a width of 5 columns
        panel.add(input);

        JButton button = new JButton("Hello again");
        panel.add(button);

        final JLabel output = new JLabel(); // A label for your output
        panel.add(output);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {

            } // The action listener which notices when the button is pressed
            public void actionPerformed(ActionEvent e) {
                String inputText = input.getText();
                int age = Integer.parseInt(inputText);
                if (age < 18) {
                    output.setText("Hi youngster!");
                } else {
                    output.setText("Hello mature!");
                }
            }
        });
    }
    }

