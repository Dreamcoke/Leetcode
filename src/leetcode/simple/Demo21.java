package leetcode.simple;
import linkedlist.LinkedList;

public class Demo21 {
      public class ListNode {
      int val;
      ListNode next;
     ListNode(int x) { val = x; }
  }
  //自己写的将一个链表插入到另一个链表
    public static LinkedList.Node mergeTwoLists(LinkedList.Node l1, LinkedList.Node l2) {
        LinkedList.Node p=l1;
        LinkedList.Node q=l2;
        LinkedList.Node head=null;
        LinkedList.Node k=null;
        LinkedList.Node pre=null;
            if (l1==null||l2==null)
                return null;
            if (l1==null)
                return l2;
            if (l2==null)
                return l1;
            if (p.data>q.data)
            {
                head=p;
                p=q;
                q=head;
            }
                head=p;
            while(p!=null&&q!=null){
                if (p.data<=q.data)
                {   pre=p;
                    p=p.next;

                }
                else {
                    k=q.next;
                    q.next=p;
                    pre.next=q;
                    pre=q;
                    q=k;
                }


            }
            if (p==null)
                pre.next=q;
            return head;

    }
    //递归实现
    public static LinkedList.Node digui(LinkedList.Node l1,LinkedList.Node l2)
    {
        if (l1==null)
            return l2;
        if (l2==null)
            return l1;
        if (l1.data<l2.data)
        {
            l1.next=digui(l1.next,l2);
            return l1;
        }

        else {
            l2.next=digui(l1,l2.next);
            return l2;
         }
    }

    public static void main(String[] args) {
        int[] a1={2};
        int[] a2={1};
        LinkedList list1=new LinkedList();
        LinkedList list2=new LinkedList();
        LinkedList.Node head1=null;
        LinkedList.Node head2=null;
        for (int i = 0; i < a1.length; i++) {
            head1=list1.insertToHead(a1[i]);

        }
        for (int i = 0; i < a2.length; i++) {
            head2=list2.insertToHead(a2[i]);
        }


        LinkedList.Node a=digui(head1,head2);
        while (a!=null)
        {
            System.out.println(a.data);
            a=a.next;
        }

    }
}
