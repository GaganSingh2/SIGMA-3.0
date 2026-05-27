package BinaryTree.Part2;

import java.util.LinkedList;
import java.util.Queue;

public class TransformBInaryTreeToSumTree {

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

        //Helper method to print the Tree by using Level Order Traversal
        public static void printSumTreeUsingLevelOrderTraversal(Node rootNode){
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

        //Transform Binary Tree to Sum Tree by Using Post Order Traversal (left->right->root)
        public static int transformToSumTree(Node rootNode){
            if (rootNode == null) {
                return 0;
            }

            int leftSum = transformToSumTree(rootNode.left);//find sum of leftSubTree
            int rightSum = transformToSumTree(rootNode.right);//find sum of leftSubTree

            int currData = rootNode.data;

            int newLeft = rootNode.left == null ? 0 : rootNode.left.data; //remove the NullPointerException
            int newRight = rootNode.right == null ? 0 : rootNode.right.data; //remove the NullPointerException

            //replace the rootData by new data
            rootNode.data = newLeft + leftSum + newRight + rightSum;

            return currData;
        }
    }
    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1, -1 };
        Node rootNode = BinaryTree.buildBinaryTree(nodes);
        System.out.println("Root Node: "+rootNode.data);

        System.out.println("Before Transformation--------------");
        BinaryTree.printSumTreeUsingLevelOrderTraversal(rootNode);
         BinaryTree.transformToSumTree(rootNode);

        System.out.println();
        System.out.println("After Transformation--------------");
        BinaryTree.printSumTreeUsingLevelOrderTraversal(rootNode);
    }
}

/**
 * Transform to Sum Tree
 * In a Sum Tree, every node store the sum of value present in its left and right subtree in original tree.
 * THe node's original value is replace by this sum of leftSubTree and rightSubTree.
 * 
 *                  1                                27  left(2+4+5) + right(3+6+7)
                   / \                              / \
                  2   3         ==>                9   13 left(4) + right(5)
                / \  / \                         / \  / \
               4  5 6  7                        0  0 0  0
 */