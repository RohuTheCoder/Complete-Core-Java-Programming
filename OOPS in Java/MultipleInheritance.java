interface Animals2 {
    void eat();
}

interface Pet {
    void play();
}

class Dogs implements Animals2, Pet {
    public void eat() {
        System.out.println("Dog eats bones.");
    }

    public void play() {
        System.out.println("Dog loves to play fetch.");
    }
}

public class MultipleInheritance
{
    public static void main(String[] args) {
        Dogs dog = new Dogs();
        dog.eat();  // Method from Animals2
        dog.play(); // Method from Pet
    }
}
