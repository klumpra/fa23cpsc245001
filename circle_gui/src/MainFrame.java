import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;
import java.util.ArrayList;
public class MainFrame extends JFrame {
    private ArrayList<Circle> circles;
    public void setupGUI() {
        setBounds(100,100,500,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Circles");
        Container c = getContentPane();
        c.setLayout(new BorderLayout());
        CircleDetailPanel cdp = new CircleDetailPanel();
        SummaryPanel sumPan = new SummaryPanel(circles);
        c.add(cdp,BorderLayout.WEST);
        c.add(sumPan,BorderLayout.EAST);
        JPanel panSouth = new JPanel();
        JButton btnAddCircle = new JButton("Add Circle");
        btnAddCircle.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double x = cdp.getXVal();
                double y = cdp.getYVal();
                double radius = cdp.getRadius();
                String comment = cdp.getComment();
                Circle c = new Circle(x,y,radius,comment);
                circles.add(c);
                sumPan.updateList();
                repaint();    // refreshes the frame's appearance
            }
        });
        panSouth.setLayout(new FlowLayout());
        panSouth.add(btnAddCircle);
        c.add(panSouth,BorderLayout.SOUTH);
    }
    public MainFrame(ArrayList<Circle> circles) {
        this.circles = circles;
        setupGUI();
    }
}
