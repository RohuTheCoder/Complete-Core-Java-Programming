@FunctionalInterface
interface A 
{
    void show();
}

class B implements A 
{
    public void show()
    {
        System.out.println("in Show");
    }
}

class FunctionalInterfaceExample
{
    public static void main(String[] args) {
        A obj = new B();
        obj.show();
    }
}