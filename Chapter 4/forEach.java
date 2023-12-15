import java.util.ArrayList;
import java.util.Collection;

public class forEach {
    public static void main(String[] args) {
        int array[] = { 1, 2, 3, 4 };

        // for (int value : array) {
        // System.out.print("Value is : ");
        // System.out.println(value);
        // }

        display(array);

        ArrayList<String> list = new ArrayList<String>();
        list.add("C");
        list.add("C++");
        list.add("Java");
        list.add("JavaScript");

        displayList(list);

        for (String value : list) {
            System.out.print("String is : ");
            System.out.println(value);
        }

    }
    public static void display(int array[])
    {
        for(int value : array)
        {
            System.out.println("Value is : " + value);
        }
    }

    public static<AnyType> void displayList(Collection<AnyType> array) {
        for (AnyType value : array) {
            System.out.print("Value is : ");
            System.out.println(value);
        }
    }
}
