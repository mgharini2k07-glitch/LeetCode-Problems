class Solution {
    public int[] twoSum(int[] nums, int target) {
        int res[]=new int[2];
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int n1=nums[i],n2=target-n1;
            if(m.containsKey(n2)){
                res[0]=i;
                res[1]=m.get(n2);
                return res;
            }
            m.put(nums[i],i);
        }
        return res;
    }
    
}