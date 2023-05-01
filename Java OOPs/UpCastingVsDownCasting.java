class Parent
{
    String name;
    public void method()
    {
       System.out.println("Method from Parent");   
    }
}

class Child extends Parent
{
    int id;
    @Override
    public void method()
    {
        System.out.println("Method from Child");
    }
}

class UpCastingVsDownCasting
{
    public static void main(String[] args) {
      
        Parent p = new Child();  //Upcasting
        p.name = "Avinash";
        System.out.println(p.name);
        p.method();
        Child c = (Child)p;    //DownCasting Explicitly
        //Trying to downcast implicitly
        //Child c = new Parent();  Compile time error
        c.id = 1;                 
        System.out.println(c.id);
        System.out.println(c.name);
        c.method();
    }
}