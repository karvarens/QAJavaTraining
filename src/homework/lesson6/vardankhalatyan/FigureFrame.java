package homework.lesson6.vardankhalatyan;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class FigureFrame extends JFrame {

    private String panelName = "Figures";
    private String addButtonName = "Add Figure";
    private String removeButtonName = "Remove Figure";

    public FigureFrame() {
        JFrame frames = new JFrame();
        frames.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frames.setSize(900,500);
        frames.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBounds(0,0,frames.getWidth(),50);
        JButton addFigure = new JButton(getAddButtonName());
        JButton removeFigure = new JButton(getRemoveButtonName());

        addFigure.addActionListener(this::add);
        panel.add(addFigure);
        panel.add(removeFigure);

        FigureCanvas canvas = new FigureCanvas();
        canvas.setBounds(0, panel.getHeight(),frames.getWidth(), frames.getHeight() - panel.getHeight());


        frames.add(panel);
        frames.add(canvas, BorderLayout.CENTER);
        frames.setTitle(getPanelName());

        frames.setVisible(true);
    }

    private void add(ActionEvent actionEvent) {
        Circle crcl = new Circle(100, 100, 30, Color.RED);
        canvas.add(crcl);
        repaint();
    }

    private FigureCanvas canvas = new FigureCanvas();



    public String getPanelName() {
        return panelName;
    }

    public String getAddButtonName() {
        return addButtonName;
    }

    public String getRemoveButtonName() {
        return removeButtonName;
    }

    public void setPanelName(String panelName) {
        this.panelName = panelName;
    }

    public void setAddButtonName(String addButtonName) {
        this.addButtonName = addButtonName;
    }

    public void setRemoveButtonName(String removeButtonName) {
        this.removeButtonName = removeButtonName;
    }


    public static void main(String[] args) {
        FigureFrame fgf = new FigureFrame();
        Circle crcl = new Circle(300, 300, 33, Color.RED);
        FigureCanvas fgc = new FigureCanvas();
        fgc.add(crcl);
        fgf.add(fgc);
    }

}
