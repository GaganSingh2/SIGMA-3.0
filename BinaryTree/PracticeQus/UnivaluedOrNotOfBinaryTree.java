package BinaryTree.PracticeQus;

public class UnivaluedOrNotOfBinaryTree {
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

        //Helper Method
        public static boolean check(Node rootNode, int currData){
            if (rootNode == null) {
                return true;
            }
            if (rootNode.data != currData) {//if rootValue and currValue is not match means it is not a Univalued, so return false
                return false;
            }

            boolean isLeft = check(rootNode.left, currData);//check in leftSubtree
            boolean isRight = check(rootNode.right, currData);//Check in right SubTree

            return isLeft && isRight;//if both return true then means our Binary Tree is Univalued Binary Tree
        }

        //Perform the Univalued Binary Tree.
        public static boolean isUnivaluedBinaryTree(Node rootNode){
            return check(rootNode, rootNode.data);
        }
        
    }
    public static void main(String[] args) {
        int nodes[] = {1,1,1,-1,-1,1,-1,-1,2,-1,-1};
        Node rootNode = BinaryTree.buildBinaryTree(nodes);
        System.out.println("Root Node: "+rootNode.data);

        boolean res = BinaryTree.isUnivaluedBinaryTree(rootNode);
        System.out.println("Binary Tree is Univalued: "+res);
    }
}

/**
 * Univalued Binary Tree
 * A binary tree is called Univalued if all nodes contain the same value.
 *                  1
                   / \
                  1   1    output = true
                 / \
                1   1

                

                  1
                 / \
                1   1    output = false
               / \
              2   1
 */
