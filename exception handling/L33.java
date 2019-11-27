import java.util.Scanner;
class L33
{
    public static void main(String[] args) {
        int x,y;
        System.out.println("Enter two numbers");
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();
        try
        {
            System.out.println("the div is "+(x/y));
        }
        catch(ArithmeticException e)
        {
            System.out.println("Exception :"+e.getMessage());
        }
        finally
        {
            System.out.println("Finally done");
        }

    }
}