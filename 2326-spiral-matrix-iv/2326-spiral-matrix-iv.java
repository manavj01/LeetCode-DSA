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
    public int[][] spiralMatrix(int n, int m, ListNode head) {
        ListNode temp = head;
       
        int[][] ans = new int[n][m]; 
        for(int[] a : ans) Arrays.fill(a,-1);
        
       int rmin = 0 ,rmax = n-1, cmin =0, cmax = m-1;
        
        while(temp != null){
        
            
            for(int j =cmin ; j <= cmax; j++ ){
                if(temp == null) return ans;
                ans[rmin][j] = temp.val; 
                temp = temp.next;
            }
            rmin++;
            
            for(int i= rmin; i <= rmax ; i++ ){
                if(temp == null) return ans;
                ans[i][cmax] = temp.val;
                temp = temp.next;
            }
            cmax--;
            
            for(int j=cmax; j>=cmin ; j--){
                if(temp == null) return ans;
                ans[rmax][j] = temp.val;
                temp = temp.next;
            }
            rmax--;
            
            for(int i = rmax; i>= rmin;i--){
                if(temp == null) return ans;
                ans[i][cmin] = temp.val;
                temp = temp.next;
            }
            cmin++;
            
        }
        
        return ans;
    }
}