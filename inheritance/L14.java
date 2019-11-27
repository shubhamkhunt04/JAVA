class L14
{
    public static void main(String args[])
    {
        Student s1=new Student();
        s1.getdata(8, "CGPIT");
        System.out.println("Roll number :-"+s1.data());
        System.out.println("Collage :-"+s1.coll());

        s1.getinfo(18,"shubham");//Student class object use
        System.out.println("Age:-"+s1.umar());
        System.out.println("Name:-"+s1.n());
    }
}