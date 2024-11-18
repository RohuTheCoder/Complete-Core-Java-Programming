class Vehicles1 {
    void start() {
        System.out.println("Vehicle is starting.");
    }
}

class Cars extends Vehicles1 {
    void drive() {
        System.out.println("Car is driving.");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Cars myCar = new Cars();
        myCar.start(); // Inherited from Vehicles1
        myCar.drive(); // Defined in Car
    }
}


