package BinaryTree.PracticeQus;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class PrintRootToLeafOfBinaryTree {
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

        public static void levelOrderTraversal(Node root){
            if (root == null) {
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty()){
                Node currNode = q.remove();
                if (currNode == null) {
                    if (q.isEmpty()) {
                        return;
                    }
                    else{
                        q.add(null);
                        System.out.println();
                    }
                }
                else{
                    System.out.print(currNode.data+" ");
                    if (currNode.left != null) {
                        q.add(currNode.left);
                    }
                    if(currNode.right != null){
                        q.add(currNode.right);
                    }
                }
            }
        }

        private static void printPath(ArrayList<Integer> path){
            for(int i=0; i<path.size(); i++){
                System.out.print(path.get(i)+" -> ");
            }
            System.out.print(" null");
            System.out.println();
        }
        public static void printRootToLeaf(Node root, ArrayList<Integer> path){
            if (root == null) {
                return;
            }

            path.add(root.data);
            if (root.left == null && root.right == null) {
                printPath(path);
            }
            else{
                printRootToLeaf(root.left, path);
                printRootToLeaf(root.right, path);
            }

            path.remove(path.size()-1);
        }
    }
    public static void main(String[] args) {
        int nodes[] =  {1,3,3,-1,-1,2,-1,-1,3,-1,-1};
        Node root = BinaryTree.buildBinaryTree(nodes);
        BinaryTree.levelOrderTraversal(root);
        System.out.println();
        BinaryTree.printRootToLeaf(root, new ArrayList<>());
    }
}
