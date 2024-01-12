import java.util.*;

public class algorithms {
    public static void main(String[] args) {
        ArrayList array = new ArrayList();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        System.out.println(array);
        Comparator c = Collections.reverseOrder();
        Collections.sort(array, c);
        System.out.println(array);
        Collections.shuffle(array);
        System.out.println(array);
        System.out.println(Collections.min(array));
        System.out.println(Collections.max(array));
    }
}
