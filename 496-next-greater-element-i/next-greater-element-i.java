class Solution {
    public int[] nextGreaterElement(int[] n1, int[] n2) {
        int[] res = new int[n1.length];
        Arrays.fill(res,-1);
        for(int i=0;i<n1.length;i++){
            int ind=-1;
            for(int j=0; i<n2.length;j++){
                if(n1[i]==n2[j]){
                    ind = j;
                    break;
                }
            }
            for(int k=ind+1;k<n2.length;k++){
                if(n2[k]>n2[ind]){
                    res[i]=n2[k];
                    break;
                }
            }
        }
        return res;
    }
}