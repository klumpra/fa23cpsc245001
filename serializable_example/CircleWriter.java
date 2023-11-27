import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.beans.XMLEncoder;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
public class CircleWriter {
    public static boolean writeToBinaryFile(ArrayList<Circle> circles, String fname) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File(fname)));
            oos.writeObject(circles);
            oos.close();
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
    public static boolean writeToXMLFile(ArrayList<Circle> circles, String fname) {
        try {
            XMLEncoder xml = new XMLEncoder(new FileOutputStream(new File(fname)));
            xml.writeObject(circles);
            xml.close();
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
	public static boolean writeToJSONFile(ArrayList<Circle> circles,String fname) {
		try {
			PrintWriter pw = new PrintWriter(new BufferedWriter(
					new FileWriter(new File(fname))));
			JSONObject obj;
			JSONArray arr = new JSONArray();
			for (Circle c: circles) {
				obj = new JSONObject();
				obj.put("x", c.getX());
				obj.put("y", c.getY());
				obj.put("radius", c.getRadius());
				arr.add(obj);
			}
			pw.println(arr.toJSONString());
			pw.close();
			return true;
		} catch (Exception ex) {
			return false;
		}
	}
}


