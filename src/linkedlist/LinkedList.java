package linkedlist;

public class LinkedList {
    //crucial parts of a linked List(head,tail & length)
    private Node head;
    private Node tail;
    private int length;

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        //when I am appending to a linked list whose (length=0)
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            //had some items in the linked List,
            //I begin by admitting the new Node
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    //The below method will remove the lastNode then return It
    public Node removeLast() {
        //if the linked list is empty, there is nothing to return
        if (length == 0) return null;

        //When we have multiple items in the linked List,
        //we create two variables temp and pre which point to the head
        Node temp = head;
        Node pre = head;

        //When we have a linked list with existing Items
        while (temp.next != null) {
            pre = temp;
            temp = temp.next;
        }

        tail = pre;
        tail.next = null;
        length--;

        //handling the edge case when there was only one item in the linked List
        if (length == 0) {
            head = null;
            tail = null;
        }
        return temp;
    }

    public Node removeFirst() {
        if (length == 0) return null;
        Node temp = head;
        //new head
        head = head.next;
        //removing previous head
        //{{this removes a forward link to the Node}}
        temp.next = null;
        length--;
        //edge case for one item
        if (length == 0) {
            tail = null;
        }
        return temp;
    }

    //Getting a Node at a Particular Index
    public Node get(int index) {
        if (index < 0 || index >= length) return null;
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    //Setting the Value of a Node that is at a particular index
    public boolean set(int index, int value) {
        Node temp = get(index);
        if (temp != null) {
            temp.value = value;
            return true;
        }
        return false;
    }

    //Insert Inserts a New Node of a Particular value to a particular Index
    public boolean insert(int index, int value) {
        if (index < 0 || index > length) return false;
        if (index == 0) {
            prepend(value);
            return true;
        }
        if (index == length) {
            append(value);
            return true;
        }

        //Inserting into a Node that Lives InBetween
        Node newNode = new Node(value);

        //We must ge the node that is previous to it before Insert
        Node temp = get(index -1);
        newNode.next = temp.next;
        temp.next = newNode;
        length ++;
        return true;

    }

    //Remove a Particular Item at a Particular Index & returns the removed node
    public Node remove(int index){
        if(index <0 || index >= length) return null;
        if(index == 0) return removeFirst();
        if(index == length - 1) return removeLast();
        Node prev = get(index -1);
        Node temp = prev.next; //runs with 0(1)
        prev.next = temp.next;
        temp.next = null; // disconnecting the temp variable to be removed
        length --;
        return temp;
    }

    //During reversal, we are reverseing a particular linked list in place & not creating any duplicates in place.

    public void reverse(){
        //Step One (Reverse the Head and the Tail)
        Node temp = head;
        head = tail;
        tail = temp;
        Node after = temp.next;
        Node before = null;

        for (int i = 0; i < length; i++) {
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }

    }
    //Adding of Items at the beginning of the Linked List
    public void prepend(int value) {
        Node newNode = new Node(value);
        //case one, when we have no items in the linked List
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            //links the created node to previous head
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    //Method that can print all the items in a linked list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead() {
        System.out.println("Head: " + head.value);
    }

    public void getTail() {
        System.out.println("Tail: " + tail.value);
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

    //Node class in an inner class in the Linked List
    //crucial parts of a Node is value and the pointer to the next Node
    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }


}
