package BinarySearchTree.PracticeQus;

public class ClosestElementInBSTOfGivenNode {
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
        public static Node buildBinarySearchTree(Node root, int val){
            if (root == null) {
                root = new Node(val);
                return root;
            }

            if (root.data > val) {
                root.left = buildBinarySearchTree(root.left, val);
            }
            else{
                root.right = buildBinarySearchTree(root.right, val);
            }
            return root;
        }

        public static void preOrderTraversal(Node root){
            if (root == null) {
                return;
            }
            System.out.print(root.data+" ");
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }

        public static int ele = 0;
        public static int diff = Integer.MAX_VALUE;
        public static void helper(Node root, int key){
            if (root == null) {
                return;
            }
            //if abs is lesser than last absValue then replace diff and ele
            if (Math.abs(root.data - key) <= diff) {
                diff = Math.abs(root.data - key);
                ele = root.data;
            }
            //if rootval is greater than key then search in LeftSubTree
            if (root.data > key) {
                helper(root.left, key);
            }
            //if rootVal is lower than key then search in RightSubTree
            else{
                helper(root.right, key);
            }
        }
        public static int closestElementInBSTOfGivenNode(Node root, int key){
            if (root == null) {
                return -1;
            }
            
            ele = 0;
            diff = Integer.MAX_VALUE;
            helper(root, key);
            return ele;
        }
    }
    public static void main(String[] args) {
        int nodes[] = {8,5,3,6,11,20};
        Node root = null;
        for(int val: nodes){
            root = BinarySearchTree.buildBinarySearchTree(root, val);
        }
        BinarySearchTree.preOrderTraversal(root);
        System.out.println();
        int key = 19;
        int val = BinarySearchTree.closestElementInBSTOfGivenNode(root, key);
        System.out.println("Closest Element: "+val);
    }
}
//Find the Closest Element In BST of given target node
/*We have a binary search tree and a target node K. The task is to find the node with minimum absolute difference with given target value K.
                                                8
                                               / \
                                              5   11
                                             / \   \
                                            3   6   20


                                        so if target = 5
                                        output => 5 (Difference = 5-5 = 0)
                                        if target 19
                                        output => 20 (Mininum Difference = 20-19=1)
*/