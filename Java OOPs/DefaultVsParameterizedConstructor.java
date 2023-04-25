class Human
{
    private int age;
    private String name;
 
    public Human() {
        age = 12;
        name = "John";
    }
    public Human(int a, String n) {
        age = a;
        name = n;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
  
}

class DefaultVsParameterizedConstructo
{
    public static void main(String[] args) {
        Human obj = new Human();
        System.out.println(obj.getName()+":"+obj.getAge());
        Human obj1 = new Human(18, "Navin");
        System.out.println(obj1.getName()+":"+obj1.getAge());
    }
}