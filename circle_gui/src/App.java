import java.util.ArrayList;
public class App {
    public static void main(String[] args) {
        ArrayList<Circle> circles = new ArrayList<Circle>();
        MainFrame frame = new MainFrame(circles);
        frame.setVisible(true);
    }
}
