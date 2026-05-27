package BinaryTree.Part2;

import java.util.ArrayList;

public class KthAncestorOfNodeInBinaryTree {
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

        //1st Approach------------------------------------------
        //Find the Kth Ancestor of given node by using Recursion
        public static int kthAncestorOfNodeByUsingRecursion(Node rootNode, int node, int k){
            if (rootNode == null || k<1) {
                return -1;
            }
            if (rootNode.data == node) { //given node is find so return 0
                return 0;
            }

            //find the given node distance in leftSubTree, if node not found then gives -1
            int leftDist = kthAncestorOfNodeByUsingRecursion(rootNode.left, node, k);

            //find the given node distance in rightSubTree, if node not found then gives -1
            int rightDist = kthAncestorOfNodeByUsingRecursion(rootNode.right, node, k);
            
            if (leftDist == -1 && rightDist == -1) {//if both -1 then return -1
                return -1;
            }

            //if any one subTree gives the distance more than -1 then find the maxDistance
            int maxDist = Math.max(leftDist, rightDist);
            //then check if maxDist+1 == k means rootNode is kth Ancestor of node so return the rootNode data
            if (maxDist+1 == k) {
                System.out.println(k+"th Ancestor of node "+node+": "+rootNode.data);
            }
            return maxDist + 1;
        }

        //2nd Approach By using Path Based Approach----------------
        //Helper method to store nodes form rootNode to given node
        public static boolean getPath(Node rootNode, int node, ArrayList<Node> path){
            if (rootNode == null) {
                return false;
            }

            path.add(rootNode); //add the rootNode in path
            if (rootNode.data == node) { //if rootNode is your given node then return true, means given node is found in Tree
                return true;
            }

            boolean foundLeft = getPath(rootNode.left, node, path);//otherwise check in the leftSubTree
            boolean foundRight = getPath(rootNode.right, node, path);//otherwise check in the rightSubTree

            if (foundLeft || foundRight) {//if any one is return true means given node is found in Tree
                return true;
            }
            path.remove(path.size()-1); //otherwise remove the added rootNode from ArrayList
            return false; //means not found
        }
        
        //Find kth Ancestor by using Path based
        public static int kthAncestorOfNodeByUsingPathBased(Node rootNode, int node, int k){
            if (k<0) { //if kth position is less than 0 means invalid
                return -1;
            }
            ArrayList<Node> path = new ArrayList<>();

            boolean foundPath = getPath(rootNode, node, path);//store the path from rootNode to given node if its return true means path exist, otherwise not

            if (!foundPath) { //path not exist in Tree
                return -1;
            }
            int index = path.size()-k-1;
            if (index < 0) {
                return -1; //kth Ancestor not exist
            }

            return path.get(index).data;
        }
    }
    public static void main(String[] args) {
        int node = 5, k = 5;
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1, -1 };
        Node rootNode = BinaryTree.buildBinaryTree(nodes);
        System.out.println("Root Node: "+rootNode.data);

        //1st Approach by Using Recursion-----------
        // int res = BinaryTree.kthAncestorOfNodeByUsingRecursion(rootNode, node, k);
        // if (res == -1) {
        //     System.out.println("Node not Found");
        // }

        //2nd Approach by using Path Based--------------
        int res = BinaryTree.kthAncestorOfNodeByUsingPathBased(rootNode, node, k);
        System.out.println(k+"th Ancestor of node "+node+": "+res);
    }
}

/**
 * Kth Ancestor of Node
 * Kth ancestor of node is the node that is k level above it.
 * 
 *                  1      
                   / \
                  2   3    
                / \   / \
               4  5  6  7
               
               node = 5, k = 2
               output = 1 {5->2(1st), 2->1(2nd)}
 */
