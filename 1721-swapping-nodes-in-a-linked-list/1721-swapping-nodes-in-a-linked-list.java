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
    public ListNode swapNodes(ListNode head, int k) {
        int s = 1 ;
        ListNode first = head;
        ListNode slow = head;
        ListNode fast = head;

        while(s<k){
            first=first.next;
            s++;
        }
        s=1;
        while(s<k){
            fast = fast.next;
            s++;
        }

        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        int temp = slow.val;
        slow.val = first.val;
        first.val = temp;

        return head;
    }
}