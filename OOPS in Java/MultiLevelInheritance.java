class Persons {
    void sleep() {
        System.out.println("Person sleeps.");
    }
}

class Employees extends Persons {
    void work() {
        System.out.println("Employee works.");
    }
}

class Manager extends Employees {
    void manage() {
        System.out.println("Manager manages the team.");
    }
}

public class MultiLevelInheritance
{
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.sleep();  // Inherited from Person
        manager.work();   // Inherited from Employee
        manager.manage(); // Defined in Manager
    }
}
