class Solution {
    ArrayList<Integer> al = new ArrayList<>();
    void inorder(TreeNode root){
        if(root == null) return;
        inorder(root.left);
        al.add(root.val);
        inorder(root.right);

    }
    
    TreeNode create(int st, int end) {
        if (st > end) {
            return null;
        }
        int mid =( st + end ) / 2;
        TreeNode root = new TreeNode(al.get(mid));
        root.left = create(st, mid - 1);
        root.right = create(mid + 1, end);
        return root;
    }
    public TreeNode balanceBST(TreeNode root) {
        inorder(root);
        return create(0, al.size()-1);
    }
}