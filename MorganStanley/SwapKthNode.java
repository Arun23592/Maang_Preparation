package MorganStanley;

class Node{
    int data;
    Node next;
    Node(int d){
        data = d;
        next = null;
    }
}

public class SwapKthNode {

    public Node swapNodeK(Node head, int k){

    if(head == null) return head;

    //1. Count nodes

     int n= 0;
     Node temp = head;
     while (temp != null) {
        n++;
        temp = temp.next;
     }

     //2. Invalid
     if(k > n) return head;

     //3. same node no swap
     if (2 * k -1 == n) return head;

     //find kth node from start and its previous
     Node x_prev = null, x = head;
     for(int i=1; i<k; i++){
        x_prev = x;
        x = x.next;
     }

     //find kth node from end and its prev
     Node y_prev = null, y = head;

     for(int i=1; i<n - k + 1; i++){
        y_prev = y;
        y = y.next;
     }


     //if x_prev exists, link to y
     if(x_prev != null)
        x_prev.next = y;
     else
        head = y;

     //if y_prev exists, link to x
     if(y+prev != null)
        y_prev.next = x;
     else
        head = x;

     // swap the next pointers
     Node tempNext = x.next;
     x.next = y.next;
     y.next = tempNext;

     return head;
    }

    //utility to print list
    public void printList(Node head){
        Node temp = head;

        while (temp != null) {
            System.out.println(temp.data);
            if (temp.next != null) 
                System.out.println("-->");
                temp = temp.next;

        }

        System.out.println();
    }



    public static void main(String[] args) {
        SwapKthNode sol = new SwapKthNode();

        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next = new Node(4);
        head1.next.next.next = new Node(5);

        System.out.println("original list");
        sol.printList(head1);
        head1 = sol.swapNodeK(head1, 1);
        System.out.println("After swapping kth node");
        sol.printList(head1);
        System.out.println("true");
    }

}
