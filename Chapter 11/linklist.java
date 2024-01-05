import java.util.LinkedList;

class Student {
    String name;

    Student(String n) {
        name = n;
    }

    public void getName() {
        System.out.println("Name is " + name);
    }
}

public class linklist {
    public static void main(String[] args) {
        // Student s1 = new Student("chetan");
        // Student s2 = new Student("gaurav");
        // Student s3 = new Student("sparsh");
        LinkedList list = new LinkedList();
        list.addFirst(new Student("chetan"));
        Student s2 = (Student)list.getFirst();
        s2.getName();
        list.add(new Student("gaurav"));
        Student s3 = (Student)list.getLast();
        s3.getName();
    }
}
