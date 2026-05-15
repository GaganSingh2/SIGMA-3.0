package BinaryTree.Part1;

import java.util.*;

public class LevelOrderTraversal {
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
            if (nodes[idx]==-1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        //Level Order Traversal(Print Level by Level Nodes)
        public static void levelOrderTraversal(Node rootNode){
            if (rootNode == null) {
                return;
            }

            Queue<Node> tmp = new LinkedList<>();
            tmp.add(rootNode);
            tmp.add(null);

            while (!tmp.isEmpty()) {
                Node curr = tmp.remove();
                if (curr == null) {
                    System.out.println();
                    if (tmp.isEmpty()) {
                        return;
                    }
                    else{
                        tmp.add(null);
                    }
                }
                else{
                    System.out.print(curr.data+" ");
                    if (curr.left != null) {
                        tmp.add(curr.left);
                    }
                    if (curr.right != null) {
                        tmp.add(curr.right);
                    }
                }

            }
        }
    }

    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node rootNode = tree.buildTree(nodes);
        System.out.println("RootNode: "+rootNode.data);

        tree.levelOrderTraversal(rootNode);
    }
}
