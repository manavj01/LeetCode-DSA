class Solution {
    public int dayOfYear(String date) {
        int[] months = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        String[] str = date.split("-");
        int year = Integer.parseInt(str[0]);
        int month = Integer.parseInt(str[1]);
        int d = Integer.parseInt(str[2]);
        // int d = 0;
        if(((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0)){
           if(month >2 )  d++;
        }
        System.out.println(d);
        for(int i=1; i<month; i++){
            d += months[i];
        }
        
        return d;
        
    }
}