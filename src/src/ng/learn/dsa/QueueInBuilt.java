package ng.learn.dsa;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class QueueInBuilt {

    public static void main(String[] args) {

        Queue<Integer> q = new ArrayDeque<>();
        q.add(2);
        q.add(6);
        q.add(8);
        q.add(7);
        q.add(90);
        q.remove();
        q.remove(90);
            System.out.println("queue is : "+q);
        // reverse a queue
        Stack<Integer> temp = new Stack<>();
        while(!q.isEmpty()){
            temp.push(q.poll());
        }
        while (!temp.isEmpty()){
            q.offer(temp.pop());
        }
        System.out.println("-----");
        System.out.println("reversed queue is : "+q);

    }
}
