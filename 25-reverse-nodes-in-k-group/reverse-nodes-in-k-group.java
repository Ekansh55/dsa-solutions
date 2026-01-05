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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        int c = 0;
        while(temp!=null&&c<k){
            c++;
            temp=temp.next;
        }
        if(c<k) return head;
        c = 0;
        ListNode curr = head;
        ListNode prev = null;
        ListNode next = null;
        while(curr!=null&&c<k){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            c++;
        }
        if(next!=null){
            head.next = reverseKGroup(curr,k);
        }
        return prev;

    }
}