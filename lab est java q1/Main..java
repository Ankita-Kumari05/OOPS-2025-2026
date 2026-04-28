public class Main {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        try
        {
            int c=a/b;
            System.out.println(c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception occured");
        }

        finally
        {
            int sum=a+b;
            System.out.println("Finally block");
            System.out.println("Sum :"+sum);
        }
    }
}
