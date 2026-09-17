class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head.next==null || head==null) return true;
        ListNode temp=head;
        ArrayList<Integer> arr=new ArrayList<>();
        while(temp!=null){
            arr.add(temp.val);
            temp=temp.next;
        }
        int left = 0;
        int right = arr.size() - 1;
        
        while (left < right) {
            if (arr.get(left)!=(arr.get(right))) {
                return false; 
            }
            left++;
            right--;
        }
        
        return true; 
    }
}