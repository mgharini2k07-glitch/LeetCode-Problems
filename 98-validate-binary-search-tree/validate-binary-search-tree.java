class Solution {
    ArrayList<Integer> al = new ArrayList<>();
    public boolean isValidBST(TreeNode root) {
        inorder(root);
        for(int i=0; i<al.size()-1; i++){
            if(al.get(i)>=al.get(i+1)) return false;
        }
        return true;
    }
    private void inorder(TreeNode node){
        if(node == null) return;
        inorder(node.left);
        al.add(node.val);
        inorder(node.right);
    }
}