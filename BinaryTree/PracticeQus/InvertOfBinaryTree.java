package BinaryTree.PracticeQus;

import java.util.LinkedList;
import java.util.Queue;

public class InvertOfBinaryTree {
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

    static class BinaryTree{
        static int idx = -1;
        public static Node buildBinaryTree(int nodes[]){
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildBinaryTree(nodes);
            newNode.right = buildBinaryTree(nodes);

            return newNode;
        }

        //Used this Helper method to print the Binary Tree using Level Order Traversal
        public static void levelOrderTraversal(Node rootNode){
            if (rootNode == null) {
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(rootNode);
            q.add(null);

            while (!q.isEmpty()) {
                Node currNode = q.remove();
                if (currNode == null) {
                    if (q.isEmpty()) {
                        return;
                    }
                    else{
                        System.out.println();
                        q.add(null);
                    }
                }
                else{
                    System.out.print(currNode.data+" ");
                    if (currNode.left != null) {
                        q.add(currNode.left);
                    }
                    if (currNode.right != null) {
                        q.add(currNode.right);
                    }
                }
            }
        }

        //1st Approach using Recursion---------------------
        //Perform the Invert of Binary Tree using Recursion
        public static Node invertOfBinaryTreeByUsingRecursion(Node rootNode){
            if (rootNode == null) {
                return null;
            }

            Node tempVal = rootNode.left;
            rootNode.left = rootNode.right;
            rootNode.right = tempVal;

            invertOfBinaryTreeByUsingRecursion(rootNode.left);
            invertOfBinaryTreeByUsingRecursion(rootNode.right);

            return rootNode;
        }

        //2nd Approach using Level Order Traversal---------------
        public static void invertOfBinaryTreeByUsingLevelOrderTraversal(Node rootNode){
            if (rootNode == null) {
                return;
            }

            Queue<Node> q = new LinkedList<>();
            q.add(rootNode);
            q.add(null);

            while (!q.isEmpty()) {
                Node currNode = q.remove();
                if (currNode == null) {
                    if (q.isEmpty()) {
                        return;
                    }
                    else{
                        q.add(null);
                    }
                }
                else{
                    Node temp = currNode.left;
                    currNode.left = currNode.right;
                    currNode.right = temp;

                    if (currNode.left != null) {
                        q.add(currNode.left);
                    }
                    if (currNode.right != null) {
                        q.add(currNode.right);
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,6,-1,-1,7,-1,-1};
        Node rootNode = BinaryTree.buildBinaryTree(nodes);
        System.out.println("Root Node: "+rootNode.data);

        System.out.println("Before Invertion");
        BinaryTree.levelOrderTraversal(rootNode);

        System.out.println();

        System.out.println("After Invertion");
        //1st Approach using Recursion----------
        // BinaryTree.invertOfBinaryTreeByUsingRecursion(rootNode);
        // BinaryTree.levelOrderTraversal(rootNode);

        //2nd Approach using Level Order Traversal--------------
        BinaryTree.invertOfBinaryTreeByUsingLevelOrderTraversal(rootNode);
        BinaryTree.levelOrderTraversal(rootNode);

    }
}

/**
 * Invert Of Binary Tree or Mirror of Binary Tree
 * Swap the left and right child of every node in the tree.
 *  
 *      Before Invertion                                After Inversion
 *                         1                                         1
 *                        / \                                       / \
 *                       2   3                                     3   2
 *                     / \  / \                                   / \  / \
 *                    4  5 6   7                                 7  6 5   4
 *                       
 *                     
 *                    
 */