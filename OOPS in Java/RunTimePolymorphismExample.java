class Animals
{
    void sound()
    {
        System.out.println("Some generic animal sound.");
    }
}
class Cat extends Animals
{
    @Override
    void sound()
    {
        System.out.println("Meow");
    }
}
public class RunTimePolymorphismExample
{
    public static void main(String[] args) {
        Animals myAnimal = new Cat();// Polymorphic behavior
        myAnimal.sound();// Calls the Cat's version

    }
}
