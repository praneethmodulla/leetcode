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
    public int pairSum(ListNode head) {
        if(head == null){
            return 0;
        } else if(head.next == null){
            return head.val;
        }

        List<Integer> array = new ArrayList<>();
        ListNode temp = head;
        while(temp != null){
            array.add(temp.val);
            temp = temp.next;
        }

        int j = array.size() - 1;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < array.size(); i++){
            int sum = array.get(i) + array.get(j - i);
            if(sum > maxSum){
                maxSum = sum;
            }
        }

        return maxSum;
    }
}