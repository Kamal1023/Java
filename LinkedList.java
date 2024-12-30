
public class LinkedList{

    private Node head;
    private Node tail;
    private int length;

    class Node{
        int value;
        Node next;

        Node(int value){
            this.value = value;
        }
    }

    public LinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;

    }
    
    public static void main(String[] args){

        LinkedList myLinkedList = new LinkedList(4);
        System.out.println(myLinkedList.head.value);
    }
    

}