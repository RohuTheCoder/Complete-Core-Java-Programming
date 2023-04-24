class Human
{
    int age;
    String name;

    public Human()
    {
        age = 12;
        name = "John";
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
class Constructor
{
    public static void main(String[] args) {
        Human obj = new Human();
        System.out.println(obj.getName()+":"+obj.getAge());
    }
}