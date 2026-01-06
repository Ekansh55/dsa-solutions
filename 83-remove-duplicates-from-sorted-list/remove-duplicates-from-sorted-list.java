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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null) return null;
        HashSet <Integer> set = new HashSet<>();
        ListNode curr = head;
        set.add(curr.val);
        while(curr.next!=null){
            if(set.contains(curr.next.val)) curr.next=curr.next.next;
            else{
                set.add(curr.next.val);
                curr=curr.next;
            }
            
        }
        return head;
    }
}