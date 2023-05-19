import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
       List<Integer> numbers = new LinkedList<Integer>();
       List<String>  names = new LinkedList<String>();

       numbers.add(1);
       numbers.add(2);
       numbers.add(3);

       names.add("Navin");
       names.add("Peter");
       names.add("Ameer");

       System.out.println("List of Numbers:"+numbers+"\nList of names:"+names);
       names.remove("Peter");
       System.out.println(names);
       
    }
}
