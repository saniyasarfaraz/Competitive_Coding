//link:https://leetcode.com/problems/maximum-twin-sum-of-a-linked-list/description/?envType=daily-question&envId=2026-06-14

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
        int max=Integer.MIN_VALUE;
        //Listnode temp= head;
        ArrayList<Integer> arr= new ArrayList<>();
        while(head!=null){
            arr.add(head.val);
            head=head.next;
        }
        for(int i=0;i<arr.size()/2;i++){
            max=Math.max(max,arr.get(i)+arr.get(arr.size()-1-i));
        }
        return max;
    }
}
