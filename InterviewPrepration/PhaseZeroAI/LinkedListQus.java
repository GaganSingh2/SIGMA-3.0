package InterviewPrepration.PhaseZeroAI;

public class LinkedListQus {
    static class Node{
        int data;
        Node next;
        
        Node(int data){
            this.data = data;
            this.next = null;
           
        }
    }
    static class LinkedList{
        public static void printLinkedList(Node head){
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data+" -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }

        public static Node reverseLinkedList(Node head){
            Node curr = head;
            Node prev = null;
            Node next;
            while (curr != null) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            return prev;
        }

        public static Node midNode(Node head){
            Node slow = head;
            Node fast = head;
            while (fast != null && fast.next != null) {
                fast = fast.next.next;
                slow = slow.next;
            }
            return slow;
        }

        
    }
    public static void main(String[] args) {
        Node head = new Node(5);
        head.next = new Node(10);
        head.next.next = new Node(15);
        head.next.next.next = new Node(20);
        // head.next.next.next.next = new Node(25);
        LinkedList ll = new LinkedList();
        ll.printLinkedList(head);

        Node newHead = ll.reverseLinkedList(head);
        ll.printLinkedList(newHead);


        Node mid = ll.midNode(newHead);
        System.out.println("Middle Node: "+mid.data);
    }
}
