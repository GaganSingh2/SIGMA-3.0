package BinarySearchTree.Part1;

public class InOrderTraversalOnBinarySearchTree {
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

            //if rootData is greater-than currValue then we go to leftSubTree
            if (root.data > value) {
                root.left = buildBinarySearchTree(root.left, value);
            }
            //if rootData is lesser-than currValue then we go to rightSubTree
            else{
                root.right = buildBinarySearchTree(root.right, value);
            }

            return root;
        }

        //Perform InOrder Traversal on Binary Search Tree
        public static void inOrderTraversal(Node root){
            if (root == null) {
                return;
            }

            inOrderTraversal(root.left);
            System.out.print(root.data+" ");
            inOrderTraversal(root.right);
        }
    }

    public static void main(String[] args) {
        int nodes[] = {2,5,7,4,3,8,9,1};

        Node root = null;
        for(int val: nodes){
            root = BinarySearchTree.buildBinarySearchTree(root, val);
        }

        BinarySearchTree.inOrderTraversal(root);
    }
}
