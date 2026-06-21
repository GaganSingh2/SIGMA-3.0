package BinarySearchTree.Part1;

import java.util.ArrayList;

public class ValidateBinarySearchTree {
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

        //Approach 1 using Inorder Traversal----------------------------------
        //Helper method to find the Nodes value in Inorder Traversal
        private static void inOrderTraversal(Node root, ArrayList<Integer> path){
            if (root == null) {
                return;
            }

            inOrderTraversal(root.left, path);
            System.out.print(root.data+" ");
            path.add(root.data);
            inOrderTraversal(root.right, path);
        }
        //Main method to check the BST is valid or not 
        public static boolean isBinarySearchTreeValidUsingInOrderTraversal(Node root){
            if (root == null) {
                return true;
            }

            ArrayList<Integer> path = new ArrayList<>();
            inOrderTraversal(root, path);
            System.out.println();

            for(int i=1; i<=path.size()-1; i++){
                if (path.get(i-1)>path.get(i)) {
                    return false;
                }
            }
            return true;
        }


        //Appraoch 2 Using Max/Min of each node
        public static boolean isValidBSTUsingMinMax(Node root, Node min, Node max){
            if (root == null) {
                return true;
            }

            //if minValue of RightSubTree is greater than or equal to the rootValue i.e Invalid BST
            if (min != null && root.data <= min.data) {
                return false;
            }
            //if maxValue of LeftSubTree is less than or equal to the rootValue i.e Invalid BST
            else if (max != null && root.data >= max.data) {
                return false;
            }

            //in Left SubTree all nodes < root.val so min = null and max = root
            boolean leftSubTree = isValidBSTUsingMinMax(root.left, min, root);
            //in Right SubTree all nodes > root.val so min = root and max = null
            boolean rightSubTree = isValidBSTUsingMinMax(root.right, root, max);

            //if both are valid then return true otherwise false
            return leftSubTree && rightSubTree;
        }
    }
    public static void main(String[] args) {
        int nodes[] = {5,3,2,7,4,6,8};
        // int nodes[] = {50,30,70,20,60,55,80};
        Node root = null;

        for(int val: nodes){
            root = BinarySearchTree.buildBinarySearchTree(root, val);
        }

        //1st Approach using InOrder Traversal---------------
        // boolean isValid = BinarySearchTree.isBinarySearchTreeValidUsingInOrderTraversal(root);
        // System.out.println("Binary Search Tree is Valid: "+isValid);

        //2nd Approach using Max and Min
        boolean isValid = BinarySearchTree.isValidBSTUsingMinMax(root, null, null);

        System.out.println("Binary Search Tree is Valid: "+isValid);
    }
}
/**
 * Validate Binary Search Tree
 * => A valid BST is a binary tree where every node satisfies the BST property
 * Rule=>
 *  1)All values in the LeftSubTree must be less than the node's value
 *  2)All values in the RightSubTree must be greater than the node's value
 *  3)Both left and right subTree must also be valid BST.
 * 
 * Approach 1: using InOrder Traversal(Left -> Root -> Right)
 * found the InOrder Traversal and if this is the sorted in Ascending order means it is a Valid BST
 *                                               5
 *                                              / \
 *                                             3   7            => Valid BST
 *                                           / \  / \
 *                                          2  4  6  8
 *                              InOrder Traversal = {2,3,4,5,6,7,8} sorted
 * 
 * 
 * 
 * Approach 2: using Max/Min of each Node
 * a)if root is null then return true
 * b)initialize two varible
 *         min = - infinity
 *         max = + infinity
 * 
 * c)found the Min and Max for each root node
 *      Note:
 *          In Left SubTree
 *              min = -infinity
 *              max = root/parent
 *          In Right SubTree
 *              min = root/parent
 * 
 * d)if node value lies in between Min and Max
 *      if(min<NodeVal && nodeVal<max) return true(Valid BST)
 *      otherwise return false (Invalid BST)
 */
