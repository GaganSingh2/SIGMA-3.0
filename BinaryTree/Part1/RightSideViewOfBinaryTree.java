package BinaryTree.Part1;

import java.util.LinkedList;
import java.util.Queue;

public class RightSideViewOfBinaryTree {
  static class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
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

    //Perform the Right Side View of Binary Tree By using Level Order Traversal.
    public static void rightSideViewOfBinaryTree(Node rootNode){
      if (rootNode == null) {
        return;
      }

      Queue<Node> q = new LinkedList<>();
      q.add(rootNode);
      q.add(null);
      int currData = -1;
      while (!q.isEmpty()) {
        Node currNode = q.remove();
        if (currNode == null) {
          if (q.isEmpty()) {
            System.out.print(currData+" ");//before exiting from this method print the last node of last level in Binary Tree
            return;
          }
          else{
            System.out.print(currData+" ");//print last node of the each level
            q.add(null);
          }
        }
        else{
          currData = currNode.data; //store the node value temporalraly for future use
          if (currNode.left != null) {
            q.add(currNode.left);
          }
          if (currNode.right != null) {
            q.add(currNode.right);
          }
        }
      }
    }
  }

  public static void main(String[] args) {
      int nodes[] = {20,8,5,-1,-1,3,-1,-1,22,-1,25,10,-1,-1,14,-1,-1};
      Node rootNode = BinaryTree.buildBinaryTree(nodes);
      System.out.println("Root Node: "+rootNode.data);

      BinaryTree.rightSideViewOfBinaryTree(rootNode);
  }
}

/**
 * Right Side View of Binary Tree
 * The Right Side View contains the nodes visible when the tree is viewed from
 * the right side.
 * For each level, only the rightmost node is visible. last node store of each
 * level by using level order traversal.
 * 
 *                20 <- Level 1
 *               / \
 *              8  22 <- Level 2
 *             / \  \
 *            5  3  25 <- Level 3
 *                  / \
 *                 10 14 <- Level 4
 * 
 * output = {20, 22, 25,14} last node of each level
 */