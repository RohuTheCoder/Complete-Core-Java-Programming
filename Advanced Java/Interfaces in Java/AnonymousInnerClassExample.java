class B
{
    public void show()
    {
       System.out.println("In B Show");
    }
}
public class AnonymousInnerClassExample
{
    public static void main(String[] args) {
       B obj = new B() {

           public void show() {
                System.out.println("In new Show");
           }
       };
       obj.show();
    }
}
