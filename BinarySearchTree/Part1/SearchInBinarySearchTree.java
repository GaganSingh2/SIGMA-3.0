package BinarySearchTree.Part1;

public class SearchInBinarySearchTree {
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

        //Perform InOrder Traversal on Binary Search Tree
        public static void inOrderTraversal(Node root){
            if (root == null) {
                return;
            }

            inOrderTraversal(root.left);
            System.out.print(root.data+" ");
            inOrderTraversal(root.right);
        }

        //Perform searching in BST using Recursion (PreOrder Traversal)
        public static boolean isFoundInBSTUsingRecursion(Node rootNode, int target){
            if (rootNode == null) {
                return false;
            }

            //if rootdata is equals to the target means target found and return true
            if(rootNode.data == target){
                return true;
            }

            //otherwise if target is less than rootValue then check in leftSUbTree
            if (rootNode.data > target) {
                return isFoundInBSTUsingRecursion(rootNode.left, target);
            }
            //otherwise if target is greater than rootValue then check in rightSUbTree
            else{
                return isFoundInBSTUsingRecursion(rootNode.right, target);
            }
        }

         //Perform searching in BST using Iterative Approach
        public static boolean isFoundInBSTUsingIterativeApproach(Node rootNode, int target){
            if (rootNode == null) {
                return false;
            }

            while (rootNode != null) {

                //target is found in Binary Search Tree
                if (rootNode.data == target) {
                    return true;
                }
                //if target is lessthan rootData then search in LeftSubTree
                else if(rootNode.data > target){
                    rootNode = rootNode.left;
                }
                else{ //if target is greaterthan rootData then search in RightSubTree
                    rootNode = rootNode.right;
                }
            }
            return false; //target is not found in Binary Search Tree
        }
    }

    public static void main(String[] args) {
        int nodes[] = {8,5,3,1,4,6,10,11,14};
        Node rootNode = null;

        for(int val: nodes){
            rootNode = BinarySearchTree.buildBinarySearchTree(rootNode, val);
        }
        BinarySearchTree.inOrderTraversal(rootNode);
        System.out.println();
        int target = 4;

        // boolean isFound = BinarySearchTree.isFoundInBSTUsingIterativeApproach(rootNode, target);
        // System.out.println(target+" is Found: "+isFound);

        boolean isFound = BinarySearchTree.isFoundInBSTUsingRecursion(rootNode, target);
        System.out.println(target+" is Found: "+isFound);
    }

}
