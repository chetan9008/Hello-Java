class Example {
    void function(int x, double y) {
        System.out.println("int : " + x + " float : " + y);
    }

    void function(double y, int x) {
        System.out.println("float : " + x + " int : " + y);
    }
}



public class symbolicConstant {
    public static void main(String[] args) {
        final int VALUE = 2;
        System.out.println(VALUE);

        int example_var1 = 89;
        System.out.println((short) (example_var1));// data loss
        System.out.println((long) (example_var1));
        System.out.println((double) (example_var1));
        System.out.println((char) (example_var1));
        System.out.println((float) (example_var1));
        System.out.println((int) (example_var1));

        System.out.println("\n");
        double example_var2 = 90.23;
        System.out.println((int) example_var2);
        System.out.println((char) example_var2);
        System.out.println((double) example_var2);

        Example ex = new Example();
        ex.function(2.2,2);
    }
}
