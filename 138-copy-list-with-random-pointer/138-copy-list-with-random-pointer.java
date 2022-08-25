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
       

        while (trav != null){
            temp.next = new Node(trav.val);
            temp = temp.next;
            trav = trav.next;
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
//     if (head == null) return null;
  
//   Map<Node, Node> map = new HashMap<>();
  
//   // loop 1. copy all the nodes
//   Node node = head;
//   while (node != null) {
//     map.put(node, new Node(node.val));
//     node = node.next;
//   }
  
//   // loop 2. assign next and random pointers
//   node = head;
//   while (node != null) {
//     map.get(node).next = map.get(node.next);
//     map.get(node).random = map.get(node.random);
//     node = node.next;
//   }
  
//   return map.get(head);
    }
}