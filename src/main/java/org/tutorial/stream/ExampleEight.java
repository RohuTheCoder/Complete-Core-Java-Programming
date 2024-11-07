package org.tutorial.stream;

import java.util.stream.Collectors;
import java.util.Map;
import java.util.Arrays;
class Student1 {
    int rollno;
    String name;
    int marks;

    Student1(int r, String n, int m) {
        rollno = r;
        name = n;
        marks = m;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}
public class ExampleEight {
    public static void main(String[] args) {
        Student1[] st = {new Student1(111,"dfg",45),new Student1(222,"rty",78),new Student1(333,"sdf",78)};
        Map<Integer,String> m = Arrays.stream(st)
                .collect(Collectors.toMap(Student1::getRollno,Student1::getName));
        System.out.println("Map:"+m);
    }
}
