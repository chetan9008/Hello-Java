public class ifElseLadder {
    public static void main(String[] args) {
        int marks[] = {81,75,43,58};
        String status;
        for(int i=0;i<marks.length;i++)
        {
            if(marks[i] > 79)
            status = "Honors";
            else if(marks[i] > 59)
            status = "I Divison";
            else if(marks[i] > 49)
            status = "II Division";
            else 
            status = "Fail";

            System.out.println("Student " + (i+1) +" is " + status);
        }

    }
}
