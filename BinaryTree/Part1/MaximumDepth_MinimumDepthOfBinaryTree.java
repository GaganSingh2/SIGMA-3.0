package BinaryTree.Part1;

public class MaximumDepth_MinimumDepthOfBinaryTree {
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

        //Q1) Maximum Depth of Binary Tree
        public static int maximumDepth(Node rootNode){
            if (rootNode == null) {
                return 0;
            }

            int leftDepth = maximumDepth(rootNode.left);

            int rightDepth = maximumDepth(rootNode.right);

            int max = Math.max(leftDepth, rightDepth);

            return max + 1; //to add rootNode
        }

        public static int minimumDepth(Node rootNode){
            if (rootNode == null) {
                return 0;
            }

            int leftDepth = minimumDepth(rootNode.left);

            int rightDepth = minimumDepth(rootNode.right);

            int minDepth = Math.min(leftDepth, rightDepth);

            return (leftDepth == 0 || rightDepth == 0)? leftDepth + rightDepth + 1 : minDepth + 1;
        }
    }
    public static void main(String[] args) {
        int nodes[] = {3,9,-1,-1,20,15,-1,-1,7,-1,-1};
        BinaryTree.idx = -1;
        Node rootNode = BinaryTree.buildBinaryTree(nodes);
        System.out.println("Root Node: "+rootNode.data);

        int maxDepth = BinaryTree.maximumDepth(rootNode);
        System.out.println("Maximum Depth: "+maxDepth);

        int minDepth = BinaryTree.minimumDepth(rootNode);
        System.out.println("Minimum Depth: "+minDepth);
    }
}
/*
* Q1)Maximum Depth of Binary Tree (LeetCode: 104)-----
* Given the root of a binary tree, return its maximum depth.
A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node
                    3      <- Level-1
                   / \
                  9  20    <- Level-2
                    / \
                   15  7   <- Level-3 (Maximum Depth)
     Output = 3
 */

/*
* Q2)Minimum Depth of Binary Tree (LeetCode: 111)-----
* Given the root of a binary tree, return its maximum depth.
A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node
                   Level-1    ->        3      
                                       / \
    (Minimum Depth)Level-2    ->      9  20    
                                         / \
                   Level-3    ->        15  7   

     Output = 2
 */


