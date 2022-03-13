class Solution {
    public int romanToInt(String s) {
      Map<Character, Integer> lookUpMap = new HashMap<Character, Integer>();
    lookUpMap.put('I', 1);
    lookUpMap.put('V',5);        
    lookUpMap.put('X', 10);
    lookUpMap.put('L', 50);
    lookUpMap.put('C',100);
    lookUpMap.put('D', 500);
    lookUpMap.put('M',1000);

    Integer i=0,sum=0;
    int n = s.length();
    while(i<n){
        
        if(i==n-1){
            sum=sum+lookUpMap.get(s.charAt(i));
            break;
        }
       if(lookUpMap.get(s.charAt(i))>=lookUpMap.get(s.charAt(i+1))){
           sum=sum+lookUpMap.get(s.charAt(i));
           i++;
       } else{
           sum = sum+ lookUpMap.get(s.charAt(i+1))-lookUpMap.get(s.charAt(i));
           i=i+2;
       }             
    }
    return sum;   
    }
}