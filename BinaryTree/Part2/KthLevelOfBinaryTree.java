package BinaryTree.Part2;

import java.util.LinkedList;
import java.util.Queue;

public class KthLevelOfBinaryTree {
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

        //1st Approach -----------------------
        //Print Kth Level of Binary Tree using Recursion TC:O(n).
        public static void kthLevelOfBinaryTreeUsingRecursion(Node rootNode, int level, int k){
            if(rootNode == null || k<1){
                return;
            }
            if (level == k) {
                System.out.print(rootNode.data+" ");
                return; //so after this we don't want to go to again child node of kth node
            }

            kthLevelOfBinaryTreeUsingRecursion(rootNode.left, level+1, k);
            kthLevelOfBinaryTreeUsingRecursion(rootNode.right, level+1, k);

        }


        //2nd Approach ----------------------------------
        //Print kth Level of Binary Tree using Level Order Traversal TC: O(n).
        public static void kthLevelOfBinaryTreeUsingLevelOrderTraversal(Node rootNode, int k){
            if (rootNode == null || k<1) {
                System.out.println("Root Node null/ k is less than 1");
                return;
            }

            Queue<Node> q = new LinkedList<>();
            q.add(rootNode);
            q.add(null);
            int tempLevel = 1;

            while (!q.isEmpty()) {
                Node currNode = q.remove();
                if (currNode == null) {
                    if (q.isEmpty()) {
                        return;
                    }
                    else{
                        if (k == tempLevel) {
                            return; //Already kth Level print so we don't have need to check again, return out from the method
                        }
                        q.add(null);
                        tempLevel++;
                    }
                }
                else{
                    if (k == tempLevel) {
                        System.out.print(currNode.data+" ");
                        continue; //after reaching to kth level we don't want to add again next level data
                    }
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
        int nodes[] = {20,8,5,-1,-1,3,10,-1,-1,14,-1,-1,22,-1,25,-1,-1};
        int k = 3;
        Node rootNode = BinaryTree.buildBinaryTree(nodes);
        System.out.println("Root Node: "+rootNode.data);

        // BinaryTree.kthLevelOfBinaryTreeUsingRecursion(rootNode, 1, k);

        BinaryTree.kthLevelOfBinaryTreeUsingLevelOrderTraversal(rootNode, k);
    }
}

/*
 *Kth Level Of Binary Tree
 *It means all nodes that are prsent at level k.
 
                        20   <- Level 1
                       / \
                      8   22  <- Level 2
                    / \     \
                   5   3    25 <- Level 3
                      / \
                    10  14     <- Level 4

                    k = 3
                    so Output = {5, 3, 25}

    
 */
