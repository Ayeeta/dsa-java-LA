package doublylinkedlist;

public class Main {

    public static void main(String[] args){
       DoublyLinkedList myDLL = new DoublyLinkedList(4);

        myDLL.getHead();
        myDLL.getTail();
        myDLL.getLength();

        System.out.println("\nDLL:");
        myDLL.printList();
    }
}
