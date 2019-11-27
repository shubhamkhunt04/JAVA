class Box
{
    private int l,w,h;
    public void fun(int length,int width,int height)
    {
        l=length;
        w=width;
        h=height;
    }
    public void display()
    {
        System.out.println("length is "+l);
        System.out.println("length is "+w);
        System.out.println("length is "+h);
    }
}

class L6
{
    public static void main(String args[])
    {
        Box ob = new Box();
        ob.fun(5,10,15);
        ob.display();
        ob = new Box();
        ob.display();
    }
}