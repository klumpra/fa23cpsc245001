import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginForm extends JDialog {
    private boolean loggedIn;
    private String password;
    public void setupGUI() {
        setBounds(300,300,300,300);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new BorderLayout());
        JPanel panCenter = new JPanel();
        panCenter.setLayout(new FlowLayout());
        panCenter.add(new JLabel("password: "));
        JPasswordField txtPassword = new JPasswordField(10);
        panCenter.add(txtPassword);
        c.add(panCenter,BorderLayout.CENTER);
        JPanel panSouth = new JPanel();
        JButton btnOK = new JButton("OK");
        btnOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String enteredPassword = new String(txtPassword.getPassword());
                if (enteredPassword.equals(password)) {
                    loggedIn = true;
                    setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(null,"You entered an incorrect password.");
                    loggedIn = false;
                }
            }
        });
        JButton btnCancel = new JButton("Cancel");
        btnCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                loggedIn = false;
                setVisible(false);
            }
        });
        panSouth.setLayout(new FlowLayout());
        panSouth.add(btnOK);
        panSouth.add(btnCancel);
        c.add(panSouth,BorderLayout.SOUTH);
    }
    public LoginForm(JFrame owner, String title, boolean modal) {
        super(owner,title,modal);
        setupGUI();
        password = "Pizza2023";
        loggedIn = false;
    }
    public boolean isLoggedIn() {
        return loggedIn;
    }
    
}
