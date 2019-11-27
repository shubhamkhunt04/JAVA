/*
final method and variable is not inherited and override
final variable are default blank variable
inside the function, not initialize variable is also blank variable 
*/

class Finals {
    // private final int a; -> compiler throw error bcz final variable is not
    // initiaze with the help of constructer or initialization block or directly
    // initialize.
    private final int x;
    {
        x = 10;
    }

    public int fun() {
        return (x);
    }
}

class L17 {
    public static void main(String args[]) {
        Finals o1 = new Finals();
        System.out.println("X:- " + o1.fun());
    }
}