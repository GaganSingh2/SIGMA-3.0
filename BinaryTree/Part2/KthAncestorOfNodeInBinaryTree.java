package BinaryTree.Part2;

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

        //Find the Kth Ancestor of given node by using Recursion
        public static int kthAncestorOfNode(Node rootNode, int node, int k){
            if (rootNode == null) {
                return -1;
            }
            if (rootNode.data == node) { //given node is find so return 0
                return 0;
            }

            //find the given node distance in leftSubTree, if node not found then gives -1
            int leftDist = kthAncestorOfNode(rootNode.left, node, k);

            //find the given node distance in rightSubTree, if node not found then gives -1
            int rightDist = kthAncestorOfNode(rootNode.right, node, k);
            
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
    }
    public static void main(String[] args) {
        int node = 6, k = 2;
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1, -1 };
        Node rootNode = BinaryTree.buildBinaryTree(nodes);
        System.out.println("Root Node: "+rootNode.data);

        BinaryTree.kthAncestorOfNode(rootNode, node, k);
        // System.out.println(k+"th Ancestor of node "+node+": "+kthNode);
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
