package Maang_Preparation.Amazon;

class ListNode{
  int val;
  ListNode next;

  ListNode(int val){
    this.val = val;
    this.next = null;
  }
}

public class ReverseLinkedList {

    public ListNode reverseList(ListNode head){
      //We start with three pointer
      ListNode prev = null;
      ListNode next = null;
      ListNode curr = head;

      while(curr != null){
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
      
      }

      return prev;
    }


    public static void main(String[] args) {
      int[] input = {1, 2, 3, 4, 5};
      ListNode head = arratToListNode(input);
      ReverseLinkedList rl = new ReverseLinkedList();
      ListNode reverseHead = rl.reverseList(head);
      System.out.print("Reverse List: ");
      printLinkedList(reverseHead);
      
    }

    private static ListNode arratToListNode(int[] arr){
      if(arr.length == 0) return null;

      ListNode head = new ListNode(arr[0]);
      ListNode curr = head;
      
      for(int i = 1; i<arr.length; i++){
        curr.next = new ListNode(arr[i]);
        curr = curr.next;
      }
      return head;
    }

    public static void printLinkedList(ListNode head){
      ListNode curr = head;
      while(curr != null){
        System.out.print(curr.val + "");
        curr = curr.next;
      }
      System.out.println();

    }
}
