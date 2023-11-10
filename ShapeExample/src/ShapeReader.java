import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
/**
 * Our Data Access Object (DAO) class. It's a kind of model class because it deals with the data.
 * It reads a tab-delimited file of the format produced by ShapeWriter.printToFile
 */
public class ShapeReader {
    public static ArrayList<Shape> readFromFile(String fileName) {
        try {
            ArrayList<Shape> result = new ArrayList<Shape>();
            Scanner fsc = new Scanner(new File(fileName));
            String line;
            String[] parts;
            String shapeType;
            double x, y, radius, length, width;
            while (fsc.hasNextLine()) {
                line = fsc.nextLine().trim();
                parts = line.split("\t");
                shapeType = parts[0].toLowerCase();
                x = Double.parseDouble(parts[1]);
                y = Double.parseDouble(parts[2]);
                if (shapeType.equals("circle")) {
                    radius = Double.parseDouble(parts[3]);
                    result.add(new Circle(x,y,radius));
                } else if (shapeType.equals("rectangle")) {
                    length = Double.parseDouble(parts[3]);
                    width = Double.parseDouble(parts[4]);
                    result.add(new Rectangle(x,y,length,width));
                }
            }
            fsc.close();
            return result;
        } catch (Exception ex) {
    //        ex.printStackTrace();
            return null;  // basically means we couldn't produce an array list
        }
    }
}
