class NavinException extends Exception
{
    public NavinException(String string)
    {
        super(string);
    }
}
public class CustomExceptionExample
{
    public static void main(String[] args) {
        int i = 20;
        int j = 0;
        try
        {
            j=18/i;
            if(j==0)
                throw new NavinException("I don't want to print zero");
        }
        catch (NavinException e)
        {
            j = 18/1;
            System.out.println("thats the default output "+e);
        }
        catch (Exception e)
        {
            System.out.println("Something went wrong..."+e);
        }
        System.out.println(j);
        System.out.println("Bye");
    }
}
