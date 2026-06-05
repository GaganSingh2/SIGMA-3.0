package BinarySearchTree.Part1;

public class BuildBinarySearchTree {
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
        public static Node buildBinarySearchTreee(Node root, int value){
            //if root is null then we assign the first value as rootNode
            if (root == null) { 
                root = new Node(value);
                return root;
            }

            //if rootData is greater-than currValue then we go to leftSubTree
            if (root.data > value) {
                root.left = buildBinarySearchTreee(root.left, value);
            }
            //if rootData is lesser-than currValue then we go to rightSubTree
            else{
                root.right = buildBinarySearchTreee(root.right, value);
            }

            return root;//then return root value for next comparing
        }

        public static void inOrderTraversal(Node rootNode){
            if (rootNode == null) {
                return;
            }

            inOrderTraversal(rootNode.left);
            System.out.print(rootNode.data+" ");
            inOrderTraversal(rootNode.right);
        }
    }

    public static void main(String[] args) {
        int nodes[] = {5,1,3,4,2,7,6,8,12,15,16};
        Node rootNode = null;
        //Node rootNode = new Node(nodes[0]);

        for(int val: nodes){
            rootNode = BinarySearchTree.buildBinarySearchTreee(rootNode, val);
        }

        BinarySearchTree.inOrderTraversal(rootNode);
    }
}
