package org.tutorial.stream;

import java.util.Arrays;
import java.util.List;

//find out all the even numbers that exist in the list using Stream functions
public class ExampleTen {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,15,8,49,25,98,32);
        list.stream()
                .filter(x->x%2==0)
                .forEach(System.out::println);
    }
}
