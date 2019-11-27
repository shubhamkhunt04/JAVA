class L34
{
    public static void main(String[] args) {
        int balance=5000;
        int withdrawal=6000;
        try{
            if(balance<withdrawal)
            throw new ArithmeticException("insufficient amount");
            balance=balance-withdrawal;
            System.out.println("taransaction is succesfull");
        }
        catch(ArithmeticException e)
        {
            System.out.println("Exeption is :"+e.getMessage());
        }
    }
}