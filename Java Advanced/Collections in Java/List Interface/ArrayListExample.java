import java.util.ArrayList;
import java.util.List;

class ArrayListExample
{
    public static void main(String[] args) {
        
        List<Integer> nums = new ArrayList<Integer>();

        nums.add(6);
        nums.add(5);
        nums.add(8);
        nums.add(2);
        System.out.println("List:"+nums);

        int ele = nums.get(2);
        System.out.println("Data at index 2:"+ele);

        int removed = nums.remove(2);
        System.out.println("Removed Element:"+removed);

        System.out.println("newList:"+nums);

        nums.set(2,3);
        System.out.println("New ArrayList:"+nums);
    }
}