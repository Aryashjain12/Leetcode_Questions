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
    public ListNode sortList(ListNode head) {

        if(head == null || head.next==null){
            return head; 
        }
        ListNode slow = head;
        ListNode fast = head;

        while(fast.next !=null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;  
        }
        ListNode head2 = slow.next;
        slow.next = null;

        head =  sortList(head);
        head2 = sortList(head2);
        return mergeTwoLists(head,head2);
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode k = new ListNode();
        ListNode d = k;
        ListNode i = list1;
        ListNode j = list2;

        while(i!=null && j!=null){
            if(i.val<=j.val){
                k.next = i;
                k=k.next;
                i=i.next;
            }else{
                k.next = j;
                k=k.next;
                j=j.next;
            }
        }
        if(i==null){
            k.next = j;
        }else{
            k.next = i;
        }
        return d.next;
    }
}