class Shapes {
    void display() {
        System.out.println("This is a shape.");
    }
}

class Circles extends Shapes {
    void area() {
        System.out.println("Area of circle: πr²");
    }
}

class Rectangle extends Shapes {
    void area() {
        System.out.println("Area of rectangle: length × width");
    }
}
public class HierarchicalInheritance
{
    public static void main(String[] args) {
        Circles circle = new Circles();
        circle.display(); // Inherited from Shape
        circle.area();    // Defined in Circle

        Rectangle rectangle = new Rectangle();
        rectangle.display(); // Inherited from Shape
        rectangle.area();    // Defined in Rectangle
    }
}
