class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        boolean greaterMass = true;
        
        long currMass = mass;

        for(int i = 0; i < asteroids.length; i++){
            if(currMass >= asteroids[i]){
                currMass += asteroids[i];
            } else {
                greaterMass = false;
                break;
            }
        }

        return greaterMass;
    }
}