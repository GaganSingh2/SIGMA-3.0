package BinaryTree.Part2;

import java.util.ArrayList;

public class LowestCommanAncestorOfBinaryTree {
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

        //1st Approach ----------------------------------------
        //Helper Method to Store the node from rootNode to n in ArrayList
        public static boolean getPath(Node rootNode, int n, ArrayList<Node> path){

            if (rootNode == null) {
                return false;
            }
            path.add(rootNode);
            if (rootNode.data == n) {
                return true;
            }

            boolean foundLeft = getPath(rootNode.left, n, path);
            boolean foundRight = getPath(rootNode.right, n, path);

            if (foundRight || foundLeft) {
                return true;
            }

            path.remove(path.size()-1);//means node n is not exist in leftSubTree and RightSubTree
            return false;
        }
        
        //Perform Lowest Comman Ancestor using ArrayList
        public static Node lowestCommanAncestor(Node rootNode, int n1, int n2){
            ArrayList<Node> path1 = new ArrayList<>();
            ArrayList<Node> path2 = new ArrayList<>();

            boolean foundLeft = getPath(rootNode, n1, path1);
            boolean foundRight = getPath(rootNode, n2, path2);

            if (!foundLeft || !foundRight) {
                return null; //means givens n1 or n2 is not present in whole Binary Tree
            }

            int i = 0;
            while (i<path1.size() && i<path2.size()) {
                if (path1.get(i).data != path2.get(i).data) {
                    break;
                }
                i++;
            }
            return path1.get(i-1);//last comman data
        }
    }
    public static void main(String[] args) {
        int nodes[] = {3,5,6,-1,-1,2,7,-1,-1,4,-1,-1,1,0,-1,-1,8,-1,-1};
        // int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,6,-1,-1,7,-1,-1};
        Node rootNode = BinaryTree.buildBinaryTree(nodes);
        System.out.println("Root Node: "+rootNode.data);

        int n1 = 15;
        int n2 = 4;
        Node res = BinaryTree.lowestCommanAncestor(rootNode, n1, n2);
        if (res != null) {
            System.out.println("Lowest Comman Ancestor: "+res.data);
        }
        else{
            System.out.println("Lowest Comman Ancestor not Found");
        }
    }
}

/**
 * Lowest Comman Ancestor 
 * The LCA of two nodes n1 and n2 is:
 * The lowest(deepest) node in the tree that has both n1 and n2 as descendants(that n1 node can be its own ancestor)
 * last comman node data both nodes.
 * 
 *                       3      
                        / \
                       5   1   
                     / \   / \
                    6   2 0  8  
                      / \
                     7  4    

                if n1=7 & n2=4 so LCA = 2
                if n1=5 & n2=4 so LCA = 5
                if n1=12 & n2=8 so LCA = null(bcz n1 value is not present in Tree)
 */
