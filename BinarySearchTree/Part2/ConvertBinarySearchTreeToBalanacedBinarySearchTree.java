package BinarySearchTree.Part2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import InfosysPractice.practice6;

public class ConvertBinarySearchTreeToBalanacedBinarySearchTree {
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
        //helper method to print the Tree in Level Order
        public static void levelOrderTraversal(Node root){
            if (root == null) {
                return;
            }

            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while (!q.isEmpty()) {
                Node currNode = q.remove();
                if (currNode == null) {
                    if (q.isEmpty()) {
                        return;
                    }
                    else{
                        q.add(null);
                        System.out.println();
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

        //Helper method to store the all nodes in ArrayList in sorted order
        private static void storeNodesUsingInOrderTraversal(Node root, ArrayList<Integer> path){
            if (root == null) {
                return;
            }

            storeNodesUsingInOrderTraversal(root.left, path);
            path.add(root.data);
            storeNodesUsingInOrderTraversal(root.right, path);

        }
        //helper method to create the Balanced BST 
        private static Node createBalancedBST(ArrayList<Integer> path, int si, int ei){
            if (si > ei) {
                return null;
            }

            int mid = si + (ei - si)/2;
            Node root = new Node(path.get(mid));
            root.left = createBalancedBST(path, si, mid-1);
            root.right = createBalancedBST(path, mid+1, ei);

            return root;
        }
        //helper method to used the sorted ArrayList and convert the list to BST
        private static Node helperToConvertArrayToBalancedBST(ArrayList<Integer> path){
            if (path.size() == 1) {
                Node root = new Node(path.get(0));
                return root;
            }
            int si = 0, ei = path.size()-1;
            
            return createBalancedBST(path, si, ei);
            
        }
        //main method to solve this problem
        public static Node convertBST_To_BalancedBST(Node root){
            if (root == null) {
                return null;
            }

            //1st Step=> store the nodes in the ArrayList Using InOrder Traversal
            ArrayList<Integer> path = new ArrayList<>();
            storeNodesUsingInOrderTraversal(root, path);

            //2nd Step=> convert the Sorted Array to Balanced BST
            return helperToConvertArrayToBalancedBST(path);

        }
    }
    public static void main(String[] args) {
        //Create the Tree mannualy-------
        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);

        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);

        System.out.println("Before Conversion: ");
        BinarySearchTree.levelOrderTraversal(root);
        System.out.println();
         System.out.println("After Conversion: ");
        Node newRoot = BinarySearchTree.convertBST_To_BalancedBST(root);
        BinarySearchTree.levelOrderTraversal(newRoot);
    }
}

