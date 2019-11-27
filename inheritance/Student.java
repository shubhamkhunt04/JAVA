class Student extends Person {
    private int Rollnum;
    private String collage;

    public void getdata(int r, String col) {
        Rollnum= r ;
        collage=col;
    }

    public int data()
     {
         return(Rollnum);
    }

    public String coll() {
        return (collage);
    }
}