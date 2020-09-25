package leetcode.simple;

/**
 * Definition for singly-linked list.
 */
class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }

class Demo83 {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null)
            return null;
        ListNode p=head.next;
        ListNode q=head;
        while(q!=null&&p!=null){
            if(q.val==p.val){
                q.next=p.next;
            }
            else
            {
                q=p;
            }
            p=p.next;
        }
        return head;
    }

}
