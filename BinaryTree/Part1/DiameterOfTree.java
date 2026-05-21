package BinaryTree.Part1;

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

         // Approach 1 to find the nodes TC: O(n^2), because here both height and diameter calculate one by one
        //Helper Method to find the Height of each SUbtree.
        public static int heightOfTree(Node rootNode){
            if (rootNode == null) {
                return 0;
            }

            int lefHeight = heightOfTree(rootNode.left);

            int rightHeight = heightOfTree(rootNode.right);

            return Math.max(lefHeight, rightHeight)+1;
        }

       
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


        //-------------------------------------------------------------------------------------------
        //Approach-2 to find the nodes TC: O(n) bcz here we iterate only one time
        //Helper Class to store the Diameter and Height of Tree in the form of Object
        static class DiameterInfo{
            int diameter;
            int height;

            DiameterInfo(int diameter, int height){
                this.diameter = diameter;
                this.height = height;
            }
        }

        
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


        //Approach-1 (to find the edges) TC: O(n) bcz we iterate all nodes only one time 
        static int diameter = 0;
        public static int heightOfTreeInEdges(Node root){
            if (root == null) {
                return 0;
            }

            int lefHeight = heightOfTreeInEdges(root.left);
            int rightHeight = heightOfTreeInEdges(root.right);

            int currDiameter = lefHeight + rightHeight;

            diameter = Math.max(diameter, currDiameter);

            return Math.max(lefHeight, rightHeight) + 1;
        }

        public static int diameterOfTreeInEdges(Node rootNode){
            if (rootNode == null) {
                return 0;
            }

            heightOfTreeInEdges(rootNode);
            return diameter;
        }

    }
    public static void main(String[] args) {
        // int nodes[] = {1,2,4,9,-1,-1,-1,5,-1,6,-1,7,-1,-1,3,-1,-1};
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,6,-1,-1,7,-1,-1};

       
        Node rootNode = BinaryTree.buildBinaryTree(nodes);
        System.out.println("Root Node: "+rootNode.data);

         //Approach-1 (to find the nodes)
         int maxDiameterInNode = BinaryTree.diameterOfTree(rootNode);
         System.out.println("Maximum Diameter(in nodes): "+maxDiameterInNode);

        //Approach-2 (to find the nodes)
        DiameterInfo info = BinaryTree.diameterOfTree2(rootNode);
        System.out.println("Maximum Diameter(in nodes): "+info.diameter);

        //Approach-1 (to find the edges)
        int maxDiameterInEdges = BinaryTree.diameterOfTreeInEdges(rootNode);
        System.out.println("Maximum Diamter(in Edges): "+maxDiameterInEdges);
    }
}

/*
Diameter of Tree means: 
* It is the length of longest path between any two nodes in tree.
* The path: 
    * May or may not pass through the root.
    * Is measured in edges or measured in nodes.
    *                   1
    *                  / \
    *                 2   3
    *                / \    
    *               4   5    
    *              /     \
    *             9       6
    *                      \
    *                       7
    * Diameter = 6 (nodes)
    * Diameter = 5 (edges)
    * (7->6->5->2->1->3) pass through the Root Node
    * (9->4->2->5->6->7) not pass through the Root Node
    * 
    * 
 */
