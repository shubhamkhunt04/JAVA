package pack1;
public class Stu 
{

    private int r;
    private String n;
    public void getdata(int rollno,String name)
    {
        r=rollno;
        n=name;
    }
    public void display()
    {
        System.out.println("Roll number:-"+r);
        System.out.println("Name:-"+n);
    }
}