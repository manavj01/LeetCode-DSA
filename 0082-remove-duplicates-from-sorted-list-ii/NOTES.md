if(head == null) return head;
ArrayDeque<ListNode> que = new ArrayDeque<>();
que.addLast(head);
ListNode temp = head.next;
while(temp != null){
if(temp.val == que.getLast().val ){
while(temp != null && temp.val ==que.getLast().val ){
temp = temp.next;
}
que.removeLast();
}
if(temp != null){
que.addLast(temp);
temp = temp.next;
}
}
if(que.isEmpty()){
return null;
} else  que.getLast().next = null;
​
head = que.removeFirst();
temp = head;
​
while(!que.isEmpty()){
temp.next = que.pollFirst();
temp = temp.next;
}
return head;