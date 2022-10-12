class Solution {
    public boolean isPalindrome(String s) {
        char[] arr = s.toCharArray();
      
        
        int i=0, j=0;
        while(j <arr.length){
             if(Character.isUpperCase(arr[j])){
                arr[j] = (char)((int)arr[j]+32);
            }
            // if(Character.isDigit(arr[j])) arr[j] = ' ';
            if(Character.isLetter(arr[j]) || Character.isDigit(arr[j])){
                swap(arr,i,j);
                i++;
                j++;
            }else{
                j++;
            }
        }
        j=0;
        i--;
        while(j<i){
            if(arr[i] != arr[j]) return false;
            
            j++;
            i--;
        }
        
//                 System.out.println(i);

//         System.out.println(Arrays.toString(arr));
        return true;
    }
    public void swap(char[] arr , int i , int j){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}