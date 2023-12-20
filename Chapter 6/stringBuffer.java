public class stringBuffer {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("chetan");
        System.out.println(str);
        str = str.append("Kumar");
        System.out.println(str);
        System.out.println(str.length());
        System.out.println(str.indexOf("Kumar"));
        str.setLength(10);
        System.out.println(str);
        str.append("r");
        System.out.println(str);
        str.setCharAt(0, 'K');
        System.out.println(str);
        System.out.println(str.toString() + " is good");
    }
}
