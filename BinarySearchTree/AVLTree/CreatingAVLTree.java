package BinarySearchTree.AVLTree;

import java.util.LinkedList;
import java.util.Queue;

public class CreatingAVLTree {
    static class Node{
        int data;
        int height;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
            this.height = 1;
        }
    }

    public static Node root;

    static class AVLTree{

        public static void preOrderTraversal(Node root){
            if (root == null) {
                return;
            }
            System.out.print(root.data+" ");
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }
        public static void levelOrderTraversal(Node root){
            if (root == null) {
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while (!q.isEmpty()) {
                Node currNode = q.remove();
                if (currNode == null) {
                    if (q.isEmpty()) {
                        System.out.println();
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
                    if (currNode.right != null) {
                        q.add(currNode.right);
                    }
                }
            }
        }

        //Calculate the Height of the node
        public static int height(Node root){
            if (root == null) {
                return 0;
            }

            return root.height;
        }

        //Calculate the Balance Factor for each Node (a valid AVL Tree has BF always {-1,0,1})
        public static int getBalanceFactor(Node root){
            if (root == null) {
                return 0;
            }

            return height(root.left) - height(root.right);
        }

        //Right roate subTree rooted with rootY
        public static Node rightRotate(Node rootY){
            Node rootX = rootY.left;
            Node t2 = rootX.right;

            //Rotation using 3 nodes
            rootX.right = rootY;
            rootY.left = t2;

            //update the Heights
            rootY.height = Math.max(height(rootY.left), height(rootY.right)) + 1;

            rootX.height = Math.max(height(rootX.left), height(rootX.right)) + 1;

            //rootX is new Root
            return rootX;
        }

        //Left Rotate subTree rooted with rootX
        public static Node leftRotate(Node rootX){
            Node rootY = rootX.right;
            Node t2 = rootY.left;

            //Rotation using 3 nodes
            rootY.left = rootX;
            rootX.right = t2;

            //Update the Heights
            rootX.height = Math.max(height(rootX.left), height(rootX.right)) + 1;

            rootY.height = Math.max(height(rootY.left), height(rootY.right)) + 1;

            //rootY is new Root
            return rootY;
        }

        //Build or Create the AVL Tree(Balance Binary Search Tree)
        public static Node buildAVLTree(Node root, int key){
            if (root == null) {
                root = new Node(key);
                return root;
            }

            if (key < root.data) {
                root.left = buildAVLTree(root.left, key);
            }
            else if(key > root.data){
                root.right = buildAVLTree(root.right, key);
            }
            else{
                return root; //Duplicate keys or nodes are not allowed
            }

            //update root Height
            root.height = 1 + Math.max(height(root.left), height(root.right));

            //Get root's Balance Factor
            int bf = getBalanceFactor(root);

            //Rotation Cases------
            //Left Left Rotation
            if (bf > 1 && key < root.left.data) {
                return rightRotate(root);
            }

            //Right Right Rotation
            if (bf < -1 && key > root.right.data) {
                return leftRotate(root);
            }

            //Left Right Rotation
            if (bf > 1 && key > root.left.data) {
                root.left = leftRotate(root.left);
                return rightRotate(root);
            }

            //Right Left Rotation
            if (bf < -1 && key < root.right.data) {
                root.right = rightRotate(root.right);
                return leftRotate(root);
            }

            return root; //Returned if AVL Tree is already Balanced
        }
    }
    public static void main(String[] args) {
        int nodes[] = {40,20,20,10,25,30,22,50};
        Node root = null;
        for(int key: nodes){
            root = AVLTree.buildAVLTree(root, key);
        }

        System.out.println("AVL Tree(Balanced Binary Search Tree): ");
        System.out.println("Level Order Traversal: ");
        AVLTree.levelOrderTraversal(root);
        System.out.println("PreOrder Traversal");
        AVLTree.preOrderTraversal(root);
    }
}
