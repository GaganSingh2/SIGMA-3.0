package BinarySearchTree.Part1;

public class DeleteANodeInBinarySearchTree {
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
        public static Node buildBinarySearchTree(Node rootNode, int value){
            if (rootNode == null) {
                rootNode = new Node(value);
                return rootNode;
            }

            if (rootNode.data > value) {
                rootNode.left = buildBinarySearchTree(rootNode.left, value);
            }
            else{
                rootNode.right = buildBinarySearchTree(rootNode.right, value);
            }
            return rootNode;
        }

        public static void inOrderTraversal(Node rootNode){
            if (rootNode == null) {
                return;
            }

            inOrderTraversal(rootNode.left);
            System.out.print(rootNode.data+" ");
            inOrderTraversal(rootNode.right);

        }

        //Helper method to find the Inorder Successor in the Right SubTree for given node.
        public static Node findInorderSuccessor(Node root){
            while (root.left != null) {
                root = root.left;
            }
            return root;
        }

        //Delete the Node using 3 cases
        public static Node delete(Node root, int val){
            if (root == null) {
                return null;
            }

            if(root.data > val){
                root.left = delete(root.left, val);
            }
            else if(root.data < val){
                root.right = delete(root.right, val);
            }
            else{
                //Case 1: Leaf Node (Node has no child)
                if (root.left == null && root.right == null) {
                    return null;
                }

                //Case 2: Node has one child
                if (root.left == null) { //root.left == null && root.right != null
                    return root.right;
                }
                if (root.right == null) {//root.left != null && root.right == null
                    return root.right;
                }

                //Case 3: Node has 2 children
                //Found the Inorder Successor
                Node inorderSuccessor = findInorderSuccessor(root.right);
                //replace the original value with Inorder Successor
                root.data = inorderSuccessor.data;
                //Delete the Inorder Successor node.
                root.right = delete(root.right, inorderSuccessor.data);
            }

            return root;
        }

    }

    public static void main(String[] args) {
        int nodes[] = {8,5,1,3,4,6,10,11,14};
        Node rootNode = null;
        for(int val: nodes){
            rootNode = BinarySearchTree.buildBinarySearchTree(rootNode, val);
        }

        BinarySearchTree.inOrderTraversal(rootNode);
        System.out.println();

        int deleteNode = 8;
        BinarySearchTree.delete(rootNode, deleteNode);
        BinarySearchTree.inOrderTraversal(rootNode);
        
    }
}

/**
 * Delete a Node in Binary Search Tree
 * there are total 3 cases
 * Case 1: No Child (Leaf Node)
 *      1)Delete the node
 *      2)Return null to parent node
 *      
 *            5                         5
             / \        =>              \
            3   7                        7
            Delete 3

    Case 2:Node has One Child
 *      1)Delete the node
 *      2)replace with child node
 *      
 *            5                         5
             / \        =>             / \
            3   7                     2   7
           /
          2                       
            Delete 3


     Case 2:Node has Two Children
 *      1)Find the Inorder Successor 
 *      2)Replace the value with Inorder Successor
 *      3)Delete the node for Inorder Successor
 *      
 *            5                         5
             / \        =>             / \
            3   7                     4   7
           / \                       /
          2   4                     2
            Delete 4

        Inorder Successor: Left Most node in Right SubTree of the given node for delete to find the closest or minimum value.
 */