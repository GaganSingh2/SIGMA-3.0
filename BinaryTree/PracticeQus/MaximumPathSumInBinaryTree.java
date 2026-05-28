package BinaryTree.PracticeQus;

public class MaximumPathSumInBinaryTree {
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

        static int maxSum = Integer.MIN_VALUE;//store the final maximumPath sum
        public static int maximumPathSumInBinaryTree(Node rootNode){
            sum(rootNode);

            return maxSum;
        }

        //Helper method to find the sum of paths
        public static int sum(Node root){
            if (root == null) {
                return 0; 
            }
            
            //Find the leftSubTree sum and ignore the negative value by using max
            int leftSum = Math.max(0, sum(root.left));

            //Find the rightSubTree sum and ignore the negative value by using max
            int rightSum = Math.max(0, sum(root.right));

            int currPath = leftSum + rightSum + root.data;//find the currPath sum
            maxSum = Math.max(currPath, maxSum);//update the main maxSum

            return root.data + Math.max(leftSum, rightSum);//and return sum of rootvalue and greater sum from leftSum or rightSUm
        }
    }
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,6,-1,-1,7,-1,-1};
        Node rootNode = BinaryTree.buildBinaryTree(nodes);
        System.out.println("Root Node: "+rootNode.data);

        int res = BinaryTree.maximumPathSumInBinaryTree(rootNode);
        System.out.println("Maximum Path Sum: "+res);
    }
}

/**
 * Maximum Path Sum 
 *                      1
                       / \
                      2   3
                     / \ / \
                    4  5 6  7

                    output = 18
                    path = {5->2->1->3->7}
 */