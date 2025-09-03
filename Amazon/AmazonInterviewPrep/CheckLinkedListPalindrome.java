package Amazon.AmazonInterviewPrep;

//.Define listnode
class ListNode{
  int val;
  ListNode next;
  ListNode(int val){
    this.val = val;
  }
}

public class CheckLinkedListPalindrome {

  public static boolean isPalindromeLists(ListNode head){

    //1.Find the middle node
    ListNode slow = head, fast = head;
    while (fast != null && fast.next != null) {
          slow = slow.next;
          fast = fast.next;
    }


     //2. Reverse second half -- helper method
     ListNode secondHalf = reverse(slow);

     //3. compare first half and second half
     ListNode firstHalf = head;
     ListNode copySecondHalf = secondHalf;

     while (secondHalf != null) {
      if (firstHalf.val != secondHalf.val) return false;
          firstHalf = firstHalf.next;
          secondHalf = secondHalf.next;
     }

     //4. return restore list
     return true;

  }

  private static ListNode reverse(ListNode head){
    ListNode prev = null, curr = head;
    while (curr != null) {
      ListNode nexNode = curr.next;
      curr.next = prev;
      prev = curr;
      curr = nexNode;
      
    }
    return prev;
  }
  

  
  public static void main(String[] args) {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(2);
    head.next.next.next = new ListNode(1);

    System.out.println(isPalindromeLists(head));
  }

}


/*
 * 
 * 
 * 🔎 Explanation

Use fast & slow pointers → slow reaches middle.

Reverse the list from the middle.

Compare values one by one.

If all match → Palindrome.

📊 Complexity

Time Complexity: O(n) → Traverse list once + Reverse + Compare.

Space Complexity: O(1) → In-place reversal (most optimal).


📊 Complexity

Time Complexity: O(n) → Traverse list once + Reverse + Compare.

Space Complexity: O(1) → In-place reversal (most optimal).


Interview Follow-ups

Can you solve without modifying the list?

Yes → Use a stack to store first half, then compare with second half.

But it uses O(n) extra space.
 */