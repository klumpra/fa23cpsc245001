import java.util.ArrayList;
import java.util.Collections;
public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Shape> shapes = new ArrayList<Shape>();
        shapes.add(new Circle(5,10,5));
        shapes.add(new Rectangle(3,12,10,8));
        shapes.add(new Circle(12,12,50));
        shapes.add(new Rectangle(1,1,10,20));
        System.out.println("Natural sort order:");
        Collections.sort(shapes);
        ShapeWriter.printToScreen(shapes);
        System.out.println("\nSorted by area:");
        Collections.sort(shapes,new CompareShapesByArea());
        ShapeWriter.printToScreen(shapes);
        System.out.println("\nSorted by perimeter:");
        Collections.sort(shapes,new CompareShapesByPerim());
        ShapeWriter.printToScreen(shapes);
        if (ShapeWriter.printToFile(shapes,"c:\\temp\\shapes.txt")) {
            System.out.println("Successfully wrote the shapes");
        } else {
            System.out.println("Could not write the shapes.");
        }
        System.out.println("Now going to read the shapes from the file.");
        ArrayList<Shape> readFromFile = ShapeReader.readFromFile("c:\\temp\\shapes.txt");
        if (readFromFile == null) {
            System.out.println("The shapes could not be read.");
        } else {
            ShapeWriter.printToScreen(readFromFile);
        }
    }
}
