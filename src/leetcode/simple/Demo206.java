package leetcode.simple;

public class Demo206 {
    //方法一 太笨重，没有处理好当前节点的下一个节点的位置
//    public ListNode reverseList(ListNode head) {
//        ListNode pre=head;
//        ListNode p;
//        ListNode k;
//        if(head==null)
//            return null;
//        if(head.next==null)
//            return head;
//        if(head.next.next==null)
//        {
//            p=head.next;
//            p.next=pre;
//            pre.next=null;
//            return p;
//        }
//        p=head.next;
//        k=p.next;
//        head.next=null;
//        while(p!=null&&k!=null){
//            p.next=pre;
//            pre=p;
//            p=k;
//            k=k.next;
//        }
//        p.next=pre;
//        return p;
//    }
//方法二 很好的处理了nextnode，节省了代码量
//    ListNode pre=null;
//    ListNode cur=head;
//    ListNode nextnode;
//        if(head==null)
//            return null;
//        while(cur!=null){
//        nextnode=cur.next;
//        cur.next=pre;
//        pre=cur;
//        cur=nextnode;
//    }
//        return pre;
}
