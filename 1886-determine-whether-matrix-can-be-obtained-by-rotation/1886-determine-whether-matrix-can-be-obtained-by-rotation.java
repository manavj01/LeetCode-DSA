class Solution {
   public  boolean findRotation(int[][] mat, int[][] target) {

        for (int i = 0; i < 4; i++) {
            if (Arrays.deepEquals(mat, target)) {
                return true;
            }
            rotate(mat);
        }
        return false;
    }

    public static void rotate(int[][] mat) {

        int s = 0, e = mat.length - 1;
        // reversing the array
        while (s < e) {
            int[] temp = mat[s];
            mat[s] = mat[e];
            mat[e] = temp;
            s++;
            e--;
        }
        // transpose of array
        for (int i = 0; i < mat.length; i++) {
            for (int j = i + 1; j < mat[0].length; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
    }
}