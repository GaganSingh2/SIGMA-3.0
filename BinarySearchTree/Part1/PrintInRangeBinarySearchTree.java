package BinarySearchTree.Part1;

public class PrintInRangeBinarySearchTree {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinarySearchTree{
        public static Node buildBinarySearchTree(Node root, int value){
            if (root == null) {
                root = new Node(value);
                return root;
            }

            if(root.data < value){
                root.right = buildBinarySearchTree(root.right, value);
            }
            else{
                root.left = buildBinarySearchTree(root.left, value);
            }

            return root;
        }

        public static void inOrderTraversal(Node root){
            if (root == null) {
                return;
            }

            inOrderTraversal(root.left);
            System.out.print(root.data+" ");
            inOrderTraversal(root.right);
        }



        //Print the all nodes which present in k1 and k2
        public static void printInRange(Node root, int k1, int k2){
            if (root == null) {
                return;
            }

            //Node lies within the range
            if (k1 <= root.data && root.data <= k2){
                //then firstly check in leftSubTree
                printInRange(root.left, k1, k2);
                //print the rootValue
                System.out.print(root.data+" ");
                //then firstly check in leftSubTree
                printInRange(root.right, k1, k2);
            }
            //rootNode is smaller than k1, means entire leftSubTree is invalid, so check in rightSubTree
            else if(root.data < k1) {
                printInRange(root.right, k1, k2);
            }
            //rootNode is greater than k2, means entire rightSubTree is invalid, so check in leftSubTree
            else{
                printInRange(root.left, k1, k2);
            }
        }
    }
    public static void main(String[] args) {
        int nodes[] ={8,1,4,5,6,10,11,0,14};
        Node root = null;
        for(int val: nodes){
            root = BinarySearchTree.buildBinarySearchTree(root, val);
        }
        BinarySearchTree.inOrderTraversal(root);
        System.out.println();

        int k1 = 5;
        int k2 = 11;
        BinarySearchTree.printInRange(root, k1, k2);
    }
}
