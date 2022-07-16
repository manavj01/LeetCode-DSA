// aproach 1
public void sortColors(int[] arr) {
int red0 =0;
int white1=0;
int blue2 = 0;
for(int i =0; i < arr.length; i++ ){
if(arr[i] == 0){
red0++;
}else if(arr[i] == 1){
white1++;
}else if(arr[i] == 2){
blue2++;
}
}
int idx=0;
while(red0 != 0){
arr[idx++] = 0;
red0--;
}
while(white1 != 0){
arr[idx++] = 1;
white1--;
}
while(blue2 != 0){
arr[idx++] = 2;
blue2--;
}
}
// aproach 2
public  void sortColors(int[] arr) {
int low = 0;
int mid = 0;
int high = arr.length - 1;