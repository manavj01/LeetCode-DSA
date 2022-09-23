class Solution {

    public String convert(String s, int numRows) {
        StringBuilder[] arr = new StringBuilder[numRows + 1];
        if(numRows == 1 ) return s;
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new StringBuilder();
        }
        int k = 1;
        int cursor = 1; 
      
        for(int i =0 ; i<s.length(); i++){
            arr[k].append(s.charAt(i));
            if(k == numRows) cursor =-1;
            if(k == 1) cursor =1;
            k += cursor;
        }
        
        for(int i=1; i<arr.length; i++){
            arr[0].append(arr[i]);
        }
        return arr[0].toString();
    }
}
