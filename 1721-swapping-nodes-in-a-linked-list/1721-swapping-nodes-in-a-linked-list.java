/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapNodes(ListNode head, int k) {

    if(head == null) {
		return head;
	}
    
    ListNode temp = head;
    ListNode prev = null;
	ListNode firstNode = null;
	ListNode firstNodePrev = null;
	ListNode secondNode = null;
	ListNode secondNodePrev = null;
	
	int n = length(head) - k + 1;    	
	int m = k;
	while(temp != null) {
		if(m-- > 0) {
			firstNodePrev = prev;
			firstNode = temp;
		}
		
		if(n-- > 0) {
			secondNodePrev = prev;
			secondNode = temp;
		}
        prev = temp;
		temp = temp.next;
	}
    
    if(firstNodePrev != null) {
        firstNodePrev.next = secondNode;
    }
    else{
        head = secondNode;
    }
    
    if(secondNodePrev != null) {
        secondNodePrev.next = firstNode;
    }
    else{
        head = firstNode;
    }
    
    ListNode temp1=secondNode.next;
    secondNode.next=firstNode.next;
    firstNode.next=temp1;
    return head;  	
}

public int length(ListNode head) {
    ListNode temp = head;
    int count = 0;
    while (temp != null)
    {
        count++;
        temp = temp.next;
    }
    return count;
}
}