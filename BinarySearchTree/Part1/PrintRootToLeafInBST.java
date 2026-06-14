package BinarySearchTree.Part1;

public class PrintRootToLeafInBST {
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

            if (root.data > value) {
                root.left = buildBinarySearchTree(root.left, value);
            }
            else{
                root.right = buildBinarySearchTree(root.right, value);
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
    }
    public static void main(String[] args) {
        int nodes[] = {8,5,3,6,10,9,11};
        Node root = null;
        for(int val: nodes){
            root = BinarySearchTree.buildBinarySearchTree(root, val);
        }
        BinarySearchTree.inOrderTraversal(root);
        System.out.println();
    }
}
/**
 * Print Root to Leaf Path in Binary Search Tree
 *                              8
 *                             / \
 *                            5   10
 *                          / \   / \
 *                         3   6 9  11
 * 
 *          Output => Print the all Pahts---->
 *                    path-1 {8,5,3}
 *                    path-2 {8,5,6}
 *                    path-3 {8,10,9}
 *                    path-4 {8,10,11}
 * 
 *                   Store the all path in 2-D ArrayList
 *                      [ [8,5,3],[8,5,6],[8,10,9],[8,10,11]]
 *                      
 * 
 */