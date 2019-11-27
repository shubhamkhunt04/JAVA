class Box
{
    private int l,b,h;
    public void setDimention(int l,int b,int h)
    {
        this.l=l; //if not use this then output is 0.
        this.b=b;
        this.h=h;

    }
    public void showdata()
    {
        System.out.println("L="+l);
        System.out.println("B="+b);
        System.out.println("H="+h);
    }
}
class L18
{
    public static void main(String args[])
    {
        Box o1=new Box();
        o1.setDimention(5, 10, 15);
        o1.showdata();
    }
}