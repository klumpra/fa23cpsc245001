import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextArea;
/*
 * This is the panel that occupies the west side of our frame
 * entries for x, y, radius and comment
 */
public class CircleDetailPanel extends JPanel {
    private JTextField txtX;
    private JTextField txtY;
    private JTextField txtRadius;
    private JTextArea tarComment; 
    public void setupGUI() {
        setLayout(new BorderLayout());
        JPanel panNorth = new JPanel();
        panNorth.setLayout(new GridLayout(3,2));
        panNorth.add(new JLabel("X Coord"));
        txtX = new JTextField(5);
        panNorth.add(txtX);
        panNorth.add(new JLabel("Y Coord"));
        txtY = new JTextField(5);
        panNorth.add(txtY);
        panNorth.add(new JLabel("Radius"));
        txtRadius = new JTextField(5);
        panNorth.add(txtRadius);
        add(panNorth,BorderLayout.NORTH);
        JPanel panComment = new JPanel();
        panComment.setLayout(new BorderLayout());
        panComment.add(new JLabel("Comment"), BorderLayout.NORTH);
        tarComment = new JTextArea(5,10);
        panComment.add(tarComment,BorderLayout.CENTER);
        add(panComment,BorderLayout.CENTER);
    }
    public CircleDetailPanel() {
        setupGUI();
    }
    public double getXVal() {
        return Double.parseDouble(txtX.getText());
    }
    public double getYVal() {
        return Double.parseDouble(txtY.getText());
    }
    public double getRadius() {
        return Double.parseDouble(txtRadius.getText());
    }
    public String getComment() {
        return tarComment.getText();
    }
}
