class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
          for (int i = arr.length - 1; i >= 0; i--) {
            if (target >= arr[i][0]) {
                for (int j = 0; j < arr[0].length; j++) {
                    if (target == arr[i][j]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}