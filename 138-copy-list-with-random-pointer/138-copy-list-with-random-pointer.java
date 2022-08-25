/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
      
        Node trav = head;
        Node dummy = new Node(0);
        Node temp = dummy;
        int size =-1;

        while (trav != null){
            temp.next = new Node(trav.val);
            temp = temp.next;
            trav = trav.next;
            size++;
           
        }
        trav = head;
        temp = dummy.next;
        while (trav != null){
            Node randPtr = trav.random;
            if (randPtr == null){
                temp.random = null;
                temp = temp.next;
                trav = trav.next;
                continue;
            }
            Node l2Trav = dummy.next;
            Node l1Trav = head;
            while (l1Trav != randPtr){
                l2Trav = l2Trav.next;
                l1Trav = l1Trav.next;
            }
            temp.random = l2Trav;
            trav = trav.next;
            temp = temp.next;
        }
        

        return dummy.next;
    }
}