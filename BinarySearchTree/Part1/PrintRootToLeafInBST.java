package BinarySearchTree.Part1;

import java.util.ArrayList;
import java.util.List;

public class PrintRootToLeafInBST {
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

    static class BinarySearchTree{
        public static Node buildBinarySearchTree(Node root, int value){
            if (root == null) {
                root = new Node(value);
                return root;
            }

            if (root.data > value) {
                root.left = buildBinarySearchTree(root.left, value);
            }
            else{
                root.right = buildBinarySearchTree(root.right, value);
            }

            return root;
        }

        public static void inOrderTraversal(Node root){
            if (root == null) {
                return;
            }

            inOrderTraversal(root.left);
            System.out.print(root.data+" ");
            inOrderTraversal(root.right);
        }

        //Helper method
        public static void printPath(ArrayList<Integer> path){
            for(int val: path){
                System.out.print(val+"->");
            }
            System.out.println("null");
        }

        //Print the Root to Leaf using ArrayList using 1st Approach-------------
        public static void printRootToLeaf(Node root, ArrayList<Integer> path){
            if (root == null) {
                return;
            }

            //add the current node in the path
            path.add(root.data);

            //if the current node is leaf means print the one path
            if (root.left == null && root.right == null) {
                printPath(path);
            }
            else{
                //otherwise, go to leftSubTree
                printRootToLeaf(root.left, path);
                //go to rightSubTreee
                printRootToLeaf(root.right, path);
            }

            //remove the current node (BackTracking)
            path.remove(path.size()-1);
        }


        //Print the Root to Leaf using 2-D ArrayList using 2nd Approach-----------------
        public static List<List<Integer>> printRootToLeafUsing2_DArrayList(Node root){
            List<List<Integer>> path = new ArrayList<>();
            if (root == null) {
                return path;
            }

            helperMethod(root, new ArrayList<>(), path);

            return path;
        }

        public static void helperMethod(Node root, List<Integer> ans, List<List<Integer>> path){
            if (root == null) {
                return;
            }

            //add the current node in ArrayList
            ans.add(root.data);

            //if the current node is leaf means print the one path
            if (root.left == null && root.right == null) {
                path.add(new ArrayList<>(ans));
            }
            else{
                //Otherwise, go to LeftSubTree
                helperMethod(root.left, ans, path);
                //go to rightSubTree
                helperMethod(root.right, ans, path);
            }

            //remove the current node (BackTracking)
            ans.remove(ans.size()-1);
        }
    }
    public static void main(String[] args) {
        int nodes[] = {8,5,3,6,10,9,11};
        Node root = null;
        for(int val: nodes){
            root = BinarySearchTree.buildBinarySearchTree(root, val);
        }
        BinarySearchTree.inOrderTraversal(root);
        System.out.println();

        // BinarySearchTree.printRootToLeaf(root, new ArrayList<Integer>());

        List<List<Integer>> path = BinarySearchTree.printRootToLeafUsing2_DArrayList(root);
        for(int i=0; i<path.size(); i++){
            for(int j=0; j<path.get(i).size(); j++){
                System.out.print(path.get(i).get(j)+"->");
            }
            System.out.print("null");
            System.out.println();
        }
    }
}
/**
 * Print Root to Leaf Path in Binary Search Tree
 *                              8
 *                             / \
 *                            5   10
 *                          / \   / \
 *                         3   6 9  11
 * 
 *          Output => Print the all Pahts---->
 *                    path-1 {8,5,3}
 *                    path-2 {8,5,6}
 *                    path-3 {8,10,9}
 *                    path-4 {8,10,11}
 * 
 *                   Store the all path in 2-D ArrayList
 *                      [ [8,5,3],[8,5,6],[8,10,9],[8,10,11]]
 *                      
 * 
 */