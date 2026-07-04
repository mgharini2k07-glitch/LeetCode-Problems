class Solution {
    public int maximumWealth(int[][] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum = sum + arr[i][j];
            }
            // Logic change: update max if the current sum is larger
            if (sum > max) { 
                max = sum;
            }
        }
        return max;
    }
}
