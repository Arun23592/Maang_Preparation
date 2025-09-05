package Amazon.AmazonInterviewPrep;


import java.util.LinkedList;
import java.util.Queue;

//Definition of binary tree Nde
class TreeNode{

  int val;
  TreeNode left;
  TreeNode right;
  TreeNode(int x){
    val = x;
  }

}


public class MirrorBinaryTree {


  //recursive in-place of mirror 
  public static TreeNode mirrorBTree(TreeNode root){
    // Base case: if tree is empty, return null
    if(root == null) 
      return null;

      // Recursively mirror the left and right subtrees
     TreeNode left = mirrorBTree(root.left);
     TreeNode right = mirrorBTree(root.right);

     //swap child nodes
     root.left = right;
     root.right = left;

     // Recursively mirror the left and right subtrees
     return root;

  }

  //Helper to print the level order
  public static void printLevelOrder(TreeNode root){
    if(root == null){
      System.out.println("[]");
      return;
    }

    Queue<TreeNode> q = new LinkedList<>();
    q.add(root);

    while (!q.isEmpty()) {
      int size = q.size(); // process one level at a time
      for(int i=0; i<size; i++){
        TreeNode n = q.poll();
        System.out.print(n.val + " "); // process one level at a time

        // Add left and right children to queue if they exist
        if (n.left != null) q.add(n.left);
        if (n.right != null) q.add(n.right);

      }
      System.out.println(); // move to next line after finishing a level
        
    }
    
    
  }


  public static void main(String[] args) {

        // Build tree:
        //     1
        //    / \
        //   2   3
        //  / \
        // 4   5

    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.left.left = new TreeNode(4);
    root.left.right = new TreeNode(5);

    System.out.println("Before mirror: ");
    printLevelOrder(root);
    
    mirrorBTree(root);

    System.out.println("After mirror: ");
    printLevelOrder(root);
    // After mirror the tree becomes:
        //     1
        //    / \
        //   3   2
        //      / \
        //     5   4


  }




}


/*
 * 
 * Mirror a Binary Tree: Given the root node of a binary tree T, modify that tree in place, transform it into the mirror image of the initial tree T.
 * 
 * Problem: Given the root of a binary tree T, transform the tree in place so it becomes the mirror image of the original tree (left and right children swapped for every node).
 * 
 * 
 * Intuition (why it works)

For every node you just need to:

Swap its left and right child pointers.

Make sure its subtrees are also mirrored.

Doing this for every node results in the whole tree being mirrored. You can do this recursively (mirror children then swap) or iteratively (visit each node and swap children).

Optimal approach (recursive) — easiest to explain in interviews
Step-by-step

If current node is null return null.

Recursively mirror the left subtree.

Recursively mirror the right subtree.

Swap the node's left and right pointers.

Return the node.

This is clear, short, and shows understanding of recursion and tree traversal.


Complexity

Time complexity: O(n) where n is number of nodes — each node is visited exactly once.

Space complexity:

Recursive: O(h) recursion stack, where h is tree height. Worst-case (skewed) h = n. Best-case (balanced) h = log n.

Edge cases & notes

root == null → nothing to do (return null).

One node → no change.

Very deep tree (height ~ n): recursion may cause stack overflow in some languages/environments — use iterative approach if depth is large.

In-place vs new copy:

In-place modifies existing nodes (as required).

If you must keep the original, create a new mirrored tree by building new nodes (costs O(n) extra memory).

Works fine with duplicate values — mirror operation only swaps pointers.


Which solution to present in interviews?

Present the recursive solution: it's simple to state, easy to code, and quick to reason about (use induction). Mention the recursion-space caveat and offer the iterative BFS/stack alternative if the interviewer asks about deep trees or stack overflow.

Iterative approach (BFS or DFS) — alternative 
Breadth-First Search
 * 
 */