class Solution {
    public boolean isPalindrome(int x) {
        StringBuilder sb = new StringBuilder();
        sb.append(x);
        boolean abba = false;
        if(sb.length()==1){
            return true;
        }
        if(x<0){
            return false;
        }
        int i=0;
        int j=sb.length()-1;
        while (i<j){
            if(sb.charAt(i)==sb.charAt(j)){
                abba = true;
            }else{
                abba = false;
                break;
            }
            i++;
            j--;
        }

        return abba;
        
    }
}