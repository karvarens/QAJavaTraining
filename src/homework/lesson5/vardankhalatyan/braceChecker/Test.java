package homework.lesson5.vardankhalatyan.braceChecker;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

    //You'll need to implement the ActionListener to listen to buttonclicks
    public class Test implements ActionListener{

        //Declare class variables so you can use them in different functions
        JLabel label;
        JTextField textfield;

        //Don't do al your code in the static main function, instead create an instance
        public static void main(String[] args){
            new Test();
        }

        // this constructor is called when you create a new Age(); like in the main function above.
        public Test()
        {
            JFrame frame = new JFrame("Test");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300,300);
            frame.setLayout(null);

            JPanel panel = new JPanel();
            panel.setBounds(0,0,300,300);
            panel.setLayout(null);

            label = new JLabel("hello");
            label.setBounds(5,5,100,20);

            // a JTextfield allows the user to edit the text in the field.
            textfield = new JTextField();
            textfield.setBounds(5,30,100,20);

            JButton button = new JButton("Hello again");
            button.setBounds(130,30,100,20);
            // Add this instance as the actionlistener, when the button is clicked, function actionPerformed will be called.
            button.addActionListener(this);

            panel.add(label);
            panel.add(textfield);
            panel.add(button);

            frame.add(panel);
            frame.setVisible(true);
        }

        //Required function actionPerformed for ActionListener. When the button is clicked, this function is called.
        @Override
        public void actionPerformed(ActionEvent e)
        {
            // get the text from the input.
            String text = textfield.getText();

            // parse the integer value from the string (! needs validation for wrong inputs !)
            int age = Integer.parseInt(text);
            if (age<18)
            {
                //instead of writing out, update the text of the label.
                label.setText("Hi youngster!");
            }
            else
            {
                label.setText("Hello mature!");
            }
        }
    }

