import java.util.Enumeration;
import java.util.Hashtable;

import java.util.Iterator;

public class hashtable {
    public static void main(String[] args) {
        Hashtable map = new Hashtable();
        map.put("item1", "Apple");
        map.put("item2", "Banana");
        map.put("item3", "PineApple");
        map.put("item4", "Orange");
        String str = (String) map.get("item1");
        System.out.println("value of str is " + str);
        Enumeration e = map.keys();
        while (e.hasMoreElements()) {
            String key = (String)e.nextElement();
            System.out.println("key is " + key + " value is " + map.get(key));
        }
    }
}
