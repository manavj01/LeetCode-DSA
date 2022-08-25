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
          Node temp = head;
        // first round : make copy of each node,
        // and link them together side bt side in a single list.
        while (temp != null) {
            Node node = new Node(temp.val);
            node.next = temp.next;
            temp.next = node;
            temp = temp.next.next;

        }
        temp = head;

        // Second round : assign random pointers for the copy nodes
         while (temp != null) {
            if (temp.random != null) {
                temp.next.random = temp.random.next;
            }
            temp = temp.next.next;
        }


         // Third round : restore the original list, and extract the copy list
        temp = head;
        Node psuedoHead = new Node(0);
        Node copy = psuedoHead;
        Node front = psuedoHead;
        while (temp != null){
            front = temp.next.next;

            // extract the copy
            copy.next = temp.next;
            copy = copy.next;

            //restore the original list
            temp.next = front;
            temp = front;
        }

        return psuedoHead.next;
    }
}