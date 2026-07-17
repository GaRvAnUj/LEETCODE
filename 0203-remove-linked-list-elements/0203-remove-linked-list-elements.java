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
    public ListNode removeElements(ListNode head, int val) {
        if(head==null)return head;
        while(head!=null && head.val==val){
            head=head.next;
        }
        ListNode temp=head;
        ListNode prev=null;
        while(temp!=null){
            if(temp.val==val){
                // Skip the matching node// Skip the matching node
                prev.next=temp.next;
            }
            else{
                // Only move prev forward if we DID NOT delete a node
                prev=temp;
            }
            // Always move temp forward to keep traversing
            temp=temp.next;
        }
        return head;
    }
}