package BinaryTree.Part1;

import java.util.Scanner;

public class CountOfNodes {
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
        public static Node buildTree(int nodes[]){
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        public static int countOfNodes(Node rootNode){

            if (rootNode == null) {
                return 0;
            }

             //find total nodes of left subtree height
            int leftCount = countOfNodes(rootNode.left);

            //find total nodes of right subtree height
            int rightCount = countOfNodes(rootNode.right);

            //then, leftCount + rightCount + 1 (1 is rootNode)
            return leftCount + rightCount + 1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Number of Nodes: ");
        // int len = sc.nextInt();

        // int nodes[] = new int[len];
        // System.out.println("Enter Data: ");
        // for(int i=0; i<len; i++){
        //     nodes[i] = sc.nextInt();
        // }
         int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,4,-1,2,-1,-1};
       
        Node rootNode = BinaryTree.buildTree(nodes);
        System.out.println("Root Node: "+rootNode.data);
        
        int maxHeight = BinaryTree.countOfNodes(rootNode);
        System.out.println("Total Count Nodes in Tree: "+maxHeight);
    }
}
