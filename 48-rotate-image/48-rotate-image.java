class Solution {
public  class Pair {
        int x;
        int y;

        Pair() {
        }

        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

   public  void rotate(int[][] matrix) {
        Pair i = new Pair(0, 0);
        Pair j = new Pair(0, matrix.length - 1);
        Pair k = new Pair(matrix.length - 1, matrix.length - 1);
        Pair l = new Pair(matrix.length - 1, 0);
        int n = matrix.length - 1;
        for (int z = 0; z < matrix.length / 2; z++) {
            int idx = 0;
            System.out.println(z + "th iteration");
            Pair id=new Pair(i.x,i.y);
            Pair jd=new Pair(j.x,j.y);
            Pair kd =new Pair(k.x,k.y);
            Pair ld = new Pair(l.x,l.y);
            while (idx < n) {
                int temp = matrix[l.x][l.y];
                matrix[l.x][l.y] = matrix[k.x][k.y];
                matrix[k.x][k.y] = matrix[j.x][j.y];
                matrix[j.x][j.y] = matrix[i.x][i.y];
                matrix[i.x][i.y] = temp;
                l.x--;
                k.y--;
                j.x++;
                i.y++;
                idx++;
            }
            n = n - 2;
            i=id;
            j=jd;
            k=kd;
            l=ld;

            i.x++;
            i.y++;

            j.x++;
            j.y--;

            k.x--;
            k.y--;

            l.x--;
            l.y++;
        }
    }
}