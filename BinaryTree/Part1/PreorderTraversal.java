package BinaryTree.Part1;

public class PreorderTraversal {
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
        public static Node buildTree(int nodes[]){
            idx++;
            if (nodes[idx]==-1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        //Preorder Traversal(RootNode -> LeftSubTree -> RightSubTree)
        public static void preorderTraversal(Node rootNode){
            if (rootNode == null) {
                System.out.print("-1 ");
                return;
            }

            System.out.print(rootNode.data+" ");
            preorderTraversal(rootNode.left);
            preorderTraversal(rootNode.right);
        }
    }

    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node rootNode = tree.buildTree(nodes);
        System.out.println("RootNode: "+rootNode.data);

        tree.preorderTraversal(rootNode);
    }
}
