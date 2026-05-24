package BinaryTree.Part1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

public class TopViewOfBinaryTree {
    //Create Node
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

    //Helper Class to Store Node Information and Horizontal Distance.
    static class Info{
        Node node;
        int hD;

        Info(Node node, int hD){
            this.node = node;
            this.hD = hD;
        }
    }

    static class BinaryTree{
        static int idx = -1;
        //Create Binary Tree
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

        //Perfrom Top View of Binary Tree
        public static void topViewOfBinaryTree(Node rootNode){
            if (rootNode == null) {
                return;
            }
            //store unique HorizontalDistance, Node Data
            TreeMap<Integer, Integer> hdPair = new TreeMap<>();

            Queue<Info> q = new LinkedList<>();
            q.add(new Info(rootNode, 0));
            q.add(null);

            while (!q.isEmpty()) {
                Info currInfo = q.remove();
                if (currInfo == null) {
                    if (q.isEmpty()) {
                        break;
                    }
                    else{
                        q.add(null);
                    }
                }
                else{
                    //if HD is not exist in TreeMap then store (HD, node.data)
                    if (!hdPair.containsKey(currInfo.hD)) {
                        hdPair.put(currInfo.hD, currInfo.node.data);
                    }
                    if (currInfo.node.left != null) {
                        q.add(new Info(currInfo.node.left, currInfo.hD-1));
                    }
                    if (currInfo.node.right != null) {
                        q.add(new Info(currInfo.node.right, currInfo.hD+1));
                    }
                }

            }
            
            //Print the all Nodes which are visible from top of Binary Tree.
            for(int hd: hdPair.keySet()){
                System.out.println(hd+" -> "+hdPair.get(hd));
            }
        }
    }
    public static void main(String[] args) {
        int nodes[] = {1,2,-1,5,-1,6,-1,7,-1,-1,3,-1,-1};
        Node rootNode = BinaryTree.buildBinaryTree(nodes);
        System.out.println("Root Node: "+rootNode);

        BinaryTree.topViewOfBinaryTree(rootNode);
    }
}


/*
*Top View Of Binary Tree
*The Top View of Tree is the set of nodes visible when the tree is viewed from the top.

    *                   1(0)
    *                  / \
    *             (-1)2   3(+1)
    *                 \    
    *                  5(0)    
    *                   \
    *                    6(+1)
    *                     \
    *                      7(+2)
    *                      
    *     O/p= {2,1,3,6}
    * 
    * Horizontal Distance:
    * It is value assigned to each node in a binary tree relative to the root.
    * Rules: 
    *   Root Node-> HD = 0
    *   Left Child-> HD = Parent HD - 1
    *   Right Child-> HD = Parent HD + 1
 */