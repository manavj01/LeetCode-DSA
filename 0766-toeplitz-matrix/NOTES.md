int m = matrix[0].length;
int n = matrix.length;
if(m==1 || n == 1) return true;
System.out.println(n);
int[] a = matrix[0];
​
for (int i = 1; i < n; ++i) {
int ptr = 0;
for (int j = i; j < m; ++j) {
if (matrix[i][j] != a[ptr++]) return false;
}
}
int size = 1;
for (int x = n - 1; x > 0; x--) {
int tbc = matrix[x][0];
for (int z = x, y = 0; y < size && y<m ; y++, z++) {
if (matrix[z][y] != tbc) return false;
}
size++;
}
​
return true;