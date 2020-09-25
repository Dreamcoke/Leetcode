package leetcode.simple;

public class Demo237 {
        public void deleteNode(ListNode node) {
            ListNode p=node;

            while(p!=null&&p.next!=null){
                if(p.val==node.val){
                    p.val=p.next.val;
                    p.next=p.next.next;
                }
                p=p.next;

            }
        }
    }
