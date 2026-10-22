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
    public ListNode mergeNodes(ListNode head) {
        int sum =0 ;
        ListNode i = head;
        ListNode j = head;

        while(j.next!=null){
            if(j==i){
                j=j.next;
            }
            if(j.val>0){
                sum+=j.val;
                j=j.next;
            }
            if(j.val==0){
                i.val = sum;
                i.next = j;
                if(j.next!=null){
                i=i.next; 
                }
                sum=0;
            }
        }
        
        i.next= null;
        return head;
    }
}