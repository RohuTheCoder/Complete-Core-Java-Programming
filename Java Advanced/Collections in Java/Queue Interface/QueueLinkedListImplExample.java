import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedListImplExample {
    public static void main(String[] args) {
        Queue<Integer> q  = new LinkedList<Integer>();
        q.offer(1);
        q.offer(2);
        q.offer(3);

        System.out.println(("Queue:"+q));

        int num = q.peek();
        System.out.println("Accessed Element:"+num);

        int rnum = q.poll();
        System.out.println("Removed Number:"+rnum);

        System.out.println("Updated Queue:"+q);

    }
}
