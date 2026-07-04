class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer> m= new HashMap<>();
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(m.containsKey(nums[i])){
                max=max+m.get(nums[i]);
            }
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);
        }
        return max;
    }
}