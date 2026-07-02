package BinarySearchTree.PracticeQus;

import java.util.ArrayList;

public class KthSmallestElementInBST {
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

        public static void inOrderTraversal(Node root){
            if (root == null) {
                return;
            }
            inOrderTraversal(root.left);
            System.out.print(root.data+" ");
            inOrderTraversal(root.right);
        }


        //Approach-1 using Inorder Traversal---------------
        public static int count = 0;
        public static int ans = -1;
        public static void helpInOrderTraversal(Node root, int k){
            if (root == null) {
                return;
            }
            helpInOrderTraversal(root.left, k);
            count++;
            if (count == k) {
                ans = root.data;
                return;
            }
            helpInOrderTraversal(root.right, k);
        }
        public static int kthSmallestElementInBST1(Node root, int k){
            if (root == null || k < 1) {
                return -1;
            }
            count = 0;
            ans = -1;
            helpInOrderTraversal(root, k);

            return ans;
        }

        //Approach-2 using Inorder Traversal and ArrayList---------------------
        public static void helpInOrderTraversalAndArrayList(Node root, ArrayList<Integer> nodes){
            if (root == null) {
                return;
            }
            helpInOrderTraversalAndArrayList(root.left, nodes);
            nodes.add(root.data);
            helpInOrderTraversalAndArrayList(root.right, nodes);
        }
        public static int kthSmallestElementInBST2(Node root, int k){
            if (root == null || k<1) {
                return -1;
            }
            ArrayList<Integer> nodes = new ArrayList<>();
            helpInOrderTraversalAndArrayList(root, nodes);
            if (nodes.size() < k) {
                return -1;
            }
           
            return nodes.get(k-1); //k-1 bcz indexing start from 0
        }
    }
    public static void main(String[] args) {
        int nodes[] = {8,5,3,6,11,20};
        Node root = null;
        for(int val: nodes){
            root = BinarySearchTree.buildBinarySearchTree(root, val);
        }
        BinarySearchTree.inOrderTraversal(root);
        System.out.println();
        int kth = 3;
        int res = BinarySearchTree.kthSmallestElementInBST1(root, kth);
        System.out.println(kth+" Smallest Element: "+res);
        System.out.println();
        int res1 = BinarySearchTree.kthSmallestElementInBST2(root, kth);
        System.out.println(kth+" Smallest Element: "+res1);
    }
}

//Find the Kth Smallest element in BST
/*We have a binary search tree and a target node K. The task is to find the node with minimum absolute difference with given target value K.
                                                8
                                               / \
                                              5   11
                                             / \   \
                                            3   6   20

                            Inorder Traversal = {3,5,6,8,11,20}
                                        so if kth = 3
                                        output => 6
                                        if kth = 5
                                        output => 11
                                        if kth = 0
                                        Output = -1
                                        if kth = 14
                                        output = -1
*/