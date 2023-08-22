package LinkedLists;

public class Main {
    //Difference between an arraylist and LinkedList
    //Arraylist uses indexes while linkedlist uses pointers
    public static void main(String[] args){
        LinkedList myLinkedList = new LinkedList(4);

        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();

        System.out.println("\nLinked List:");
        myLinkedList.printList();
    }
}
