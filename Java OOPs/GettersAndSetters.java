class Human
{
   int age;
   String name;
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
class GettersAndSetters
{
    public static void main(String[] args) {
    Human obj = new Human();
    obj.setAge(30);
    obj.setName("Navin");
    System.out.println(obj.getName()+":"+obj.getAge());
        
    }
}