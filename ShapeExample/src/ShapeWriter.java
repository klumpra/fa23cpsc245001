import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * The view class for Shape objects.
 * It has functions for writing shape objects to the screen and to a file.
 */
public class ShapeWriter {
    public static void printToScreen(ArrayList<Shape> shapes) {
        for (Shape s : shapes) {
            System.out.println(s.toStringDetailed());
        }
    }
    public static boolean printToFile(ArrayList<Shape> shapes, String fileName) {
        try {
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(new File(fileName))));
            for (Shape s : shapes) {
                pw.println(s);
            }
            pw.close();
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
}
