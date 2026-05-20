package BinaryTree.Part1;

import java.util.LinkedList;
import java.util.Queue;

import BinaryTree.Part1.DiameterOfTree.BinaryTree.DiameterInfo;

public class DiameterOfTree {
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

        //Helper Method to find the Height of each SUbtree.
        public static int heightOfTree(Node rootNode){
            if (rootNode == null) {
                return 0;
            }

            int lefHeight = heightOfTree(rootNode.left);

            int rightHeight = heightOfTree(rootNode.right);

            return Math.max(lefHeight, rightHeight)+1;
        }

        // Approach 1 TC: O(n^2), because here both height and diameter calculate one by one
        public static int diameterOfTree(Node rootNode){
            if (rootNode == null) {
                return 0;
            }

            int leftDiameter = diameterOfTree(rootNode.left);
            int rightDiameter = diameterOfTree(rootNode.right);

            int lefHeight = heightOfTree(rootNode.left);
            int rightHeight = heightOfTree(rootNode.right);

            int selfHeight = lefHeight + rightHeight + 1;

            return Math.max(selfHeight, Math.max(leftDiameter, rightDiameter));

        }

        //Helper Class to store the Diameter and Height of Tree in the form of Object
        static class DiameterInfo{
            int diameter;
            int height;

            DiameterInfo(int diameter, int height){
                this.diameter = diameter;
                this.height = height;
            }
        }

        //Approach-2 TC: O(n) bcz here we iterate only one time
        public static DiameterInfo diameterOfTree2(Node rootNode){
            if (rootNode == null) {
                return new DiameterInfo(0, 0);
            }

            DiameterInfo leftInfo = diameterOfTree2(rootNode.left);

            DiameterInfo rightInfo = diameterOfTree2(rootNode.right);

            int selfDiameter = leftInfo.height + rightInfo.height + 1;

            int finalDiameter = Math.max(selfDiameter, Math.max(leftInfo.diameter, rightInfo.diameter));

            int finalHeight = Math.max(leftInfo.height, rightInfo.height) + 1;

            return new DiameterInfo(finalDiameter, finalHeight);
        }

    }
    public static void main(String[] args) {
        // int nodes[] = {1,2,4,9,-1,-1,-1,5,-1,6,-1,7,-1,-1,3,-1,-1};
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,6,-1,-1,7,-1,-1};

        Node rootNode = BinaryTree.buildBinaryTree(nodes);
        System.out.println("Root Node: "+rootNode.data);

        DiameterInfo info = BinaryTree.diameterOfTree2(rootNode);
        System.out.println("Maximum Diameter: "+info.diameter);
    }
}

/*
Diameter of Tree means: 
* It is the length of longest path between any two nodes in tree.
* The path: 
    * May or may not pass through the root.
    * Is measured in edges.
    *                   1
    *                  / \
    *                 2   3
    *                / \    
    *               4   5    
    *              /     \
    *             9       6
    *                      \
    *                       7
    * Diameter = 6 
    * (7->6->5->2->1->3) pass through the Root Node
    * (9->4->2->5->6->7) not pass through the Root Node
    * 
    * 
 */
