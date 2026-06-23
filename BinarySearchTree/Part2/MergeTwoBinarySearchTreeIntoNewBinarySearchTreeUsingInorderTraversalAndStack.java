package BinarySearchTree.Part2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MergeTwoBinarySearchTreeIntoNewBinarySearchTreeUsingInorderTraversalAndStack {
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
        public static Node buildBinarySearchTree(Node root, int val){
            if(root == null){
                root = new Node(val);
                return root;
            }

            if (root.data > val) {
                root.left = buildBinarySearchTree(root.left, val);
            }
            else{
                root.right = buildBinarySearchTree(root.right, val);
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

        private static Node convertSortedListToBST(ArrayList<Integer> mergeList, int si, int ei){
            if (si > ei) {
                return null;
            }
            int mid = si + (ei - si)/2;
            Node root = new Node(mergeList.get(mid));
            root.left = convertSortedListToBST(mergeList, si, mid-1);
            root.right = convertSortedListToBST(mergeList, mid+1, ei);

            return root;

        }

        // public static ArrayList<Integer> mergeTwoBSTIntoSingleBST(Node root1, Node root2)
        public static Node mergeTwoBSTIntoSingleBST(Node root1, Node root2){
            if (root1 == null && root2 == null) {
                return null;
            }
            else if(root1 != null && root2 == null){
                return root1;
            }
            else if (root1 == null && root2 != null) {
                return root2;
            }

            ArrayList<Integer> mergeList = new ArrayList<>();

            //Create 2 Stack
            Stack<Node> stk1 = new Stack<>();
            Stack<Node> stk2 = new Stack<>();

            while (root1 != null || root2 != null || !stk1.isEmpty() || !stk2.isEmpty()) {

                //Push Left Boundary of BST1 in Stack1
                while (root1 != null) {
                    stk1.push(root1);
                    root1 = root1.left;
                }

                //Push Left Boundary of BST2 in Stack2
                while (root2 != null) {
                    stk2.push(root2);
                    root2 = root2.left;
                }

                //Compare top Element of Both Stack
                if (stk2.isEmpty() || (!stk1.isEmpty() && stk1.peek().data <= stk2.peek().data)) {
                    //remove the smaller element of stk1
                    root1 = stk1.pop();
                    //add in the final List
                    mergeList.add(root1.data);
                    //move to the Right SubTree of currRoot in BST1
                    root1 = root1.right;
                }
                else{
                    //remove the smaller element of stk2
                    root2 = stk2.pop();
                    //add in the final list
                    mergeList.add(root2.data);
                    //move to the Right SubTree of currRoot in BST2
                    root2 = root2.right;
                }
            }

            //if the return type is ArrayList then directly return the mergeList
            // return mergeList;

            //and if the return type is RootNode of new build BST then convert the mergeList to BST and return the rootNode
            int si = 0, ei = mergeList.size()-1;
            Node newRootNode = convertSortedListToBST(mergeList, si, ei);
            return newRootNode;

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

        Node newRootNode = BinarySearchTree.mergeTwoBSTIntoSingleBST(root1, root2);
        System.out.println("New RootNode: "+newRootNode.data);
        System.out.println("New BST");
        BinarySearchTree.levelOrderTraversal(newRootNode);
    }
}
//if the return type is ArrayList<>
//TC: O(n + m)
//SC: O(h1 + h2)
//where h1 = height of BST1
//and h2 = height of BST2

//if the return type is new BST
//TC: O(n + m)
//SC: O(n + m)
//where n = nodes in BST1
//and m = nodes in BST2