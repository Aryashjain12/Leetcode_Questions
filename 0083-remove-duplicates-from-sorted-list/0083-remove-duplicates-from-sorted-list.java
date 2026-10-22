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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode i = head;
        ListNode j = head;
        if(head==null){
            return head;
        }

        while(j.next!=null){
            if(i.val==j.val){
                j=j.next;
            }
            if(i.val!=j.val){
                i.next=j;
                i=i.next;
            }
        }
        i.next = null;
        return head;
    }
}