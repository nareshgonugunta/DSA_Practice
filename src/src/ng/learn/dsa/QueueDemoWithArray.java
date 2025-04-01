package ng.learn.dsa;

public class QueueDemoWithArray {

    int front;
    int rear;
    int size;
    int a[];

    public QueueDemoWithArray(int size) {
        rear = -1;
        this.size = size;
        this.a = new int[size];
    }

    public void enQueue(int x){
        rear++;
        a[rear] = x;
    }

    public int dequeue(){
        int ele = a[0];
        for(int i=0; i<rear; i++){
            a[i] = a[i+1];
        }
        rear--;
        return  ele;
    }

    public void print(){
        for (int i=0; i<=rear; i++)
            System.out.println(a[i]);
    }


    public static void main(String[] args) {
        QueueDemoWithArray q = new QueueDemoWithArray(5);
        q.enQueue(3);
        q.enQueue(2);
        q.dequeue();
        q.enQueue(5);
        q.enQueue(58);
        q.dequeue();
        q.print();
    }
}
