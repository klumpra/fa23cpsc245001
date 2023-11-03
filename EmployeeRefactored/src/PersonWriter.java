import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

public class PersonWriter {
    public static void printToScreen(ArrayList<Person> persons) {
        for (Person person : persons) {
            System.out.println(person);
        }
    }
    public static boolean printToFile(ArrayList<Person> persons, String fileName) {
        try {
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(new File(fileName))));
            for (Person person: persons) {
                pw.println(person);
            }
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
}
