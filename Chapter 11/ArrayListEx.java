import java.util.*;

public class ArrayListEx {
    public static void main(String[] args) {
        try{
        ArrayList array = new ArrayList();
        System.out.println("Size of array list is " + array.size());
        for(int i=0;i<5;i++)
        {
            array.add(i+1);
        }
        System.out.println(array);
        }catch(Exception e){}
    }
}
