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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode s = head;
        int size = 0 ;
        while(s!=null){
            s=s.next;
            size++;
        }
        if(size==0 || k ==0 ){
            return head;
        }
        s= head;
        ListNode f = head;
        k%=size;
        int i = 1 ; 
        while(i<=k){
            f=f.next;
            i++;
        }
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next;
        }
        if(s.next!=null){
        ListNode a = s.next;
        ListNode t = a;
        

        while(t!=null && t.next!=null){
            t=t.next;
        }
        s.next = null;
        if(t!=null){
        t.next = head;}
        return a;
        }
    return head;
    }
}