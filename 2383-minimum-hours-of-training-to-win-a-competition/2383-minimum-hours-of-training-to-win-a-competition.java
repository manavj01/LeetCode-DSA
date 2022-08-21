class Solution {
    public int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        int trainingHours =0;
        int n = energy.length;
        
        for(int i=0 ; i<n ; i++ ){
            if(initialEnergy <= energy[i]){
                int difference = energy[i]-initialEnergy+1;
                trainingHours += difference;
                initialEnergy += difference;
            }
            if(initialExperience <= experience[i]){
                int difference = experience[i] - initialExperience+1;
                trainingHours += difference;
                initialExperience += difference;
            }
            initialEnergy -= energy[i];
            initialExperience += experience[i];
        }
        
        return trainingHours;
    }
}