package BinaryTree.Part1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

public class BottomViewOfBinaryTree {
    //Create Nodes
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

    //Store the Information of Nodes and Horizontal Distance.
    static class Info{
        Node node;
        int hD; //Horizontal Distance
        Info(Node node, int hD){
            this.node = node;
            this.hD = hD;
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

        //Perform Bottom View of Binary Tree
        public static void bottomViewOfBinaryTree(Node rootNode){
            if (rootNode == null) {
                return;
            }

            //Store Horizontal Distance and Node data
            TreeMap<Integer,Integer> hdPair = new TreeMap<>();

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
                    // Always update the value for that HD.(means if hd not exist in map then store it or if hd exist in map then replace or update the node value of the hd)
                    hdPair.put(currInfo.hD, currInfo.node.data);
                    
                    if (currInfo.node.left != null) {
                        q.add(new Info(currInfo.node.left, currInfo.hD-1));
                    }
                    if (currInfo.node.right != null) {
                        q.add(new Info(currInfo.node.right, currInfo.hD+1));
                    }
                }
            }

            for(int hd: hdPair.keySet()){
                System.out.println(hd+" -> "+hdPair.get(hd));
            }

        }
    }
    public static void main(String[] args) {
        int nodes[] = {20,8,5,-1,-1,3,10,-1,-1,14,-1,-1,22,-1,25,-1,-1};
        Node rootNode = BinaryTree.buildBinaryTree(nodes);
        System.out.println("Root Node: "+rootNode.data);

        BinaryTree.bottomViewOfBinaryTree(rootNode);
    }
}

/*
*Bottom View of Binary Tree
*   The Bottom View is the set of nodes visible when tree is viewed      from the bottom.
                        20(0)
                       / \
                  (-1)8   22(+1)
                    / \     \
               (-2)5   3(0)  25(+2)
                      / \
                 (-1)10  14(+1)

        Output= {5,10,3,14,25}

    For each Horizontal Distance (HD), we keep the last node encountered during level-order traversal.
    Always update the value for that HD.
    This ensures the last (bottom-most) node remains in the map.
 */
