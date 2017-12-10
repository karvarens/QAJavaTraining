package homework.lesson6.davidgevorgyan.figure;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

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
        canvas.addComponentListener(new FrameListen());
        setSize(900, 600);
        setLocation(100,100);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Figures");
        setVisible(true);
    }

    private void addActionPerformed (ActionEvent e) {
        homework.lesson6.davidgevorgyan.figure.Figure tempFigure;
        tempFigure = FigureCanvas.randomFigure(canvas.getWidth(),canvas.getHeight());
        canvas.add(tempFigure);


    }

    private void removeActionPerformed (ActionEvent e) {
        canvas.remove();
    }
    private class FrameListen implements ComponentListener{
        public void componentHidden(ComponentEvent arg0) {
        }
        public void componentMoved(ComponentEvent arg0) {
        }
        public void componentResized(ComponentEvent arg0) {
                canvas.setCanvasSize(canvas.getWidth(),canvas.getHeight());
        }
        public void componentShown(ComponentEvent arg0) {
        }
    }
}
