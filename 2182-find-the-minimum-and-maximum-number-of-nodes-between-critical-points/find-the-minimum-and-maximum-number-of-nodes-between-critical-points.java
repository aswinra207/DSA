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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        
        int[] ans = {-1, -1};
        
        if (head == null || head.next == null || head.next.next == null) {
            return ans;
        }

        ListNode prev = head;
        ListNode curr = head.next;

        int index = 1;
        int first = -1;
        int prevCritical = -1;

        int minDist = Integer.MAX_VALUE;
        int maxDist = -1;

        while (curr.next != null) {
            
            int nextValue = curr.next.val;
            boolean isCritical =
                (curr.val > prev.val && curr.val > nextValue) ||
                (curr.val < prev.val && curr.val < nextValue);

            if (isCritical) {
                if (first == -1) {
                    first = index;
                }
                if (prevCritical != -1) {
                    minDist = Math.min(minDist, index - prevCritical);
                    maxDist = Math.max(maxDist, index - first);
                }
                prevCritical = index;
            }
            prev = curr;
            curr = curr.next;
            index++;
        }
        if (maxDist == -1) {
            return ans;
        }
        return new int[]{minDist, maxDist};
    }
}