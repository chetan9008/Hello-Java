public class dowhileLoop {
    public static void main(String arg[]) {
        int array[] = { 1, 2, 3 };
        int multiple = 1;
        do {
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] * multiple + "\t");
            }
            System.out.println();
            multiple++;
        } while (multiple  <=3);

    }
}
