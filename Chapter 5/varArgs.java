class VariousArguments {
    static void display(int ...array)
    {
        for(int value : array)
        {
            System.out.println(value);
        }
    }
}
public class varArgs {
    public static void main(String[] args) {
        VariousArguments.display(1,2,3,4);       
    }
}
