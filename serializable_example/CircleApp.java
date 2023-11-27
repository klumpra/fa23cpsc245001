import java.util.ArrayList;
public class CircleApp {
    public static void main(String[] args) {
        ArrayList<Circle> circles = new ArrayList<Circle>();
        circles.add(new Circle(1,2,3));
        circles.add(new Circle(4,5,6));
        circles.add(new Circle(7,8,9));
        ArrayList<Circle> readBack;
        if (CircleWriter.writeToBinaryFile(circles, "c:\\temp\\circles.bin")) {
            System.out.println("Written to file. Now going to read back.");
            readBack = CircleReader.readFromFile("c:\\temp\\circles.bin");
            if (readBack != null) {
                for (Circle c:readBack) {
                    System.out.println(c);
                }
            }
        }
        if (CircleWriter.writeToXMLFile(circles, "c:\\temp\\circles.xml")) {
            System.out.println("Written to xml file. Now going to read back.");
            readBack = CircleReader.readFromXMLFile("c:\\temp\\circles.xml");
            if (readBack != null) {
                for (Circle c: readBack) {
                    System.out.println(c);
                }
            }
        }
        /*
        if (CircleWriter.writeToJSONFile(circles, "c:\\temp\\circles.json") ) {
            System.out.println("Written to json file. Now going to read back.");
            readBack = CircleReader.readFromJSON("c:\\temp\\circles.json");
            if (readBack != null) {
                for (Circle c : readBack) {
                    System.out.println(c);
                }
            }
        }
        */
    }
}