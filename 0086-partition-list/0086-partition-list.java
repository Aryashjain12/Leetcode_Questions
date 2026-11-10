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
    public ListNode partition(ListNode head, int x) {
        ListNode d1 = new ListNode();
        ListNode d2 = new ListNode();
        ListNode i = d1;
        ListNode j = d2;
        ListNode k = head;

        while(k!=null){
            if (k.val < x){
                i.next = k;
                k=k.next;
                i=i.next;
            }else{
                j.next = k;
                k=k.next;
                j=j.next;
            }
        }
        i.next = d2.next;
        j.next = null;

        return d1.next;
    }
}