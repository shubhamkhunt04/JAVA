class use
{
    private static int a;
     void signup()
        {
            a++;
        }
        void show()
        {
            System.out.println("Total user "+a);
        }
        public static void hello()
        {
            System.out.println("this is static");
        }
        static class Test
        {
            public static String s1="hello shubham";
        }
}
class raf
{
    public static void main(String[] args) {
      use o1=new use();
      o1.signup();
      o1.show();
      use o2=new use();
      o2.signup();
      o2.show();
     System.out.println( use.Test.s1);
    }
}