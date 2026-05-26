package BinaryTree.Part2;

public class MinimumDistanceBetween2NodesOfBinaryTree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public static Node buildBinaryTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildBinaryTree(nodes);
            newNode.right = buildBinaryTree(nodes);

            return newNode;
        }

        //Helper method to find the Lowest Comman Ancestor of n1 and n2
        public static Node lowestCommanAncestorByUsingRecursion(Node rootNode, int n1, int n2) {
            if (rootNode == null) {
                return null;
            }
            if (rootNode.data == n1 || rootNode.data == n2) {
                return rootNode;
            }

            Node leftLCA = lowestCommanAncestorByUsingRecursion(rootNode.left, n1, n2);
            Node rightLCA = lowestCommanAncestorByUsingRecursion(rootNode.right, n1, n2);

            if (leftLCA == null) { // leftLCA == null && rightLCA != null
                return rightLCA;
            }
            if (rightLCA == null) { // leftLCA != null && rightLCA == null
                return leftLCA;
            }

            return rootNode; // leftLCA != null && rightLCA != null
        }

        //Helper method to find the distance between lowestCommanAncestor to n
        public static int lcaDistToN(Node lowestCA, int n){
            if (lowestCA == null) {
                return -1;
            }
            if (lowestCA.data == n) {//if match then return 0
                return 0;
            }
            
            //if not match then search in leftSubTree
            int leftDist = lcaDistToN(lowestCA.left, n);
            //if not match then search in rightSubTree
            int rightDist = lcaDistToN(lowestCA.right, n);

            //if both -1 means not found so return -1
            if (leftDist == -1 && rightDist == -1) {
                return -1;
            }
            else if(leftDist == -1){//if left is -1 and right != -1 means rightSubTree had valid distance
                return rightDist + 1;
            }else{ //if left != -1 and right = -1 means leftSubTree had valid distance
                return leftDist + 1;
            }
        }

        public static int minimumDistance(Node rootNode, int n1, int n2) {
            //find the Lowest Comman Ancestor of n1 and n2
            Node lowestCA = lowestCommanAncestorByUsingRecursion(rootNode, n1, n2);
            // System.out.println("Lowest Comman Ancestor: " + lowestCA.data);

            //find the distance from lca to n1
            int dist1 = lcaDistToN(lowestCA, n1); 
            //find the distance from lca to n2
            int dist2 = lcaDistToN(lowestCA, n2);

            return dist1 + dist2;//add the both it becames minimum distance.
        }
    }

    public static void main(String[] args) {
        int n1 = 4, n2 = -15;
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1, -1 };
        Node rootNode = BinaryTree.buildBinaryTree(nodes);
        System.out.println("Root Node: " + rootNode.data);

        int minDistance = BinaryTree.minimumDistance(rootNode, n1, n2);
        System.out.println("Minimum Distance: "+minDistance);

    }
}
