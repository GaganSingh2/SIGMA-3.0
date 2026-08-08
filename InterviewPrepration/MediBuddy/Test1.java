package InterviewPrepration.MediBuddy;
/*
Given a linked list, remove duplicate nodes while preserving the order of the first occurrence. given code have some bugs fix and run the code

For example:

Input:
1 → 2 → 3 → 2 → 4 → 1 → NULL

Output:
1 → 2 → 3 → 4 → NULL

The original order of the first occurrences is preserved.
 */
public class Test1 {
    static class Node {
        int data;
        Node next;
        // Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    static class DoublyLinkedList {
        public static void printLinkedList(Node head){
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data+" -> ");
                temp = temp.next;
            }
            System.out.print("null");
            System.out.println();
        }
        public static Node removeDulicate(Node head) {
            if (head == null) {
                return head;
            }

            Node curr = head;
            // while(curr == null){ //error
            while (curr != null) { //correct
                Node index = curr.next;
                Node temp = curr;
                while (index != null) {
                    // if(curr.next.data == index.data){ //error
                    if (curr.data == index.data) { //correct
                        temp.next = index.next;
                        index = temp.next; //correct
                    } else {
                        temp = index;
                        index = index.next;
                    }
                    index = index.next;
                }
                curr = curr.next;
            }
            // return curr; //eroor
            return head; //correct
        }

    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(4);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(8);
        DoublyLinkedList.printLinkedList(head);
        DoublyLinkedList.removeDulicate(head);
        DoublyLinkedList.printLinkedList(head);
    }
}
