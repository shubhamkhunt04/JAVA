class A
{
    public void fun()
    {
        System.out.println("fun A");
    }
}
class B extends A
{

    public void fun()
    {
        System.out.println("fun B");
        super.fun();
    }
}

class L19
{
    public static void main(String args[])
    {
         B obj=new B();
         obj.fun();

    }
}