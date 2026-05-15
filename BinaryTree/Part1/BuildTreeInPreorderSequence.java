package BinaryTree.Part1;

import java.util.Scanner;

public class BuildTreeInPreorderSequence {
    static class Node{ //Create the Single Node
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
            if (nodes[idx]==-1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]); //Create a new Node
            newNode.left = buildTree(nodes); //Connect the left nodes until -1 is not occured 
            newNode.right = buildTree(nodes); //Connect the right nodes until the -1 is not occured

            return newNode;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length");
        int size = sc.nextInt();
        int nodes[] = new int[size];

        System.out.println("Enter the data: ");
        for(int i=0; i<size; i++){
            nodes[i] = sc.nextInt();
        }
        
        Node root = BinaryTree.buildTree(nodes);
        System.out.println("Root Node: "+root.data);

    }
}
