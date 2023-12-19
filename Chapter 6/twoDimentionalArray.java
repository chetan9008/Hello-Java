public class twoDimentionalArray {
    public static void main(String[] args) {
        int array[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = j + 1;
            }
        }
        int arraySecond[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arraySecond[i][j] = j + 10;
            }
        }
        int result[][]= new int[3][3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                result[i][j] = array[i][j] + arraySecond[i][j];
            }
        }
        twoDimentionalArray a = new twoDimentionalArray();
        System.out.println("Addition of two matrices is :");
        a.display(result);
    }

    public void display(int array[][]) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
