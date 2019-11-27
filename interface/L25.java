interface i1
{
   public void fun();
}
interface i2
{
   public void fun2();
}
class  A implements i1,i2
{
    public void fun()
    {
        System.out.println("interface 1");
    }
    public void fun2()
    {
        System.out.println("interface 2");
    }
}

class L25
{
    public static void main(String args[])
    {
        A obj=new A();
        obj.fun();
        obj.fun2();

        i1 obj1= new A();
        obj1.fun();
        //  obj1.fun2();->error bcz interface reference variable(i1) only call there body funtion fun(). 

        i2 obj2=new A();
        obj2.fun2();
    }
}