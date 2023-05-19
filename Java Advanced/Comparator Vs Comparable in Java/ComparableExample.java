import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>
{
    int age;
    String name;
    public Student(int age,String name)
    {
        this.age = age;
        this.name = name;
    }
    public String toString()
    {
        return "Student [age="+age+",name="+name+"]";
    }
    public int compareTo(Student that)
    {
        if(this.age>that.age)
            return 1;      //swapping
        else
            return -1;    //no swapping
    }
}

public class ComparableExample {
    public static void main(String[] args) {
        List<Student> nums = new ArrayList<Student>();

        nums.add(new Student(21, "Navin"));
        nums.add(new Student(12, "John"));
        nums.add(new Student(18,"Parul"));
        nums.add(new Student(20, "Kiran"));

        Collections.sort(nums);
        for(Student s : nums)
        {
            System.out.println(s);
        }
    }
}
