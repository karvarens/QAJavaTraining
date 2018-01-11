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
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900,500);
        setLayout(null);

        JPanel panel = new JPanel();
        panel.setBounds(0,0,getWidth(),50);
        panel.setBackground(Color.RED);
        JButton addFigure = new JButton(getAddButtonName());
        JButton removeFigure = new JButton(getRemoveButtonName());

        addFigure.addActionListener(this::add);
        panel.add(addFigure);
        panel.add(removeFigure);

        canvas = new FigureCanvas();
        canvas.setBounds(0, panel.getHeight(),getWidth(), getHeight() - panel.getHeight());


        add(panel);
        add(canvas);
        setTitle(getPanelName());

        setVisible(true);
    }

    private void add(ActionEvent actionEvent) {
        Circle crcl = new Circle(100, 100, 30, Color.RED);
        canvas.add(crcl);
        repaint();
    }

    private FigureCanvas canvas;



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
//        Circle crcl = new Circle(300, 300, 33, Color.RED);
//        FigureCanvas fgc = new FigureCanvas();
//        fgc.add(crcl);
//        fgf.add(fgc);
    }

}
