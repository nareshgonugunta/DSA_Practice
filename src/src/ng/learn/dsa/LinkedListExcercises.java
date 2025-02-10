package ng.learn.dsa;

public class LinkedListExcercises {
    static Node head = null;
    static Node tail = null;
    class Node{
        int val;
        Node next;
        public Node(int val) {
            this.val = val;
        }
    }
    public void add(int val){
        Node newNode = new Node(val);
        if(head == null || tail == null){
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.next = null;
            tail = newNode;
        }
    }

    public void addElementAtIndex(int index, int val){
        int count = 1;
        Node current = head;
            while (head.next != null && count != index-1) {
                current = head.next;
                count ++;
            }
            Node newNode = new Node(val);
            Node temp = current.next;
            current.next = newNode;
            newNode.next = temp;
    }

    public void removeNodeAtEnd() {
        Node current = head;
        while(current.next.next != null){
            current = current.next;
        }
        current.next = null;
        tail = current;
    }

    public void removeNodeAtBegining(){
        if(head.next == null){
            head = null;
            tail = null;
        } else {
            head = head.next;
        }
    }

    public void removeElementAtIndex(int index) {
        if(index == 1){
            removeNodeAtBegining();
        } else if(index == getLinkedListSize(head)) {
            removeNodeAtEnd();
        } else {
            Node current = head;
            int count = 1;
            while (current != null && count != index - 1) {
                current = current.next;
                count++;
            }
            current.next = current.next.next;
        }
    }

    private int getLinkedListSize(Node head) {
        Node current = head;
        int count = 1;
        while(current.next != null){
            current = head.next;
            count++;
        }
        return count;
    }

    //Lecture #27 Assignment Part 2(using the deleteNodeWithAGivenValue() function here): remove all nodes with even values

/*public void deleteNodeWithAGivenValue(int value) {

    //case when we need to remove the head node
    if (head.value == value) {
        removeNodeAtTheBeginning();
    } else if (tail.value == value) {
        //case when we need to remove the tail node
        removeNodeAtTheEnd();
    } else {
        Node current = head;
        Node previous = null;
        while (current != null && current.value != value) {
            //store the value of current in previous
            previous = current;
            current = current.next;
        }

        //case when the given value node  is not found
        if (current == null) {
            throw new RuntimeException("the node with the given value is not found!!");
        }
        //at this point we have the information of the previous node to the node with given value which we want to delete
        //and current node is the node that we want to delete
        previous.next = current.next;
    }
}

//Lecture #27 Assignment Part 2(using the deleteNodeWithAGivenValue() function here): remove all nodes with even values
public void deleteAllNodesWithEvenValues() {

    Node current = head;
    while (current != null) {

        if (current.value % 2 == 0) {
            deleteNodeWithAGivenValue(current.value);
        }
        current = current.next;
    }

}
    */
    public void printLinkedList(Node headNode){
        Node currentNode = headNode;
        while (currentNode != null) {
            System.out.println(currentNode.val);
            currentNode = currentNode.next;
        }
    }


    public static void main(String[] args) {

        LinkedListExcercises l = new LinkedListExcercises();
        l.add(11);
        l.add(12);
        l.add(13);
        l.add(14);
        l.printLinkedList(head);
        System.out.println(l.getLinkedListSize(head));
        l.addElementAtIndex(3, 70);
        l.printLinkedList(head);
        System.out.println(l.getLinkedListSize(head));

        //l.removeNodeAtEnd();
        //l.printLinkedList(head);

        //l.removeNodeAtBegining();
        //l.printLinkedList(head);

        //l.removeElementAtIndex(3);

    }
}
