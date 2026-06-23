package BinarySearchTree.Part2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class MergeTwoBinarySearchTreeIntoNewBinarySearchTreeUsingInorderTraversalAndArrayList {
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

        private static void inOrderTraversal(Node root, ArrayList<Integer> path){
            if (root == null) {
                return;
            }

            inOrderTraversal(root.left, path);
            path.add(root.data);
            inOrderTraversal(root.right, path);

        }

        private static Node convertSortedArrayListToBST(ArrayList<Integer> merged, int si, int ei){
            if (si > ei) {
                return null;
            }

            int mid = si + (ei - si)/2;
            Node root = new Node(merged.get(mid));
            root.left = convertSortedArrayListToBST(merged, si, mid-1);
            root.right = convertSortedArrayListToBST(merged, mid+1, ei);

            return root;
        }

        public static Node mergeTwoBST(Node root1, Node root2){
            if (root1 == null && root2 == null) {
                return null;
            }
            else if (root1 != null && root2 == null) {
                return root1;
            }
            else if (root1 == null && root2 != null) {
                return root2;
            }

            ArrayList<Integer> path1 = new ArrayList<>();
            ArrayList<Integer> path2 = new ArrayList<>();

            inOrderTraversal(root1, path1);
            inOrderTraversal(root2, path2);

            ArrayList<Integer> merged = new ArrayList<>();
            
            int i = 0, j = 0;
            while (i < path1.size() && j < path2.size()) {
                if(path1.get(i) < path2.get(j)){
                    merged.add(path1.get(i));
                    i++;
                }
                else{
                    merged.add(path2.get(j));
                    j++;
                }
            }

            while (i<path1.size()) {
                merged.add(path1.get(i));
                i++;
            }

            while (j<path2.size()) {
                merged.add(path2.get(j));
                j++;
            }

            int si = 0, ei = merged.size()-1;
            Node newRoot = convertSortedArrayListToBST(merged, si, ei);

            return newRoot;
        }
    }

    public static void main(String[] args) {
        int bst1[] = {2,1,4};
        int bst2[] = {9,3,12};

        Node root1 = null;
        for(int val: bst1){
            root1 = BinarySearchTree.buildBinarySearchTree(root1, val);
        }
        System.out.println("Root1: "+root1.data);

        Node root2 = null;
        for(int val: bst2){
            root2 = BinarySearchTree.buildBinarySearchTree(root2, val);
        }
        System.out.println("Root2: "+root2.data);

        System.out.println("BST-1");
        BinarySearchTree.levelOrderTraversal(root1);
        System.out.println("BST-2");
        BinarySearchTree.levelOrderTraversal(root2);

        Node newRoot = BinarySearchTree.mergeTwoBST(root1, root2);
        System.out.println("New Merge Root: "+newRoot.data);
        BinarySearchTree.levelOrderTraversal(newRoot);
    }
}
/**
 * Merge Two Binary Search Tree into One Binary Search Tree
 *              
 *              BST-1                   BST-2
 *                  2                       9
 *                 / \                     / \
 *                1   4                   3   12
 * 
 *          Expected Output=>
 *                             3
 *                            / \          
 *                           1   9
 *                           \   / \
 *                           2  4   12
 * 
 * Approach 1 (using InOrder Traversal and Convert Sorted Array to BST)
 * 1)if both root is null then return null.
 * 2)if (root1 != null && root2 == null) return root1 || (root1 == null && root2 != null) return root2
 * 3)Create 2 ArrayList and perform InOrder Traversal on one by one BST and store nodes in ArrayList in sorted form
 *           {BST-1 ---> ArrayList-1 && BST-2 ---> ArrayList-2}
 * 4)Create one final ArrayList and store both Array1 and Array2 in this finalArrayList in sorted form.
 *          ArrayList-3 = {ArrayList-1 + ArrayList-2}
 * 
 * 5) Convert the soted ArrayList to the Binary Search Tree.
 *      a)find the mid element and make the rootNode
 *      b)then divide the Array into 2 subArray based on mid
 *            i)LeftSubArray ----> LeftSubTree
 *            ii)RightSubArray ----> RightSubTree
 *      c)Then connect the leftSubTree and rightSubTree to RootNode 
 *      d)Repeat the step (a) to (c) until the Array is not empty.
 */