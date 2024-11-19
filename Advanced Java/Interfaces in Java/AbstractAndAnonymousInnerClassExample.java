abstract class C
{
    public abstract void show();
}
public class AbstractAndAnonymousInnerClassExample
{
    public static void main(String[] args) {
        C obj = new C()
        {
            public void show() {
                System.out.println("In new Show");
            }
        };
        obj.show();
    }
}
