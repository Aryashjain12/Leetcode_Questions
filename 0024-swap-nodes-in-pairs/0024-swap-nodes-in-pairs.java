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
    public ListNode swapPairs(ListNode head) {
        ListNode d1 = new ListNode();
        ListNode d2 = new ListNode();

        ListNode i = d1;
        ListNode j =d2 ;
        int count = 0;

        while(head!=null){
            if(count%2==0){
                i.next = head;
                i=i.next;
                head = head.next;
            }else{
                j.next = head;
                j=j.next;
                head = head.next;
            }
            count++;
        }
        i.next = null;
        j.next = null;
        i = d1.next;
        j = d2.next;
        ListNode k = j;
        if(j==null){
            return i;
        }
        while(k!=null && j!=null){
            k=k.next;
            j.next = i;
            j=j.next;
            i=i.next;
            if(k!=null){
                j.next=k;
                j=j.next;
            }
        }
        return d2.next;
    }
}