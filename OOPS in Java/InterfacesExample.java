interface Vehicle
{
    void start();
}
class Car implements Vehicle
{
    public void start() {
       System.out.println("Car starts with a key.");
    }
}
public class InterfacesExample
{
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        myCar.start();
    }
}
