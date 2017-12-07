package homework.lesson6.edgar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FigureFrame extends JFrame {

    public FigureFrame() {
        JPanel controlPanel = new JPanel();
        JButton add = new JButton("Add");
        JButton remove = new JButton("Remove");
        controlPanel.add(add);
        controlPanel.add(remove);

        add(controlPanel, BorderLayout.NORTH);

        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addActionPerformed(e);
            }
        });

        FigureConvas convas = new FigureConvas();
        add(convas, BorderLayout.CENTER);
        setSize(900, 700);
        setLocation(150, 150);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

    }

    private void addActionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(this, "Hi");
    }

    public static void main(String[] args) {
        FigureFrame frame = new FigureFrame();
    }
}
