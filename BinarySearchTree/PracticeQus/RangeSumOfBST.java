package BinarySearchTree.PracticeQus;

public class RangeSumOfBST {
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

        public static int totalSum = 0;
        public static void sumOfNode(Node root, int low, int high){
            if (root == null) {
                return;
            }
            if (root.data >= low && root.data <= high) {
                sumOfNode(root.left, low, high);
                totalSum += root.data;
                sumOfNode(root.right, low, high);
            }
            //means entire leftSubTree is invalid, so go into rightSubTree
            else if(root.data < low){
                sumOfNode(root.right, low, high);
            }
            //means entire rightSubTree is invalid, so go into leftSubTree
            else{
                sumOfNode(root.left, low, high);
            }
        }
        public static int rangeSumOfBST(Node root, int low, int high){
            if (root == null || low > high) {
                return 0;
            }
            totalSum = 0;
            sumOfNode(root, low, high);
            return totalSum;
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
        int low = 5;
        int high = 11;
        int sum = BinarySearchTree.rangeSumOfBST(root, low, high);
        System.out.println("Total Sum: "+sum);
    }

}
//Range sum of BST
/*
                                                8
                                               / \
                                              5   11
                                             / \   \
                                            3   6   20


                                        so if low = 5 and high = 11
                                        output => 5 + 6 + 8 + 11 = 30
                                        if(low > high) then 0
*/