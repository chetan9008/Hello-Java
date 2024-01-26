import java.io.Serializable;

class JavaBeans implements Serializable {
    private String name;

    JavaBeans(){}

    String getString()
    {
        return name;
    }

    void setString(String name)
    {
        this.name = name;
    }
}

public class javabeansExample {
    public static void main(String[] args) {
        JavaBeans bean = new JavaBeans();
        bean.setString("chetan");
        String variable = bean.getString();
        System.out.println("Name is " + variable);
    }
}
