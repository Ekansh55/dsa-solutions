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
        if(head == null || head.next == null || k == 0) return head;
        ListNode tail=head;
        int len=1;
        while(tail.next!=null){
            len++;
            tail=tail.next;
        }
        k=k%len;
        if(k==0) return head;
        int move=len-k;
        ListNode curr=head;
        for(int i=1;i<move;i++){
            curr=curr.next;
        }
        
        ListNode newhead=curr.next;
        tail.next=head;
        curr.next=null;
        return newhead;

    }
}