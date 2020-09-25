package leetcode.simple;

public class Demo160 {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            if(headA==null||headB==null)
                return null;
            ListNode p=headA;
            ListNode q=headB;
            while(p!=null&&q!=null)
            {
                p=p.next;
                q=q.next;
            }
            while(q!=null){
                q=q.next;
                headB=headB.next;
            }
            while(p!=null){
                p=p.next;
                headA=headA.next;
            }

            while(headA!=null&&headB!=null){
                if(headA==headB)
                {
                    return headA;
                }
                headA=headA.next;
                headB=headB.next;
            }

            return null;
        }
    }
