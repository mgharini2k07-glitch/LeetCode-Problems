import java.util.Scanner;
public class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        int[] counts = new int[n + 1]; 
        
        int left = 0;
        int maxFruits = 0;
        int uniqueFruits = 0;
        for (int right = 0; right < n; right++) {
            if (counts[fruits[right]] == 0) {
                uniqueFruits++;
            }
            counts[fruits[right]]++;
            while (uniqueFruits > 2) {
                counts[fruits[left]]--;
                if (counts[fruits[left]] == 0) {
                    uniqueFruits--;
                }
                left++;
            }
            maxFruits = Math.max(maxFruits, right - left + 1);
        }
        
        return maxFruits;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of trees: ");
        int n = scanner.nextInt();
        
        int[] fruits = new int[n];
        System.out.println("Enter the fruit types for each tree (separated by spaces): ");
        for (int i = 0; i < n; i++) {
            fruits[i] = scanner.nextInt();
        }
        
        int result = sol.totalFruit(fruits);
        System.out.println("Maximum number of fruits you can pick: " + result);
        
        scanner.close();
    }
}
