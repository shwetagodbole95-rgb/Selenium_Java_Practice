package Java_Collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo
{
    public static void main(String[] args)
    {
        Queue<String> queue = new LinkedList<>();//FIFO

        queue.add("Rahul");
        queue.add("Priya");
        queue.add("Amit");

        System.out.println(queue);

        System.out.println(queue.poll());//Remove and return first element
        System.out.println(queue);
        System.out.println(queue.peek());//View first element without removing it
    }
}
