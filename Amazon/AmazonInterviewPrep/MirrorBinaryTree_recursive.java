package Amazon.AmazonInterviewPrep;



class Node{
  int data;
  Node left, right;

  Node(int data){
    this.data = data;
    left = right = null;
  }
}
public class MirrorBinaryTree_recursive {

  //function to mirror the tree
  public static void mirror(Node root){
    if(root == null){
      return;
    }

    //swap left and right child
    Node temp = root.left;
    root.left = root.right;
    root.right = temp;

    //recruively mirror left and right 
    mirror(root.left);
    mirror(root.right);
  }


  //inorder transversal
  public static void inorder(Node root){
    if(root == null){
      return;
    }

    inorder(root.left);
    System.out.println(root.data + " ");
    inorder(root.right);

  }

    public static void main(String[] args){

      Node root = new Node(1);

      root.left = new Node(2);

      root.right = new Node(3);

      root.left.left = new Node(4);

      root.left.right = new Node(5);

      System.out.println("Before Mirror: ");
      inorder(root);

      mirror(root);

      System.out.println("After mirror: ");
      inorder(root);

    }



}


/***
 * Interview explanation:

“To mirror a binary tree, I recursively swap the left and right child of every node. Since each node is visited once, time complexity is O(n). The recursion stack takes O(h) space, where h is the height of the tree.”



Time Complexity:

O(n)

Because we visit every node once.

Space Complexity:

O(h)

Where h is the height of the tree due to recursion stack.
 */