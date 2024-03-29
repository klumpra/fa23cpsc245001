import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JFileChooser;
import java.io.*;
public class MainFrame extends JFrame implements ActionListener {
    private ArrayList<Circle> circles;
    private JMenuItem miLogin;
    private JMenuItem miLogout;
    private CircleDetailPanel cdp;
    private JButton btnAddCircle;
    public void setupMenu() {
        JMenuBar mbar = new JMenuBar();
        setJMenuBar(mbar);
        JMenu mnuFile = new JMenu("File");
        mbar.add(mnuFile);
        miLogin = new JMenuItem("Log in");
        miLogin.addActionListener(this);
        miLogout = new JMenuItem("Log out");
        JMenuItem miSave = new JMenuItem("Save");
        JMenuItem miExit = new JMenuItem("Exit");
        mnuFile.add(miLogin);
        mnuFile.add(miLogout);
        miLogout.addActionListener(this);
        mnuFile.add(miSave);
        miSave.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser chooser = new JFileChooser();
                File f;
                if (chooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
                    f = chooser.getSelectedFile();
                    if (CircleWriter.writeToFile(f,circles)) {
                        JOptionPane.showMessageDialog(null,"Circles were saved.");
                    } else {
                        JOptionPane.showMessageDialog(null,"Could not save the circles.");
                    }
                }
            }
        });
        mnuFile.add(miExit);
        miExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        JMenu mnuHelp = new JMenu("Help");
        mbar.add(mnuHelp);
        JMenuItem miAbout = new JMenuItem("About");
        miAbout.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Circle App GUI Version CPSC 245000");
            }
        });
        mnuHelp.add(miAbout);
    }
    public void setupGUI() {
        setBounds(100,100,500,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Circles");
        Container c = getContentPane();
        c.setLayout(new BorderLayout());
        cdp = new CircleDetailPanel();
        SummaryPanel sumPan = new SummaryPanel(circles);
        c.add(cdp,BorderLayout.WEST);
        c.add(sumPan,BorderLayout.EAST);
        JPanel panSouth = new JPanel();
        btnAddCircle = new JButton("Add Circle");
        btnAddCircle.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double x=0,y=0,radius=0, totalArea;
                ArrayList<String> errors = new ArrayList<String>();
                try {
                    x = cdp.getXVal();
                } catch (Exception ex) {
                    errors.add("The x value must be numeric.");
                }
                try {
                    y = cdp.getYVal();
                } catch (Exception ex) {
                    errors.add("The y value must be numeric.");
                }
                try {
                    radius = cdp.getRadius();
                } catch (Exception ex) {
                    errors.add("The radius must be numeric.");
                }
                String comment = cdp.getComment();
                String errorMessage = "";
                if (errors.size() > 0) {
                    for (String error: errors) {
                        errorMessage = errorMessage + error + " ";
                    }
                    JOptionPane.showMessageDialog(null,"These errors occurred: " + errorMessage);
                } else {
                    Circle c = new Circle(x,y,radius,comment);
                    circles.add(c);
                    sumPan.updateList();
                    cdp.clearEntries();
                    totalArea = Circle.getTotalArea(circles);
                    sumPan.setSummaryLabel(String.format("Total area = %.2f",totalArea));
                    repaint();    // refreshes the frame's appearance
                }
            }
        });
        panSouth.setLayout(new FlowLayout());
        panSouth.add(btnAddCircle);
        c.add(panSouth,BorderLayout.SOUTH);
        setupMenu();
        enableEntries(false); // disables all the entries at the start
    }
    public MainFrame(ArrayList<Circle> circles) {
        this.circles = circles;
        setupGUI();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        LoginForm dlgLogin;
        if (e.getSource() == miLogin) {
            dlgLogin = new LoginForm(this,"Log in",true);
            dlgLogin.setVisible(true);
            if (dlgLogin.isLoggedIn()) {
                enableEntries(true);
            } else {
                enableEntries(false);
            }
        } else if (e.getSource() == miLogout) {
            enableEntries(false);
        }
    }
    public void enableEntries(boolean enableYN) {
        cdp.enableEntries(enableYN);
        btnAddCircle.setEnabled(enableYN);
    }
}
