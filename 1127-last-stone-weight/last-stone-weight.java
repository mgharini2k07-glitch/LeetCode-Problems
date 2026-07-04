class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int val:stones){
            pq.add(val);
        }
        while(pq.size()>1){
            int top1 = pq.poll();
            int top2 = pq.poll();
            pq.add(top1-top2);
        }
        return pq.poll();
    }
}