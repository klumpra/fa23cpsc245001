import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextArea;
import java.util.ArrayList;
/*
 * occupies the east side of the frame
 */
public class SummaryPanel extends JPanel {
    private ArrayList<Circle> circles;
    private JTextArea tarSummary;
    public void setupGUI() {
        setLayout(new BorderLayout());
        add(new JLabel("Circle Summary"),BorderLayout.NORTH);
        tarSummary = new JTextArea(10,30);
        add(tarSummary,BorderLayout.CENTER);
    }
    public SummaryPanel(ArrayList<Circle> circles) {
        this.circles = circles;
        setupGUI();
    }
    public void updateList() {
        tarSummary.setText("");
        String text = "";
        for (Circle c : circles) {
            text = text + c + "\n";
        }
        tarSummary.setText(text);
    }
}
