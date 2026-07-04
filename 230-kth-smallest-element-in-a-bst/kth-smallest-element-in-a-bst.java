class Solution {
    ArrayList<Integer> al = new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        inorder(root);
        return al.get(k-1);
    }
    void inorder(TreeNode root){
        if(root == null) return;
        inorder(root.left);
        al.add(root.val);
        inorder(root.right);
    }
}