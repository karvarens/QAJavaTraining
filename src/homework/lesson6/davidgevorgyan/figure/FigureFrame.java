package homework.lesson6.davidgevorgyan.figure;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class FigureFrame extends JFrame {

    public static void main(String[] args) {
        new FigureFrame();
    }


    private FigureCanvas canvas;

    public FigureFrame() {

        JPanel controlPanel = new JPanel();
        JButton addButton = new JButton("Add");
        JButton removeButton = new JButton("Remove");
        controlPanel.add(addButton);
        controlPanel.add(removeButton);
        add(controlPanel, BorderLayout.NORTH);

        canvas = new FigureCanvas();
        add(canvas, BorderLayout.CENTER);

        addButton.addActionListener(this::addActionPerformed);
        removeButton.addActionListener(this::removeActionPerformed);

//        canvas.addComponentListener(new ComponentAdapter() {
//            @Override
//            public void componentResized(ComponentEvent e) {
//                paint(getGraphics());
//            }
//        });

        setSize(900, 600);
        setLocation(100,100);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Figures");
        setVisible(true);
    }

    private void addActionPerformed (ActionEvent e) {
        homework.lesson6.davidgevorgyan.figure.Figure tempFigure;
//        tempFigure = canvas.randomFigure(canvas.getWidth(),canvas.getHeight());
        tempFigure = FigureCanvas.randomFigure(canvas.getWidth(),canvas.getHeight());
        canvas.add(tempFigure);
//        paint(getGraphics());


    }

    private void removeActionPerformed (ActionEvent e) {
        canvas.remove();
//        paint(getGraphics());

    }


}
