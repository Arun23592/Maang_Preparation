package Maang_Preparation.Amazon.BST;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode{
  int val;
  TreeNode left;
  TreeNode right;

  TreeNode(int val){
    this.val = val;
    // this.left = left;
    // this.right = right;
  }
}

public class MirrorBinaryTree {

  public void mirror(TreeNode root){
    if(root == null){
      return;
    }

    //swap the left to right child node
    TreeNode temp = root.left;
    root.left = root.right;
    root.right = temp;

    mirror(root.left);
    mirror(root.right);



  }

  //inorder to prirnt traverse helper method
  public static void printTree(TreeNode root){
    if(root == null){
      return;
    }

    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);

    while (!queue.isEmpty()) {
      TreeNode current = queue.poll();
      System.out.println(current.val+ " ");
      if (current.left != null) {
            queue.add(current.left);
      }

      if (current.right != null) {
        queue.add(current.right);
      }
      
    }
  }

  public static void main(String[] args) {
    MirrorBinaryTree tree = new MirrorBinaryTree();
    //root = [4,2,7,1,3,6,9]
    TreeNode root = new TreeNode(4);

    root.left = new TreeNode(2);
    root.right = new TreeNode(7);
    root.left.left = new TreeNode(1);
    root.left.right = new TreeNode(3);
    root.right.left = new TreeNode(6);
    root.right.right = new TreeNode(9);
    


    System.out.println("Original Binary Tree: ");
    printTree(root);

    System.out.println();
    tree.mirror(root);

    System.out.println("Mirror image of binary tree: ");
    printTree(root);
  }

}



/*
 * Approach: Binary Tree Recursive approach and depth-first trasversal approach
 * 
 * 
 * Time complexity: O(n) -> We visit each node exactly once, where n is the number of nodes in the binary tree.
 * Space complexity: O(h) -> space complexity is determined by recursive stak, as it goes as deep as the height h of the tree.
 * 
 * Explanation:
 * 1. start from the root node.
 * 2. Recursively process left and right subtrees
 * 3. swap the left and right child nodes
 * 4. continue this procesed until as node have been processed.
 * 
 * Testcase:
 * 1. Normal case:
 * Input: [4, 2, 7, 1, 3, 6, 9]
 * Output: [4, 7, 2, 9, 6, 3, 1]
 * 2. Single Node:
 * Input: [1]
 * Output: [2]
 * 
 * Edge case:
 * 3. Null:
 * input: []
 * ouput: []
 * 
 * Interview Questions:
 * 1. Can you explain the concept of a mirror image of a binary tree?
 * Answer: The mirror image of a binary tree is a tree where the left and right children of all non-leaf nodes are swapped.
 * 2. What is the approach you used to solve the problem of mirroring a binary tree?
 * Answer: The approach involves recursively traversing the tree and swapping the left and right children of each node.
 * 3. What are the time and space complexities of your solution?
 * Answer: The time complexity is O(n) because each node is visited once. The space complexity is O(h), where h is the height of the tree, due to the recursion stack.
 * 
 * 
 */