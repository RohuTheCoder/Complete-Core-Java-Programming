package org.tutorial.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Student2
{
    String name;
    int roll;
    int marks;

    Student2(String n,int r,int m){
        name = n;
        roll = r;
        marks = m;
    }

    public String getName() {
        return name;
    }

    public int getRoll() {
        return roll;
    }

    public int getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "Student2{name='" + name + "', roll=" + roll + ", marks=" + marks + "}";
    }

}
public class ExampleNine {
    public static void main(String[] args) {
        Student2 s[] = {new Student2("aac", 110, 78),new Student2("aks", 111, 79),new Student2("pkh", 112,90)};
        Map<Integer,List<Student2>> m = Arrays.stream(s)
                .collect(Collectors.groupingBy(Student2::getMarks));

        System.out.println("Map:"+m);
    }
}
