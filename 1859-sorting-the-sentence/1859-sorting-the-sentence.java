class Solution {
    public String sortSentence(String s) {
        String[] arr = new String[10];
        int j=0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch >= 48 && ch <=57){
                String str = s.substring(j,i);
                j=i+2;
                arr[ch-'0'] = str;
            }else{
                continue;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(String st : arr){
            if(st != null)sb.append(st+" ");
        }
        // System.out.println(Arrays.toString(arr));
        
        return sb.toString().trim();
    }
}