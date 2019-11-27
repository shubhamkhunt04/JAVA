class A
{
    int p;
   A()
   {
       System.out.println("Parent class constructor");
   }
   A(int x)//parameterize constructor is matched with super(5)->this consturctor is called...
   {
       System.out.println("Parrent argu. con.");
   }
}
class B extends A
{
    B()
    {
        super(5);//first call parent constructor and then run child class constructor.
        System.out.println("Child class constructor");
    }
}

class L21
{
    public static void main(String args[])
    {
        B obj=new B();
    }
}