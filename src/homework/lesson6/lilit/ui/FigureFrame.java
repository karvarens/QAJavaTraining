package homework.lesson6.lilit.ui;

import javax.swing.*;
import java.awt.*;

public class FigureFrame extends JFrame {
    private FigureCanvas canvas;
    private JPanel controlPanel;
    JButton addButton = new JButton("Add");
    JButton removeButton = new JButton("Remove");

    public FigureFrame() {
        controlPanel = new JPanel();

        controlPanel.add(addButton);
        controlPanel.add(removeButton);

        canvas = new FigureCanvas();

        add(controlPanel, BorderLayout.NORTH);
        add(canvas, BorderLayout.CENTER);

        setSize(1000, 500);
        setTitle("My First JFrame window");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public FigureCanvas getCanvas() {
        return canvas;
    }
}

