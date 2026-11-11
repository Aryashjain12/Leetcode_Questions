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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode i = head;
        ListNode j = head.next;
        int a = 0 ;
        int b = 0;
        while(i!=null && j!=null){
            if(i.val>=j.val){
                a = i.val;
                b = j.val;
            }else{
                a = j.val;
                b = i.val;
            }
            while(b!=0){
                int temp = b ; 
                b = a%b;
                a = temp;
            }
            ListNode x = new ListNode(a);
            i.next = x;
            i.next.next = j;
            i=i.next.next;
            j=j.next;
        }
        return head;
    }
}