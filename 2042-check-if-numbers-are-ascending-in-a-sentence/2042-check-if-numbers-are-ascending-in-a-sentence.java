class Solution {
    public boolean areNumbersAscending(String s) {
        // Pattern pattern = Pattern.compile("[^0-9]");
        String numberOnly = s.replaceAll("\\D+", " ");
        
        String[] arr =numberOnly.split(" ");
                System.out.println(Arrays.toString(arr));

        for(int i=1; i<arr.length; i++){
           if( arr[i-1] == "") continue;
            int prev = Integer.parseInt(arr[i-1]);
            int curr = Integer.parseInt(arr[i]);

            if(prev >= curr){
                return false;
            }
        }
        System.out.println(Arrays.toString(arr));
        return true;
    }
}