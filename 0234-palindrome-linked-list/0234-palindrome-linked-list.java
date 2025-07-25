class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode fast=head,slow=head;
        while (fast!=null && fast.next!=null) {
            fast=fast.next.next;
            slow=slow.next;
        }

        if (fast!=null) {
            slow=slow.next;
        }

        slow=reverseList(slow);
        fast=head;
        while (slow!=null) {
            if (fast.val!=slow.val) {
                return false;
            }
            fast=fast.next;
            slow=slow.next;
        }
        return true;


    }
    private ListNode reverseList(ListNode head){
        ListNode prev=null;
        while (head!=null) {
            ListNode next=head.next;
            head.next=prev;
            prev=head;
            head=next;    
        }
        return prev;
    }
}   
