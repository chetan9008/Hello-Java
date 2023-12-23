class Student {
    int rollNo;
    String name;
    Student(int r,String n)
    {
        rollNo = r;
        name = n;
    }
}

interface SportsKota{
    int extraMarks =  10;
    void display();
    void showExMarks();
}

interface Marks{
    int maths =  80;
    int science = 70;
    int computer = 90;
}

class Result extends Student implements SportsKota,Marks
{
    Result(int r,String n)
    {
        super(r,n);
    }
    public void showExMarks()
    {
        System.out.println("Extra Marks given by SportsKota is " +  extraMarks);
    }
    public void display()
    {
        System.out.println("Student Details and Result");
        System.out.println("Name : " + name);
        System.out.println("Roll Number : " + rollNo);
        System.out.println("Marks Obtained : "+ (maths+science+computer+extraMarks) +"/300" );
    }
}

public class mulliInheritance {
    public static void main(String[] args) {
        Result student = new Result(27, "chetan");
        student.display();
    }
}
