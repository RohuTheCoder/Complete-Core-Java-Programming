package org.tutorial.stream;

import java.util.Arrays;
import java.util.List;

//find the first element of the list using Stream functions
public class ExampleThirteen {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        myList.stream()
                .findFirst()
                .ifPresent(System.out::println);
    }
}
