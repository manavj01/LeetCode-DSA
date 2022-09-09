class Solution {
    class Pair{
        int power;
        int defense;
        Pair(int power, int defense){
            this.power = power;
            this.defense = defense;
        }
    }
//     public int numberOfWeakCharacters(int[][] prop) {
//         Arrays.sort(prop,(a, b) -> a[0] - b[0] );
//         // for(int[] z : prop){
//         //     System.out.println(Arrays.toString(z));
//         // }
//         int c =0;
//         Stack<Pair> st = new Stack<>();
        
//         for(int[] pair : prop){
            
//             if(!st.isEmpty() && pair[0] > st.peek().power && pair[1] > st.peek().defense){
//                 c++;
//             }
//             if(!st.isEmpty() && (pair[0] <= st.peek().power || pair[1] <= st.peek().defense)){
//                 while(!st.isEmpty() && (pair[0] <= st.peek().power || pair[1] <= st.peek().defense)){
//                     st.pop();
//                 }
//                 if(!st.isEmpty()){
//                     c++;
//                 }
//             }
            
//             st.push(new Pair(pair[0],pair[1]));
//         }
        
        
//         return c;
//     }
      public int numberOfWeakCharacters(int[][] properties) {
         int n = properties.length;
        int count = 0;
        
        Arrays.sort(properties, (a, b) -> (b[0] == a[0]) ? (a[1] - b[1]) : b[0] - a[0]);
        
        int max = 0;
        for (int i = 0; i < n; i++) {
            
            if (properties[i][1] < max) {
                count++;
            }
            max = Math.max(max, properties[i][1]);
        }
        return count;
        }
}