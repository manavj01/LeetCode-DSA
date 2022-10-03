class Solution {
    public boolean equalFrequency(String word) {
        if(word.length() <=3) return true;
        int[] fMap = new int[26];
        
        for(int i=0; i<word.length(); i++){
         fMap[word.charAt(i)-'a']++;
        }
     
        Arrays.sort(fMap);
        if(fMap[24] ==0 ) return true;
       
        boolean check = false;
       
        for(int i =0; i<=25; i++){
            if(fMap[i] == 0) continue;
            fMap[i]--;
            System.out.println(Arrays.toString(fMap));

            for(int j=0; j<25; j++){
                if(fMap[j] == 0) continue;
                
                if(fMap[j] == fMap[j+1]){
                    check = true;
                }else{
                    check = false;
                    break;
                }
            }
            if(check) return true;
            fMap[i]++;
        }
        
        
        
        
        return check;
        
    }
}