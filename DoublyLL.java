public class DoublyLL {
    public class Node{
        int data;
        Node next;
        Node prev;
        
        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    //AddFirst Method
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    //Print the LL
    public void print(){
        Node temp = head;
        
        System.out.print("null<-->");
        while (temp != null) {
            System.out.print(temp.data+"<-->");
            temp = temp.next;
        }
        System.out.println("null"); 
    }
    public static void main(String[] args) {
        DoublyLL dll = new DoublyLL();

        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);

        //Print
        dll.print();
        System.out.println("Size of DLL: "+size);
        
    }
}
