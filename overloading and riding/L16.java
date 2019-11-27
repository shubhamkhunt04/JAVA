class A
{
     public void shiftgear()
     {
         System.out.println("car");//overriding
     }
     public void capacity(int c)//overloading
     {
         System.out.println("car capacity is  "+c);
     }
}
class B extends A
{
    public void shiftgear()
    {
        System.out.println("sportscar");//overriding
    }
    public void capacity(int c,int w)//overloading
    {
        System.out.println("sportscar capacity is  "+c);
        System.out.println("sportscar weight is  "+w);
    }
}

public class L16
{
    
    public static void main(String args[])
    {
        B obj=new B();
        obj.shiftgear();     //overriding
        A obj2=new A();
        obj2.shiftgear();

        obj.capacity(5);
        obj2.capacity(10);

        
        obj.capacity(3,40); //overloading
        //obj2.capacity(4,80);error bcz class A method.
    }
}
