package BinarySearchTree.Part2;

import java.util.LinkedList;
import java.util.Queue;

public class SizeOfLargestBinarySearchTreeInBinaryTree {
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

    static class InfoOfNode{
        boolean isBst;
        int size;
        int min;
        int max;

        InfoOfNode(boolean isBst, int size, int min, int max){
            this.isBst = isBst;
            this.size = size;
            this.min = min;
            this.max = max;
        }
    }

    static class BinarySearchTree{
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
                        System.out.println();
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


        public static int maxSize = 0; //for final maxSize of Largest BST        
        public static InfoOfNode maximumSizeOfLargestBinarySearchTree(Node root){
            if (root == null) {
                return new InfoOfNode(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
            }

            //find the information of leftSUbTree
            InfoOfNode leftInof = maximumSizeOfLargestBinarySearchTree(root.left);

            //find the information of rightSUbTree
            InfoOfNode rightInfo = maximumSizeOfLargestBinarySearchTree(root.right);

            int currSize = leftInof.size + rightInfo.size + 1;
            int currMin = Math.min(root.data, Math.min(leftInof.min, rightInfo.min));

            int currMax = Math.max(root.data, Math.max(leftInof.max, rightInfo.max));

            // //if any one is correct means this is the invalid BST
            // if (root.data <= leftInof.max || root.data >= rightInfo.min) {
            //     return new InfoOfNode(false, currSize, currMin, currMax);
            // }

            // //if both are true means current node have valid BST
            // if (leftInof.isBst && rightInfo.isBst) {
            //     maxSize = Math.max(currSize, maxSize);//update the final size when both are true
            //     return new InfoOfNode(true, currSize, currMin, currMax);
            // }

            //both are same approach i just use bst rule so if all means it is a valid BST 
            if(leftInof.isBst && rightInfo.isBst && root.data > leftInof.max && root.data < rightInfo.min){
                //update the maxSize
                maxSize = Math.max(maxSize, currSize);

                return new InfoOfNode(true, currSize, currMin, currMax);
            }

            //Otherwise not a BST
            return new InfoOfNode(false, currSize, currMin, currMax);
        }
    }
    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.left.left = new Node(5);
        root.left.right = new Node(20);

        root.right = new Node(60);
        root.right.left = new Node(45);
        root.right.right = new Node(70);
        root.right.right.left = new Node(65);
        root.right.right.right = new Node(80);

        BinarySearchTree.levelOrderTraversal(root);
        BinarySearchTree.maximumSizeOfLargestBinarySearchTree(root);
        System.out.println("Maximum Size Largest BST in BT: "+BinarySearchTree.maxSize);
    }
}

/**
 * Size of Largest Binary Search Tree in Binary Tree
 *                                      50
 *          Input=>                    / \          
 *                                   30  60
 *                                  / \  / \
 *                                 5 20 45  70
 *                                          / \
 *                                         65  80
 * 
 * 
 *                                              60
 *        Expected Output=>                    / \           maxSize = 5(total Nodes)
 *                                            45  70
 *                                                / \
 *                                              65  80
 * 
 * Approach using PostOrder Traversal and Valid BST
 * 1)if root is null then return true and size = 0
 * 
 * 2)create one static maxSize to store final LargestBST size.
 * 
 * 3)for each node we have to find the 4 basic information
 *              a)isBST (boolean) i.e. node follow the BST rules or not
 *              b)size (currSize = leftSize + rightSize + 1(node itsself))
 *              c)min (minimum possible value for subTree)
 *              d)max (maximum possible value for subTree)
 * 
 * 4)check the node is Valid BST (PostOrder Traversal (Left->Right->Root))
 *      a)check for LeftSubTree
 *      b)Check for RightSubTree
 * 
 *      c) find size = leftSize + rightSize + 1
 *      d)find the min = Math.min(root.data, Math.min(leftMin, rightMin))
 *      e)max = Math.max(root.data, Math.max(leftMax, rightMax))}
 * 
 *      f)if root is null then return (isBST = true, size = 1, max = rootValue, min = rootValue)
 * 
 *      g)if root.data <= leftMaxVal or root.data > rightMinVal
 *          so it is not follow the BST rule so return 
 *                  {isBST = false, size, min, max}
 *      
 *      h)if leftSubTree and RightSubTree both are true 
 *                  then update maxSize = Math.max(maxSize, currSize)
 * 
 *                  and then return  
 *                 {isBST = true, size, min, max} 
 *      
 *      i)if leftSubTree and RightSubTree either one is false 
 *                  and then return  
 *                 {isBST = false, size, min, max} 
 *      
 */