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
class Solution {
    public int pairSum(ListNode head) {
        ArrayList<Integer> arr = new ArrayList<>();
        while(head!=null){
            arr.add(head.val);
            head=head.next;
        }
        int left=0;
        int right=arr.size()-1;
        int ans=Integer.MIN_VALUE;
        while(left<right){
            int sum=arr.get(left)+arr.get(right);
            ans=Math.max(sum,ans);
            left++;
            right--;
        }
        return ans;
    }
}