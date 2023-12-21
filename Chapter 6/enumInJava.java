public class enumInJava {
    @SuppressWarnings("static")
    enum color {
        RED,BLUE,GREEN
    }
    public static void main(String[] args) {
        color c = color.RED;
        System.out.println(c);
        switch(c)
        {
            case RED:
            System.out.println("Color is Red");
            break;
            case BLUE:
            System.out.println("This is blue");
            break;
            case GREEN:
            System.out.println("This is green");
            break;
        }
        for(color value : c.values())
        {
            System.out.println(value);
        }
    }
}
