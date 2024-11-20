import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student2
{
    int age;
    String name;
    public Student2(int age,String name)
    {
        this.age = age;
        this.name = name;
    }
    public String toString()
    {
        return "[Student age="+age+",name="+name+"]";
    }
}
public class ComparatorInterfaceExample
{
    public static void main(String[] args) {
        Comparator<Student2> com = new Comparator<Student2>() {
            public int compare(Student2 i, Student2 j) {
               if(i.age> j.age)
                   return 1;
               else
                   return -1;
            }
        };
        List<Student2> nums = new ArrayList<>();
        nums.add(new Student2(21,"Navin"));
        nums.add(new Student2(12,"John"));
        nums.add(new Student2(18,"Parul"));
        nums.add(new Student2(20,"Kiran"));
        Collections.sort(nums,com);
        for(Student2 s:nums)
        {
            System.out.println(s);
        }
    }
}
