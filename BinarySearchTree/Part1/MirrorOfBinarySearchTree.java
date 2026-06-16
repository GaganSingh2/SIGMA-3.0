package BinarySearchTree.Part1;

import java.util.LinkedList;
import java.util.Queue;

public class MirrorOfBinarySearchTree {
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
            if(root == null){
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

        public static void levelOrderTraversal(Node root){
            if (root == null) {
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while(!q.isEmpty()){
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

        //Convert the BST in Mirror
        public static void convertInMirrorUsingPostOrderTraversal(Node root){
            if (root == null) {
                return;
            }

            //Mirror LeftSubTree
            convertInMirrorUsingPostOrderTraversal(root.left);

            //Mirror RightSubTree
            convertInMirrorUsingPostOrderTraversal(root.right);

            //Swap the Children
            Node temp = root.left;
            root.left = root.right;
            root.right = temp;
        }
    }

    public static void main(String[] args) {
        int nodes[] = {8,5,3,6,10,11};
        Node root = null;
        for(int i=0; i<nodes.length; i++){
            root = BinarySearchTree.buildBinarySearchTree(root, nodes[i]);
        }
        BinarySearchTree.levelOrderTraversal(root);
        System.out.println();

        BinarySearchTree.convertInMirrorUsingPostOrderTraversal(root);
        BinarySearchTree.levelOrderTraversal(root);
    }
}
/**
 * Convert BST in Mirror
 *          
 *                                                5                                                     5
 *                                              / \                                                    / \
 *                                             3   7       Mirror =>                                  7   3
 *                                           / \  / \                                               / \  / \
 *                                          2  4  6  8                                             8  6  4  2
 * 
 * 1st Approach using PostOrder Traversal
 *      a) go in LeftSubTree
 *      b) go in rightSubTree
 *      c) Swap the Children
 * 
 * 
 * 2nd Approach using Level Order Traversal
 */