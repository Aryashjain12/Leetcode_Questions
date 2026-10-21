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
    public ListNode middleNode(ListNode head) {
        ListNode temp = new ListNode();
        temp = head;
        int size = 0 ;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        int a = 0 ;

        a=size/2;
        temp = head;
        while(a>0){
            temp = temp.next;
            a--;
        }
        return temp;
    }
}