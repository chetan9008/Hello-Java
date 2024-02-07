import java.util.Vector;

/**
 * practise
 */
public class practise {

    public static void main(String[] args) {
        int array[] = {3,4,5,9,2,5,6,};
        for(int i=0;i<array.length;i++)
        {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for(int i=0;i<array.length;i++)
        {
            System.out.println(array[i]);
        }
    }
}