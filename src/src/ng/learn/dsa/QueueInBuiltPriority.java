package ng.learn.dsa;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueInBuiltPriority {

    public static void main(String[] args) {

        Queue<Integer> queue =  new PriorityQueue<>();

        queue.add(3);
        queue.add(18);
        queue.remove();
        queue.add(2);
        queue.add(9);
        queue.add(6);
        queue.add(8);


        System.out.println("priority queue elements are : "+queue);


        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }

    }
}
