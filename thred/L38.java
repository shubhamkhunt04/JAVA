class A extends Thread //In this we can not iniherited any class in class A
{
  @Override
  public void run() {
      for(int i=0;i<20;i++)
      {
          System.out.println("thread A"+i);
      }
  }
}
class B extends Thread
{
    @Override
  public void run() {
      for(int i=0;i<20;i++)
      {
          System.out.println("thread B"+i);
      }
  }
}
class L38
{
    public static void main(String[] args) {
        
       A ob=new A();
       B ob2=new B();
       ob.start();
       ob2.start();
    }
}