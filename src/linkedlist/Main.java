package linkedlist;

public class Main {
    public static void main(String[] args) {

        //Initialise Linked List
        LinkedList myLinkedList = new LinkedList(1);

        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);
        myLinkedList.reverse();
        myLinkedList.printList();

        /*
        myLinkedList.remove(3);
        myLinkedList.printList();

         */

        /*
        myLinkedList.append(2);
        myLinkedList.insert(1, 1);
        myLinkedList.printList();
        */



//        LinkedList myLinkedList = new LinkedList(0);
//        myLinkedList.append(1);
//        myLinkedList.append(2);
//        myLinkedList.append(3);
//        myLinkedList.set(3,6);
//        myLinkedList.set(1,11);
//
//
//        System.out.println(myLinkedList.get(0).value + "\n");
//        myLinkedList.printList();

        //(2) Items - Return the 2 Node
        //System.out.println(myLinkedList.removeFirst().value);
        //(1) Items - Return the 1 Node
        //System.out.println(myLinkedList.removeFirst().value);
        //(0) Items - Returns NULL
        // System.out.println(myLinkedList.removeFirst());

        //Util Methods
        //myLinkedList.getHead();
        //myLinkedList.getTail();
        //myLinkedList.getLength();

//        myLinkedList.append(3);
//        myLinkedList.prepend(1);


        //remove items
        /*
        //(2) Items - Return the 2 Node
        System.out.println(myLinkedList.removeLast().value);

        //(1) Items - Return the 1 Node
        System.out.println(myLinkedList.removeLast().value);

        //(0) Items - Returns NULL
        System.out.println(myLinkedList.removeLast());
        */


    }
}
