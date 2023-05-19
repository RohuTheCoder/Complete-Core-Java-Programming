import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
      TreeSet<Integer> numbers = new TreeSet<>();
      TreeSet<Integer> evenNumbers = new TreeSet<>();

      numbers.add(1);
      numbers.add(3);
      numbers.add(5);
      System.out.println("TreeSet1:"+numbers);

      Iterator<Integer> iterate = numbers.iterator();
      System.out.print("TreeSet using Iterator: ");
      while(iterate.hasNext())
      {
        System.out.print(iterate.next());
        System.out.print(" ");
      }
      System.out.println();
      
      evenNumbers.add(2);
      evenNumbers.add(4);
      evenNumbers.add(6);
      System.out.println("TreeSet2:"+evenNumbers);

      //Union of two sets
      numbers.addAll(evenNumbers);
      System.out.println("Union is:"+numbers);

      //Intersection of two sets
      numbers.retainAll(evenNumbers);
      System.out.println("Intersection is:"+numbers);

      //Difference between two sets
      numbers.removeAll(evenNumbers);
      System.out.println(("Difference is:"+numbers));

      numbers.add(2);
      numbers.add(4);
      //Check if numbers is a subset of evenNumbers
      boolean result = evenNumbers.containsAll(numbers);
      System.out.println("Is TreeSet1 subset of TreeSet2?"+result);
      
      //Using the remove() method
      boolean value1 = numbers.remove(4);
      System.out.println(("Is 4 removed?"+value1));

      //Using the removeAll() method
      boolean value2 = numbers.removeAll(numbers);
      System.out.println("Are all elements removed?"+value2);
      
    }
}
