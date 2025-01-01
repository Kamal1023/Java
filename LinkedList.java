
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

    public void printList(){                    //function for printing our linked list
        Node temp = head;                       //initial temp value is pointed to head
        while (temp != null) {                  // this loop ensures that "temp" travels to the next node until it finds null value
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void append(int value){             //append method to add new values to the linked list
        Node newNode = new Node(value);
        if(length==0){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public Node removeLast(){
        if(length==0) return null;
        Node temp = head;
        Node pre = head;
        while(temp.next!=null){
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        if(length==0){
            head = null;
            tail = null;
        }
        return temp;
    }

    public Node getHead(){
        return head;
    }
    public Node getTail(){
        return tail;
    }
    public int getLength(){
        return length;
    }
    
    public static void main(String[] args){

        LinkedList myLinkedList = new LinkedList(4);
        System.out.println(myLinkedList.head.value);

        System.out.println("Head value: "+myLinkedList.getHead().value);
        System.out.println("Tail value: "+myLinkedList.getTail().value);
        System.out.println("Length: "+ myLinkedList.getLength());

        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(1);

        // (2) Items - Returns 2 Node
        System.out.println(myLinkedList.removeLast().value);
        // (1) Item - Returns 1 Node
        System.out.println(myLinkedList.removeLast().value);
        // (0) Items - Returns null
        System.out.println(myLinkedList.removeLast());



        System.out.println("Linked List: ");
        myLinkedList.printList();
        
    }
    

}
