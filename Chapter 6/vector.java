import java.io.*;
import java.util.Vector;

public class vector {

@SuppressWarnings("all")
    public static void main(String[] args) {
        Vector vec = new Vector();
        for (int i = 0; i < 5; i++) {
            vec.add(i + 1);
        }
        for (int i = 0; i < vec.size(); i++) {
            System.out.println(vec.elementAt(i));
        }
    }
}