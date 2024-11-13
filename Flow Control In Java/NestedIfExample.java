public class NestedIfExample
{
    public static void main(String[] args) {
        int age = 25;
        double weight = 65.5;

        if(age>=18)
        {
            if(weight>=50.0)
            {
                System.out.println("You are eligible to donate blood.");
            }
            else
            {
                System.out.println("You must weigh atleast 50 kilograms to donate blood.");
            }
        }
        else
        {
            System.out.println("You must be atleast 18 years old to donate blood.");
        }
    }
}
