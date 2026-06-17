package BinarySearchTree.Part2;

import java.util.LinkedList;
import java.util.Queue;

public class ConvertSortedArrayToBalancedBinarySearchTree {
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
        public static void preOrderTraversal(Node root){
            if (root == null) {
                return;
            }

            System.out.print(root.data+" ");
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }


        //Helper method to Create Binary Search Tree
        public static Node createBST(int arr[], int si, int ei){
            if (si>ei) {
                return null;
            }

            int mid = si + (ei - si)/2;
            Node root = new Node(arr[mid]);
            
            root.left = createBST(arr, si, mid-1);
            root.right = createBST(arr, mid+1, ei);

            return root;
        }

        //Convert the sorted Array To BST
        public static Node convertSortedArrayToBST(int arr[]){
            if (arr.length == 1) {
                return new Node(arr[0]);
            }
            int si = 0, ei = arr.length-1;
            return createBST(arr,si, ei);
        }
    }
    public static void main(String[] args) {
        int nodes[] = {3,5,6,8,10,11,12};
        Node root = BinarySearchTree.convertSortedArrayToBST(nodes);
        // BinarySearchTree.levelOrderTraversal(root);
        BinarySearchTree.preOrderTraversal(root);
    }
}
