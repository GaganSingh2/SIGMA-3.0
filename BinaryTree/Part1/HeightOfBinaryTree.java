package BinaryTree.Part1;

import java.util.Scanner;

public class HeightOfBinaryTree {
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

        //Find the maximum height of tree
        public static int height(Node rootNode){
            if (rootNode == null) {
                return 0;
            }
            //find left subtree height
            int leftHeight = height(rootNode.left);

            //find right subtree height
            int rightHeight = height(rootNode.right);

            //find the maximum height from both leftHeight and rightHeight
            int maxHeight = Math.max(leftHeight,rightHeight);
            
            return maxHeight+1; //add 1 in maxHeighth for current Node.
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of Nodes: ");
        int len = sc.nextInt();

        int nodes[] = new int[len];
        System.out.println("Enter Data: ");
        for(int i=0; i<len; i++){
            nodes[i] = sc.nextInt();
        }
        //  int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
       
        Node rootNode = BinaryTree.buildTree(nodes);
        System.out.println("Root Node: "+rootNode.data);
        
        int maxHeight = BinaryTree.height(rootNode);
        System.out.println("Maximum Height: "+maxHeight);
    }
}
