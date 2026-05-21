package BinaryTree.Part1;

public class SubTreeOfAnotherTree {
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


        public static boolean isIdentical(Node rootNode, Node subRootNode){
            if (rootNode == null && subRootNode == null) {
                return true;
            }
            else if((rootNode == null || subRootNode == null) || (rootNode.data != subRootNode.data)){
                return false;
            }

            //if leftSubtree is not identical
            if (!isIdentical(rootNode.left, subRootNode.left)) {
                return false;
            }
            //if rightSubtree is not identical
            if (!isIdentical(rootNode.right, subRootNode.right)) {
                return false;
            }

            return true;
        }
        public static boolean isSubTree(Node rootNode, Node subRootNode){
            if (rootNode == null) {
                return false;
            }

            //if both data are same then check the identical or not
            if (rootNode.data == subRootNode.data) {
                if (isIdentical(rootNode, subRootNode)) {
                    return true;
                }
            }

            //if both data are not same then call this one to check in left subtree for find the root node
            boolean isLeftIdentical = isSubTree(rootNode.left, subRootNode);

            //if both data are not same then call this one to check in right subtree for find the root node
            boolean isRightIdentical = isSubTree(rootNode.right, subRootNode);

            return isLeftIdentical || isRightIdentical;
        }
    }

    public static void main(String[] args) {
        int nodesTree[] = {1,2,4,-1,-1,5,-1,-1,3,6,-1,-1,7,-1,-1};
        BinaryTree.idx = -1; //Reset it
        Node rootNode = BinaryTree.buildBinaryTree(nodesTree);
        System.out.println("Root Node(Tree): "+rootNode.data);

        int nodesSubTree[] = {2,4,-1,-1,5,-1,-1};
        BinaryTree.idx = -1; //Reset it
        Node subRootNode = BinaryTree.buildBinaryTree(nodesSubTree);
        System.out.println("Root Node(SubTree): "+subRootNode.data);

        boolean res = BinaryTree.isSubTree(rootNode, subRootNode);
        System.out.println("Sub Tree of Another Tree: "+res);
    }
}
