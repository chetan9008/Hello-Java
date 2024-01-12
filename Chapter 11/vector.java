import java.util.Iterator;
import java.util.Vector;

public class vector {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add("A");
        v.add("B");
        v.add("C");
        v.add("D");
        Iterator i = v.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
