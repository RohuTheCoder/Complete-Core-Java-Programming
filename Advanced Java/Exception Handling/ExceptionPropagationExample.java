class G
{
    public void show() throws ClassNotFoundException
    {
        Class.forName("Calc");
    }
}
public class ExceptionPropagationExample
{
    static
    {
        System.out.println("Class Loaded");
    }

    public static void main(String[] args) {
        G obj = new G();
        try
        {
            obj.show();
        }
        catch(ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }
}
