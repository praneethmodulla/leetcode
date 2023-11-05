class Solution {
    public int getWinner(int[] arr, int k) {
        int winner = arr[0];
        int count = k;
        int i = 1;
        while(count > 0){
            if(winner > arr[i]){
                i++;
                count--;
            } else {
                count = k;
                count--;
                winner = arr[i];
                i++;
            }

            if(i == arr.length){
                break;
            }
        }

        return winner;
    }
}