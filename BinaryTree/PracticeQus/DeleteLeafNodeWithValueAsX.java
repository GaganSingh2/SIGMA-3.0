package BinaryTree.PracticeQus;

import java.util.LinkedList;
import java.util.Queue;

public class DeleteLeafNodeWithValueAsX {
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

        //Delete leaf of node with value as x using PostOrder Traversal
        public static Node deleteLeafNodeWithValueAsX(Node rootNode, int target){
            if (rootNode == null) {
                return null;
            }

            rootNode.left = deleteLeafNodeWithValueAsX(rootNode.left, target);
            rootNode.right = deleteLeafNodeWithValueAsX(rootNode.right, target);

            if (rootNode.left == null && rootNode.right == null) {
                if (rootNode.data == target) {
                    return null; //delete the target value
                }
            }
            return rootNode;
        }


        //Level Order Traversal 
        public static void levelOrderTraversal(Node rootNode){
            if (rootNode == null) {
                return;
            }

            Queue<Node> q = new  LinkedList<>();
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
    }
    public static void main(String[] args) {
        int nodes[] = {1,3,3,-1,-1,2,-1,-1,3,-1,-1};
        Node rootNode = BinaryTree.buildBinaryTree(nodes);
        System.out.println("Root Node: "+rootNode.data);

        BinaryTree.levelOrderTraversal(rootNode);
        System.out.println();
        System.out.println("----------------------------------");
        int target = 3;
        BinaryTree.deleteLeafNodeWithValueAsX(rootNode, target);
        BinaryTree.levelOrderTraversal(rootNode);
    }
}
/**
 * Delete leaf nodes with values as x.
 * We have a binary tree and a target integer x,delete all the leaf nodes having value as x. Also, delete the newly formed leaves with the target value as x
 * 
 * 
 *          1                              1
 *         / \                            /
 *        3   3        ==>               3
 *       / \                              \
 *      3   2                              2
 * 
 *  x = 3
 */