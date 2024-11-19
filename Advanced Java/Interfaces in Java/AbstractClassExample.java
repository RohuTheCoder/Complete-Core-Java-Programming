abstract class Car1
{
    public  abstract void drive();
    public void playMusic()
    {
        System.out.println("Play Music...");
    }
}
class WagonR extends Car1
{
    public void drive()
    {
        System.out.println("Driving...");
    }
}
public class AbstractClassExample
{
    public static void main(String[] args) {
        Car1 obj = new WagonR();
        obj.drive();
        obj.playMusic();
    }
}
