class Solution {
    public  void nextPermutation(int[] A) {
      if (A== null || A.length <=1) return;

        int i = A.length-2;
        while (i >= 0 && A[i]>= A[i+1]) {
            i--;
        }
        if (i>=0){
            int j = A.length-1;
            while (A[j] <= A[i]){
                j--;
            }
            swap(A,i,j);
        }
        reverse(A,i+1,A.length-1);
    }

    public  void reverse(int[] arr, int si, int ei) {
        while (si <= ei) {
            int temp = arr[si];
            arr[si] = arr[ei];
            arr[ei] = temp;
            si++;
            ei--;
        }
    }

    public  void swap(int[] arr, int si, int ei) {
        int temp = arr[si];
        arr[si] = arr[ei];
        arr[ei] = temp;
    }
}