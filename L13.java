class L13
{
    private int l,b,h;
    public L13()
    {
        l=5;
        b=10;
        h=15;
        System.out.println("l:"+l);
        System.out.println("b:"+b);
        System.out.println("h:"+h);
    }
    private L13(int a,int bb,int c)
    {
         l=a;
         b=bb;
         h=c;
         
        System.out.println("l:"+l);
        System.out.println("b:"+b);
        System.out.println("h:"+h);
    }

    public static void main(String args[])
    {
        L13 s1=new L13();
        L13 s2=new L13(10,20,30);
    }
}