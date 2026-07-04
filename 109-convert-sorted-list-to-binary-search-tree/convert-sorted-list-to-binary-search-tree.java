/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    ArrayList <Integer> al = new ArrayList<>();
    void buildList(ListNode head){
        while(head!=null)
        {
            al.add(head.val);
            head = head.next;
        }
    }
    TreeNode create(int st, int end) {
        if (st > end) {
            return null;
        }
        int mid =(st+end) / 2;
        TreeNode root = new TreeNode(al.get(mid));
        root.left = create(st, mid - 1);
        root.right = create( mid + 1, end);
        return root;
    }
    public TreeNode sortedListToBST(ListNode head) {
        buildList(head);
        return create(0, al.size()-1);
    }
    
}

    