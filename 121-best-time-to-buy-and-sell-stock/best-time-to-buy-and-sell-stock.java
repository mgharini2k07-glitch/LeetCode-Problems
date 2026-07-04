class Solution {
    //best time to buy and sell stock
    public int maxProfit(int[] arr) {
        int minCp=arr[0],n=arr.length;
        int maxPro=0;
        for(int i=0; i<n; i++){
            if(arr[i]<minCp){
                minCp=arr[i];
            }
            else{
                int pro = arr[i] - minCp;
                if(pro>maxPro){
                    maxPro=pro;
                }
            }
        }
        return maxPro;
    }
}