public class string {
    public static void main(String[] args) {
        Sorting();
        String name = new String("Chetan");
        System.out.println(name);
        char ch[] = new char[5];
        for (int i = 0; i < 5; i++) {
            ch[i] = (char) (i + 80);
        }

        for (char character : ch) {
            System.out.println(character);
        }

        // String Methods
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        String Name = name.replace('C', 'K');
        System.out.println(Name);
        name = "              You are       fucking boy         ";
        Name = name.trim();
        System.out.println(Name);
        name = "chetan";
        Name = "Chetan";
        System.out.println(name.equals(Name));
        System.out.println(name.equalsIgnoreCase(Name));
        System.out.println(name.length());
        System.out.println(name.charAt(0));
        System.out.println(name.compareTo(Name));
        System.out.println(name + Name);
        System.out.println(name.substring(4));
        System.out.println(name.substring(1,4));
        int number = 3;
        System.out.println(String.valueOf(number));

    }

    public static void Sorting()
    {
        String temp;
            String array[] = {"aaditya","aman","amaan"};
            for(int i=0;i<array.length;i++)
            {
                for(int j=i+1;j<array.length;j++)
                {
                    if(array[i].compareTo(array[j]) >0)
                    {
                        temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }

            for(String valueOf : array)
            {
                System.out.println(valueOf);
            }
    }
}
