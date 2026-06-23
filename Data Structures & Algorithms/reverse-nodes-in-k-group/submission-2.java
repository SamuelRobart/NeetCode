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

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        if(head == null) return null;

        ListNode groupPrev = dummy;

        while(true){

            

            ListNode Kth = getKth(groupPrev,k);

            if(Kth == null) break;

            ListNode groupNext = Kth.next;
            ListNode prev = groupNext;
            ListNode current = groupPrev.next;



            while(current != groupNext){

                ListNode next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }

            ListNode temp = groupPrev.next;

            groupPrev.next = Kth;

            groupPrev = temp;
        }

        return dummy.next;
        
    }

    private ListNode getKth(ListNode curr, int k){

        while(curr != null && k > 0){

            curr = curr.next;
            k--;
        }

        return curr;
    }
}