package org.tutorial.stream;

import java.util.Arrays;
class Student {
    int rollno;
    String name;
    int marks;

    Student(int r, String n, int m) {
        rollno = r;
        name = n;
        marks = m;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getMarks(){
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}
public class ExampleSeven {
    public static void main(String[] args) {
        Student arr[] = {new Student(111,"bkd",57),new Student(123,"dsf",78),new Student(356,"dfg",89)};

        double av = Arrays.stream(arr)
                .mapToInt(x->x.getMarks())
                .average()
                .getAsDouble();

        System.out.println(av);

    }
}
