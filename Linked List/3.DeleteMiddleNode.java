//link:https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/submissions/2034299560/?envType=daily-question&envId=2026-06-15/**
 /* Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null){
            return null;
        }
        ListNode temp=head;
        int count =0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        ListNode update=head;
        for(int i=0;i<(count)/2-1;i++){
            update=update.next;
        }
        update.next=update.next.next;
        return head;
    }
}
