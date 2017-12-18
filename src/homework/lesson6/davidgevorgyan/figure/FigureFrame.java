package homework.lesson6.davidgevorgyan.figure;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class FigureFrame extends JFrame {

    public FigureFrame() {

        JPanel controlPanel = new JPanel();
        JButton addButton = new JButton("Add");
        JButton removeButton = new JButton("Remove");
        JButton playPauseButton = new JButton("▶ / ll");
        JButton stopButton = new JButton("■");
        controlPanel.add(addButton);
        controlPanel.add(removeButton);
        controlPanel.add(playPauseButton);
        controlPanel.add(stopButton);
        add(controlPanel, BorderLayout.NORTH);

        canvas = new FigureCanvas();
        add(canvas, BorderLayout.CENTER);

        addButton.addActionListener(this::addActionPerformed);
        removeButton.addActionListener(this::removeActionPerformed);
        playPauseButton.addActionListener(this::playPauseActionPerformed);
        stopButton.addActionListener(this::stopActionPerformed);
        setSize(900, 600);
        setLocation(100,100);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Figures");
        setVisible(true);
    }

    public static void main(String[] args) {
        new FigureFrame();
    }

    private FigureCanvas canvas;

    private void addActionPerformed (ActionEvent e) {
        homework.lesson6.davidgevorgyan.figure.Figure tempFigure;
        tempFigure = canvas.randomFigure(canvas.getWidth(),canvas.getHeight());
        canvas.add(tempFigure);


    }

    private void removeActionPerformed (ActionEvent e) {
        canvas.remove();
    }

    private void playPauseActionPerformed (ActionEvent e) {
        canvas.playPause();
    }

    private void stopActionPerformed (ActionEvent e) {
        canvas.stop();
    }

}
