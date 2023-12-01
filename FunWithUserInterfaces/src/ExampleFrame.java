import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JFileChooser;
import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
/**
 * demonstrates how to put together a simple user interface consisting of a label,
 * a text field, and a button
 */
public class ExampleFrame extends JFrame implements ActionListener {
    private JTextField txtText;
    private JButton btnClose;
    public void setupMenu() {
        JMenuBar bar = new JMenuBar();
        setJMenuBar(bar);
        JMenu mnuFile = new JMenu("File");
        bar.add(mnuFile);
        JMenuItem miSayHi = new JMenuItem("Say Hi");
        mnuFile.add(miSayHi);
        miSayHi.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Hi!");
            }
        });
        JMenuItem miSave = new JMenuItem("Save");
        mnuFile.add(miSave);
        miSave.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser chooser = new JFileChooser();
                if (chooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
                    File f = chooser.getSelectedFile();
                    try {
                        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(f)));
                        pw.println(txtText.getText());
                        pw.close();
                        JOptionPane.showMessageDialog(null,"It was saved.");
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null,"It could not be saved.");
                    }
                }
            }
        });
        JMenuItem miExit = new JMenuItem("Exit");
        mnuFile.add(miExit);
        miExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        JMenu mnuHelp = new JMenu("Help");
        bar.add(mnuHelp);
        JMenuItem miAbout = new JMenuItem("About");
        mnuHelp.add(miAbout);
        miAbout.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"This is the greatest thing ever.");
            }
        });
    }
    public void setupGUI() {
        setTitle("Example User Interace");
        setBounds(100, 100, 400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new BorderLayout());
        JPanel panSouth = new JPanel();
        panSouth.setLayout(new FlowLayout());
        JButton btnOK = new JButton("Press Me!");
        btnOK.addActionListener(this);  // the frame will be the action listener
        panSouth.add(btnOK);
        btnClose = new JButton("Close");
        btnClose.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        panSouth.add(btnClose);
        c.add(panSouth,BorderLayout.SOUTH);
        JPanel panCenter = new JPanel();
        JLabel lblText = new JLabel("Enter the text: ");
        txtText = new JTextField(20);
        txtText.addActionListener(this);
        panCenter.setLayout(new FlowLayout());
        panCenter.add(lblText);
        panCenter.add(txtText);
        c.add(panCenter,BorderLayout.CENTER);
        setupMenu();
    }
    public ExampleFrame() {
        setupGUI();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == txtText) {
            JOptionPane.showMessageDialog(null,"You hit enter in the text field.");
        } /*else if (e.getSource() == btnClose) {
            System.exit(0);
        } */ else {
            JOptionPane.showMessageDialog(null,txtText.getText());
        }
    }
}
