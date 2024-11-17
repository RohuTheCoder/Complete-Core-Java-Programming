abstract class Shape
{
    abstract void draw();  //Abstract method
}
class Circle extends Shape
{
    void draw()
    {
        System.out.println("Drawing a Circle.");
    }
}
public class AbstractClassesExample
{
    public static void main(String[] args) {
       Shape shape = new Circle();// Abstract type reference
       shape.draw();
    }
}
