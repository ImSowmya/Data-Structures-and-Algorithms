import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Queue_DS 
{
    public static void main(String[] args) 
    {
        Queue <Integer> queue = new LinkedList<Integer>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue.remove());

        Deque <Integer> deque = new ArrayDeque<>(); 
        deque.add(12);
        deque.add(13);
        deque.add(14);
        deque.addFirst(11);
        deque.addLast(15);
        System.out.println(deque.remove());
        System.out.println(deque.removeLast());
    }
}