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
    public ListNode oddEvenList(ListNode head) {
        ListNode d1 = new ListNode(0);
        ListNode d2 = new ListNode(0);
        ListNode i = d1;
        ListNode j = d2;
        ListNode k = head;
        int count = 0;
        while(k!=null){
            if(count%2==1){
                i.next = k;
                i=i.next;
                k=k.next;
            }else{
                j.next = k;
                j=j.next;
                k=k.next;
            }
            count++;
        }
        i.next=null;
        j.next = null;
        j.next = d1.next;

        return d2.next;
    }
}