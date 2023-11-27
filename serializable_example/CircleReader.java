import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.beans.XMLDecoder;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

@SuppressWarnings("unchecked")
public class CircleReader {
    public static ArrayList<Circle> readFromFile(String fname) {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File(fname)));
            ArrayList<Circle> result = (ArrayList<Circle>)ois.readObject();
            ois.close();
            return result;
        } catch (Exception ex) {
            return null;
        }
    }
    public static ArrayList<Circle> readFromXMLFile(String fname) {
        try {
            XMLDecoder xml = new XMLDecoder(new FileInputStream(new File(fname)));
            ArrayList<Circle> result = (ArrayList<Circle>)xml.readObject();
            xml.close();
            return result;
        } catch (Exception ex) {
            return null;
        }
    }
    public static ArrayList<Circle> readFromJSON(String fname) {
        try {
            ArrayList<Circle> result = new ArrayList<Circle>();
            FileReader reader = new FileReader(new File(fname));
            JSONParser parser = new JSONParser();
            JSONArray arr = (JSONArray)parser.parse(reader);
            Iterator<JSONObject> itr = arr.iterator();
            JSONObject obj;
            double x, y, radius;
            while (itr.hasNext()) {
               obj = itr.next();
               x = Double.parseDouble(obj.get("x").toString());
               y = Double.parseDouble(obj.get("y").toString());
               radius = Double.parseDouble(obj.get("radius").toString());
               result.add(new Circle(x,y,radius));
            }
            reader.close();
            return result;
        } catch (Exception ex) {
            return null;
        }
    }
}

