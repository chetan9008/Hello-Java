package Chapter_8_Package;

import java.util.Vector;

import Package.example;

public class Exercise {
    public static void main(String[] args) {
        Vector string = new Vector();
        string.add("chetan");
        string.add("chetan");
        string.add("chetan");
        string.add("chetan");
        Vector empty = new Vector();
        for(int i=0;i<string.size();i++)
        {
            if(empty.isEmpty())
            empty.add(string.elementAt(i));
            if(empty.indexOf(string.elementAt(i)) == -1)
            empty.add(string.elementAt(i));
        }
        for(int i=0;i<empty.size();i++)
        System.out.println(empty.elementAt(i));
    }
}
