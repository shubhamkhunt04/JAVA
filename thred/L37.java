class A implements Runnable
{
   @Override
   public void run() {
       for(int i=0;i<15;i++)
       {
           System.out.println("Thread A"+i);
       }
   }
}
class B implements Runnable
{
   @Override
   public void run() {
    for(int i=0;i<15;i++)
    {
        System.out.println("Thread B"+i);
    }
   }
}
class L37
{
    public static void main(String[] args) {
        
        Thread t1 =new Thread(new A());
        Thread t2=new Thread(new B());

        t1.start();
        t2.start();
    }
}