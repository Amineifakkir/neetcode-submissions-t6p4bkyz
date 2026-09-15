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
    public ListNode reverseList(ListNode head) {
        // check if the list is empty if yes then return the same input 
        if(head.length() == 0 ){
            return head;
        } else{
            List<String> myAL = new ArrayList<String>(head);
            Collections.reverse(myAL);

        }
        // if the list is not empty then we should 
    }
    
}
