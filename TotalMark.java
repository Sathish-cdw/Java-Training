package task1;

class Student
{
    String name;
    int rollNo;

    Student() {
        name = "null";
        rollNo = 1;
    }

    public void setDetails(String name, int rollNo)
    {
        this.name = name;
        this.rollNo = rollNo;
    }
}

class Exam extends Student
{
    int m1;
    int m2;
    int m3;

    public void setMarks(int m1, int m2, int m3)
    {
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }
}

class Result extends Exam 
{
    public int totalMark() 
    {
        int res = m1 + m2 + m3;
        return res;
    }
}

public class TotalMark
{
    public static void main(String[] args)
    {
        Result result = new Result();
        result.setDetails("XYZ", 80);
        result.setMarks(80, 85, 96);
        System.out.println("The total marks calculated for the student "+result.name+" is "+result.totalMark());
    }
}