class Employee
{
    private String name;  //private field

    // Getter method to access the private field
    public String getName()
    {
        return  name;
    }

    // Setter method to modify the private field
    public void setName(String name)
    {
        this.name = name;
    }

}
public class EncapsulationExample
{
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setName("John Doe");
        System.out.println("Employee name: "+emp.getName());
    }
}
