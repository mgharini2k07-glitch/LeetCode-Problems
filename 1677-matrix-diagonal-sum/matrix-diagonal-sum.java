class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int totalSum = 0;
        
        for (int i = 0; i < n; i++) {
            // Add primary diagonal element
            totalSum += mat[i][i];
            
            // Add secondary diagonal element
            totalSum += mat[i][n - 1 - i];
        }
        
        // If n is odd, subtract the central element to avoid double-counting
        if (n % 2 != 0) {
            int center = n / 2;
            totalSum -= mat[center][center];
        }
        
        return totalSum;
    }
}
