abstract class Car
{
    public abstract void drive();

    public void playMusic()
    {
        System.out.println("play music");
    }   
}

class WagonR extends Car
{
    public void drive()
    {
        System.out.println("Driving...");
    }
}

class AbstractKeyword
{
    public static void main(String[] args) {
        Car obj = new WagonR();
        obj.drive();
        obj.playMusic();       
    }
}