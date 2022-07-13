// aproach 1
public void setZeroes(int[][] matrix) {
ArrayList<Integer> rarr = new ArrayList<>();
ArrayList<Integer> carr = new ArrayList<>();
​
int idx=0;
for(int i =0; i < matrix.length;i++){
for(int j=0; j<matrix[0].length;j++){
if(matrix[i][j] ==0){
rarr.add(i);
carr.add(j);
}
}
}
for(int i=0;i < rarr.size();i++){
int row = rarr.get(i);
int col = carr.get(i);
for(int c =0;c < matrix[0].length;c++){
matrix[row][c]=0;
}
for(int r =0;r < matrix.length;r++){
matrix[r][col]=0;
}