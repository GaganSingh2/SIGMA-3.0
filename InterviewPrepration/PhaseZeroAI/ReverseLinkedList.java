package InterviewPrepration.PhaseZeroAI;


public class ReverseLinkedList {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class LinkedList{
        public static Node head;
        public static void insertAtFirst(int data){
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }
        public static void printLinkedList(Node head){
            while (head != null) {
                System.out.print(head.data+" -> ");
                head = head.next;
            }
            System.out.print("null");
            System.out.println();
        }

        public static Node reverseLinkedList(Node head){
            Node prev = null;
            Node curr = head;
            Node next;

            while (curr != null) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next; 
            }

            return prev;
        }
    }
    public static void main(String[] args) {
       LinkedList list = new LinkedList();
       list.insertAtFirst(10);
       list.insertAtFirst(20);
       list.insertAtFirst(30);
       list.insertAtFirst(40);
       list.insertAtFirst(50);
       System.out.println("Before Reversing: ");
       list.printLinkedList(list.head);

       System.out.println("After Reversing: ");
       list.head = list.reverseLinkedList(list.head);
       list.printLinkedList(list.head);
    }
}
