public class myApproch {
    public static void main(String[] args) {
        try {
            int number = 2 / 0;
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                int array[] = { 1, 2 };
                System.out.println(array[2]);

            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
