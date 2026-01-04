public class LinkedList {
    // Node class
    class Node{
        int data;
        Node next;
        Node previous;
        // constructor
        Node (int data){
            this.data = data;
            this.next = null;
            this.previous = null;
        }
    }
    // encapsulating head
    private Node head;

    // add to the beginning of the list
    public void beginning (int data){
        // create new node obj
        Node node = new Node(data);
        // if head is empty
        if (head == null){
            // node becomes head
            head = node;
        }
        else{
            // shift right
            node.next = head;
            head.previous = node;
            // head is now empty, point it to node
            head = node;
        }
    }
    // search for value
    public int searchList(int value) {
        // node that is being searched
        Node next = head;
        // position of node
        int index = 1;
        //  while the node isn't empty
        while (next != null) {
            // if the node is equal to the value
            if (next.data == value){
                // return the position number
                return index;
            }
            // check the next node position
            next = next.next;
            // increase position by 1
            index++;
        }
        // if node doesn't exist
        return 0;
    }
    // delete value
    public int deleteByValue(int data) {
        // temporary node for the head
        Node temp = head;
        // if temp is empty
        if (temp == null){
            // number doesn't exist
            return 0;
        }
        // if temp node is number we are looking for
        if (temp.data == data){
            // number beside temp is head
            head = temp.next;
            // if head isn't empty
            if (head != null){
                // number on left is empty, new head
                head.previous = null;
            }
            // success
            return 1;
        }
        // temp isn't empty and it isn't the right number
        while (temp != null && temp.data != data) {
            // keep searching the list
            temp = temp.next;
        }
        // if we keep searching and reach the end of the list and it's not the right number
        if (temp == null){
            return 0;
        }
        temp.previous.next = temp.next;
        if (temp.next != null) {
            temp.next.previous = temp.previous;
        }
       return 1;
    }
    // Display the linked list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}
