abstract class Person
{  
    abstract public void getdata(int a,int i);
    abstract public void showdata();
}

class Student extends Person
{
    private int age,id_no;
    public void getdata(int a,int i)
    {
          age=a;
          id_no=i;
    }
    public void showdata()
    {
        System.out.println("age : "+age);
        System.out.println("Id_no : "+id_no);
    }
}
class Faculty extends Person
{
    private int age,id_no;
    public void getdata(int a,int i)
    {
          age=a;
          id_no=i;
    }
    public void showdata()
    {
        System.out.println("age : "+age);
        System.out.println("Id_no : "+id_no);
    }
}

class L24
{
    public static void main(String args[])
    {
       Faculty o1=new Faculty();
       o1.getdata(20,8);
       o1.showdata();

       Student s1=new Student();
       s1.getdata(10, 4);
       s1.showdata();

    }
}