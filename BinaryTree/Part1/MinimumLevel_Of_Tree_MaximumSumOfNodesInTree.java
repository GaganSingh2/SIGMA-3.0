package BinaryTree.Part1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MinimumLevel_Of_Tree_MaximumSumOfNodesInTree {
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

        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        public static int minimumLevelOfTreeInMaximumSumofNode(Node rootNode){
            if (rootNode == null) {
                return 0;
            }

            int maxLevel = 1, tempLevel = 1;
            int sum = Integer.MIN_VALUE, tempSum = 0;

            Queue<Node> que = new LinkedList<>();
            que.add(rootNode);
            que.add(null);

            while (!que.isEmpty()) {
                Node currNode = que.remove();
                
                if (currNode == null) {
                    if (tempSum>sum) {
                        sum = tempSum;
                        maxLevel = tempLevel;
                    }
                    tempLevel++;
                    tempSum = 0;
                    if (que.isEmpty()) {
                        return maxLevel;
                    }
                    else{
                        que.add(null);
                    }
                }
                else{
                    tempSum += currNode.data;
                    if (currNode.left != null) {
                        que.add(currNode.left);
                    }
                    if (currNode.right != null) {
                        que.add(currNode.right);
                    }
                }
            }
            return maxLevel;
        }
    }

    public static void main(String[] args) {
        /*LeetCode: 1161
         * Given the root of a binary tree, the level of its root is 1, the level of its children is 2, and so on.
         * Return the smallest level x such that the sum of all the values of nodes at level x is maximal.
         */
        Scanner sc = new Scanner(System.in);
        // System.out.println("Number of Nodes: ");
        // int len = sc.nextInt();

        // int nodes[] = new int[len];
        // System.out.println("Enter Data: ");
        // for(int i=0; i<len; i++){
        // nodes[i] = sc.nextInt();
        // }
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, 4, -1, 2, -1, -1 };

        Node rootNode = BinaryTree.buildTree(nodes);
        System.out.println("Root Node: " + rootNode.data);

        int ansLevel = BinaryTree.minimumLevelOfTreeInMaximumSumofNode(rootNode);
        System.out.println("Minimum Level in Tree: " + ansLevel);
    }
}

/*Input: root = [1,7,0,7,-8,null,null]
Output: 2
Explanation: 
Level 1 sum = 1.
Level 2 sum = 7 + 0 = 7.
Level 3 sum = 7 + -8 = -1.
So we return the level with the maximum sum which is level 2. */