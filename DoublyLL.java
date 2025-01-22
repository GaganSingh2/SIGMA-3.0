public class DoublyLL {
    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // AddFirst Method
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // Remove First
    public int removeFirst() {
        int val = Integer.MIN_VALUE;
        if (head == null) {
            System.out.println("DLL is Empty");
            return val;
        }

        if (size == 1) {
            val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }

    // AddLast
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (tail == null) {
            head = tail = newNode;
            return;
        }
        newNode.prev = tail;
        tail.next = newNode;
        tail = newNode;
    }

    // RemoveLast
    public int removeLast() {
        int val = Integer.MIN_VALUE;
        // if DLL is empty
        if (tail == null) {
            System.out.println("DLL is Empty.");
            return val;
        }
        if (size == 1) {
            val = tail.data;
            head = tail = null;
            size = 0;
            return val;
        }
        val = tail.data;
        tail = tail.prev;
        tail.next = null;
        size--;
        return val;
    }

    // Reverse the DLL
    public void reverse() {
        Node curr = head;
        Node prev = null; 
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;

            prev = curr;
            curr = next;
        }
        head = prev;
    }

    // Print the LL
    public void print() {
        Node temp = head;

        System.out.print("null<-->");
        while (temp != null) {
            System.out.print(temp.data + "<-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DoublyLL dll = new DoublyLL();

        // AddFirst
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);

        // Print
        // dll.print();
        // System.out.println("Size of DLL: "+size);

        // Remove First
        // dll.removeFirst();
        // dll.print();
        // System.out.println("Size of DLL: "+size);

        // AddLast
        dll.print();
        dll.addLast(4);
        dll.addLast(5);
        dll.addLast(6);
        dll.print();
        System.out.println("Size Of DLL: " + size);

        // Remove Last
        // dll.removeLast();
        // dll.removeLast();
        // dll.print();
        // System.out.println("Size of DLL: "+size);

        // Reverse the DLL
        dll.reverse();
        dll.print();

    }
}
