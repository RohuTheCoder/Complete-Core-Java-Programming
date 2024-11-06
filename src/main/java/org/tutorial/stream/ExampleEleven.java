package org.tutorial.stream;

import java.util.Arrays;
import java.util.List;

//find out all the numbers starting with 1 using Stream functions
public class ExampleEleven {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
        myList.stream()
                .map(x->x+" ") // Convert integer to String
                .filter(x->x.startsWith("1"))
                .forEach(System.out::println);
    }
}
