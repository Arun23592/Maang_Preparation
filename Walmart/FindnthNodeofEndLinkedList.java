package Walmart;



class ListNode{
  int val;
  ListNode next;
  ListNode(int val){
    this.val = val;
  }
}

public class FindnthNodeofEndLinkedList {

    public ListNode findnthFromEnd(ListNode head, int n){
      ListNode fast = head;
      ListNode slow = head;

      for(int i=0; i<n; i++){
        if(fast == null) return null;
        fast = fast.next;

      }

      while (fast != null) {
          fast = fast.next;
          slow = slow.next;
      }

      return slow;
    }


  public static void main(String[] args) {
    FindnthNodeofEndLinkedList list = new FindnthNodeofEndLinkedList();
    int n = 3;
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(5);

    ListNode nthNode = list.findnthFromEnd(head, n);
    if (nthNode != null) {
        System.out.println("The " + n + "th node from the end is: "+ nthNode.val);
    }else{
      System.out.println("The list is shorter than "+ n + " nodes.");
    }
    
  }

}


/*
 * // List: 1 -> 2 -> 3 -> 4 -> 5
// n = 2
// Expected Output: The 2nd node from the end is: 4
 * 
 * Approach: Two pointers technique, often referred to as the "fast and slow pointer" approach
 * This method ensures that you traverse the list only once, achieving an O(n) time complexity.
 * 
 * Space complexity: O(1), as we only use a constant amount of extra space.
 * 
 * Step by step:
 * 1. Initialize two pointers, fast and slow
 * 2. Advance fast pointer
 * 3. move both pointers
 * 4. Return result
 * 
 * Edge case:
 * 1. Empty list
 * 2. n larger than list length
 * 3. Single Element List
 * 
 * 
 * Interview Questions:
 * 1. Write a function to find the middle node of a linked list using the two-pointer technique.
 * 2. Modify the function to return the nth node from the end and remove it from the list.
 * 
 * 
 * 
 */