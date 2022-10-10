class Solution { // 1 4 5 3 2
    public void nextPermutation(int[] A) {
        if(A.length == 1) return ;
        
        int i= A.length-2;
        
        while(i>=0 && A[i] >= A[i+1]) i--;
        
        int  j = A.length-1;
        if(i >= 0){
        while( A[i] >= A[j]) j--;
        swap(A, i, j);
        }
        reverse(A, i+1, A.length-1);
        
    }
    
    public void swap(int[] a , int b , int c ){
        int temp = a[b];
        a[b] = a[c];
        a[c] = temp;
    }
    
    public void reverse(int[] a , int b , int c){
        while(b<=c){
          swap(a,b,c);
            b++;
            c--;
        }
    }
}