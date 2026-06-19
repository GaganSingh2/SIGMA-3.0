package BinarySearchTree.Part2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


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
        //helper method to Build the Balanced BST 
        private static Node helperToConvertArrayToBalancedBST(ArrayList<Integer> path, int si, int ei){
            if (si > ei) {
                return null;
            }

            int mid = si + (ei - si)/2;
            Node root = new Node(path.get(mid));
            root.left = helperToConvertArrayToBalancedBST(path, si, mid-1);
            root.right = helperToConvertArrayToBalancedBST(path, mid+1, ei);

            return root;
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
            int si = 0, ei = path.size()-1;
            return helperToConvertArrayToBalancedBST(path, si, ei);

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

/**
 * Convert the Binary Search Tree to Balanced Binary Search Tree
 * Balanced BST: A Balanced BST in which the height diff between the left and right subTree of every node is at most 1
 * (means maximum 1).
 *                  {| Height(LeftSubTree) - Height(RightSubTree) | <= 1}
 * 
 *                          8                                                8         For Node 8: HeightOfLeftSubTree = 2, HeightOfRightSubTree = 2 => Diff(2-2)= (0<=1)
 *                         / \                                              / \            
 *                        6   10                                           5   11     For Node 5: HeightOfLeftSubTree = 1, HeightOfRightSubTree = 1 => Diff(1-1)= (0<=1)
 *                       /     \              ==>                         / \  / \    For Node 11: HeightOfLeftSubTree = 1, HeightOfRightSubTree = 1 => Diff(1-1)= (0<=1)
 *                      5       11                                       3  6 10 12
 *                     /         \
 *                    3           12                                    Balanced BST
 *      Unbalanced BST
 */