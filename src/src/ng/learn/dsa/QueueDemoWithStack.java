package ng.learn.dsa;

import java.util.Stack;

public class QueueDemoWithStack {

    Stack<Integer> stack = new Stack<>();
    Stack<Integer> temp = new Stack<>();
    public void enQueue(int x){
        stack.push(x);
    }

    public int deQueue(){
        while (!stack.isEmpty()){
            temp.push(stack.peek());
            stack.pop();
        }
        Integer element = temp.pop();
        while(!temp.isEmpty()){
            stack.push(temp.pop());
        }
         return element;
    }
    public void print(){
        System.out.println("stack"+stack);
    }

    public static void main(String[] args) {
        QueueDemoWithStack q = new QueueDemoWithStack();
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);
        q.deQueue();
        q.enQueue(19);
        q.enQueue(63);
        q.deQueue();
        q.print();

    }
}
