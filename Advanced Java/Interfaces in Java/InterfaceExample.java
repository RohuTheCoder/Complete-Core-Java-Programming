interface E
{
    int age = 44;
    String area = "Mumbai";
    void show();
    void config();
}
class F implements E
{
    public void show()
    {
        System.out.println("In Show");
    }
    public void config()
    {
        System.out.println("In Config");
    }
}
public class InterfaceExample
{
    public static void main(String[] args) {
     E obj = new F();
     obj.show();
     obj.config();
     System.out.println(obj.age);
     System.out.println((obj.area));
    }
}
