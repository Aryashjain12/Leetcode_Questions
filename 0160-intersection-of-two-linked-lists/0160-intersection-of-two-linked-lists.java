/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        int l1 = 1;
        int l2 = 1;
        while(temp1.next!=null){
            temp1=temp1.next;
            l1++;
        }
        while(temp2.next!=null){
            temp2=temp2.next;
            l2++;
        }
        temp1=headA;
        temp2=headB;
        if(l1>l2){
            int x = 1;
            while(x<=l1-l2){
                temp1=temp1.next;
                x++;
            }
        }else if(l2>l1){
            int x= 1;
            while(x<=l2-l1){
                temp2=temp2.next;
                x++;
            }
        }
        // while(temp1!=null){
        //     if(temp1==null || temp2==null){
        //         return null;
        //     }
        //     if(temp1.val==temp2.val){
        //         return temp1;
        //     }
        //     temp1=temp1.next;
        //     temp2=temp2.next;
        // }
        // return null;
        while(temp1!=temp2){
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return temp1;
    }
}