interface Test
{
    interface Yes
    {
        void show();
    }
}
class Testing implements Test.Yes
{
    public void show()
    {
       System.out.println("show method of interface");
    }
}
public class NestedInterfaceExample
{
    public static void main(String[] args) {
        Test.Yes obj;
        Testing t = new Testing();
        obj = t;
        obj.show();
    }
}
