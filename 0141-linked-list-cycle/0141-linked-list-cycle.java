public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode fastPtr=head;
        ListNode slowPtr=head;

        while(slowPtr!=null && fastPtr!=null && fastPtr.next!=null){
            slowPtr=slowPtr.next;
            fastPtr=fastPtr.next.next;

            if(fastPtr==slowPtr){
                return true;
            }
        }
        return false;
        
    }
}