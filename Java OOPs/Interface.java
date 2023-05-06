interface A 
{
    int age=44;        //variables are static and final
    String area="Mumbai";

    void show();
    void config();
}

class B implements A 
{
    public void show()
    {
        System.out.println("in show");
    }
    public void config()
    {
        System.out.println("in config");    
    }
    
}

class Interface
{
    public static void main(String[] args) {
        A obj;
        obj = new B();
        obj.show();
        obj.config();
        System.out.println(A.age);
        //obj.area = "Hyderabad"; cannot assign a value to fimal variable

        System.out.println(A.area);
    }
}
