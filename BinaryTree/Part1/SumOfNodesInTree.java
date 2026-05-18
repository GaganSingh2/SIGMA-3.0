package BinaryTree.Part1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SumOfNodesInTree {
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

        public static int sumOfNodesUsingRecursion(Node rootNode) {

            if (rootNode == null) {
                return 0;
            }

            // find total sum of nodes of left subtree
            int leftSum = sumOfNodesUsingRecursion(rootNode.left);

            // find total sum of nodes of right subtree
            int rightSum = sumOfNodesUsingRecursion(rootNode.right);

            // then, leftSUm + rightSUm + rootNode.data
            return leftSum + rightSum + rootNode.data;
        }

        public static int sumOfNodesUsingLevelOrderTraversal(Node rootNode) {
            if (rootNode == null) {
                return 0;
            }
            int sum = 0;

            Queue<Node> tmp = new LinkedList<>();
            tmp.add(rootNode);
            tmp.add(null);

            while (!tmp.isEmpty()) {
                Node currNode = tmp.remove();
                if (currNode == null) {
                    if (tmp.isEmpty()) {
                        return sum;
                    } else {
                        tmp.add(null);
                    }
                } else {
                    sum += currNode.data;
                    if (currNode.left != null) {
                        tmp.add(currNode.left);
                    }
                    if (currNode.right != null) {
                        tmp.add(currNode.right);
                    }
                }
            }

            return sum;
        }

    }

    public static void main(String[] args) {
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

        // int sum = BinaryTree.sumOfNodesUsingRecursion(rootNode);
        // System.out.println("Total Sum of Nodes in Tree: "+sum);

        int sum = BinaryTree.sumOfNodesUsingLevelOrderTraversal(rootNode);
        System.out.println("Total Sum of Nodes in Tree: " + sum);
    }
}
