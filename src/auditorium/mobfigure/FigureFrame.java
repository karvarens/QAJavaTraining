package auditorium.mobfigure;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FigureFrame extends JFrame {

    public static void main(String[] args) {
        new FigureFrame();
    }



    public FigureFrame() {

        JPanel controlPanel = new JPanel();
        JButton addButton = new JButton("Add");
        JButton removeButton = new JButton("Remove");
        controlPanel.add(addButton);
        controlPanel.add(removeButton);

        add(controlPanel, BorderLayout.NORTH);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addActionPerformed(e);
            }
        });

        FigureCanvas canvas = new FigureCanvas();

        add(canvas, BorderLayout.CENTER);

        setSize(900, 600);
        setLocation(100,100);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void addActionPerformed (ActionEvent e) {
        JOptionPane.showMessageDialog(this, "kuku from add button");
    }
}
