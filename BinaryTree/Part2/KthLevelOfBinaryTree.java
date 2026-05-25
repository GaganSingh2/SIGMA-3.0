package BinaryTree.Part2;

public class KthLevelOfBinaryTree {
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

        //Print Kth Level of Binary Tree using Recursion TC:O(n).
        public static void kthLevelOfBinaryTree(Node rootNode, int level, int k){
            if(rootNode == null || k<1){
                return;
            }
            if (level == k) {
                System.out.print(rootNode.data+" ");
                return; //so after this we don't want to go to again child node of kth node
            }

            kthLevelOfBinaryTree(rootNode.left, level+1, k);
            kthLevelOfBinaryTree(rootNode.right, level+1, k);

        }
    }
    public static void main(String[] args) {
        int nodes[] = {20,8,5,-1,-1,3,10,-1,-1,14,-1,-1,22,-1,25,-1,-1};
        int k = 3;
        Node rootNode = BinaryTree.buildBinaryTree(nodes);
        System.out.println("Root Node: "+rootNode.data);

        BinaryTree.kthLevelOfBinaryTree(rootNode, 1, k);
    }
}

/*
 *Kth Level Of Binary Tree
 *It means all nodes that are prsent at level k.
 
                        20   <- Level 1
                       / \
                      8   22  <- Level 2
                    / \     \
                   5   3    25 <- Level 3
                      / \
                    10  14     <- Level 4

                    k = 3
                    so Output = {5, 3, 25}

    
 */
