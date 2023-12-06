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
    private JLabel lblSummary;
    public void setupGUI() {
        setLayout(new BorderLayout());
        lblSummary = new JLabel("Circle Summary");
        add(lblSummary,BorderLayout.NORTH);
        tarSummary = new JTextArea(10,30);
        tarSummary.setEditable(false);
        add(tarSummary,BorderLayout.CENTER);
    }
    public void setSummaryLabel(String text) {
        lblSummary.setText(text);
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
