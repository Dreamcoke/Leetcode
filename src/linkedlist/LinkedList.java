package linkedlist;

public class LinkedList {

    public  class Node{ //嵌套类
        public int data;
        public Node next;


    public Node(int data,Node next){
        this.data=data;
        this.next=next;
     }

     public int getData(){
        return data;
     }

    }

    private Node head=new Node(9999,null);//定义头结点
    private Node p=head;
    //带头结点的尾插
    public  void CreateLinkedListToEnd(int data){
        Node node=new Node(data,null);
        while (p.next!=null)
            p=p.next;
        node.next=p.next;
        p.next=node;

    }
    //带头结点的头插

    public void CreateLinkedListToTail(int data)
    {
        Node node=new Node(data,null);
        p.next=node;
        p=node;
    }

    //无头结点的尾插
    public Node insertToHead(int data)
    {
        Node node=new Node(data,null);
        if(head.data==9999)
            head=node;
        else
        {
            Node p=head;
            while(p.next!=null){
                p=p.next;
            }
            p.next=node;
        }
        return head;

    }
    //查看

    public Node find(int data)
    {
        Node q=head.next;
        while(q!=null&&q.data!=data){
            q=q.next;
        }
        return q;

    }
    //删除
    public void delete(int data){
        Node q=head.next;
        Node p=head;
        while(q!=null&&q.data!=data)
        {
            q=q.next;
            p=p.next;
        }

        if (q==null)
            return;
        p.next=q.next;
    }

    public void show(){
        Node node;
        if (head.data==9999)
            node=head.next;
        else
            node=head;

        while(node!=null){
            System.out.println(node.data);
            node=node.next;
        }

    }
    //带头结点的链表反转，等价于从第二个元素开始进行头插
    public Node inverseLinkList_head(){
        Node q=head.next.next;
        Node p=q;
        head.next.next=null;
        while (p!=null)
        {
            p=q.next;
            q.next=head.next;
            head.next=q;
            q=p;
        }
        return head;
    }
    //不带头结点的反转
    public  Node inverseLinkList(Node p){
        Node pre=null;
        Node r=head;
        Node next=r.next;
        while (r!=p)
        {
            r.next=pre;
            pre=r;
            r=next;
            next=next.next;
        }
        r.next=pre;
        return r;
    }
    //判断是不是回文数
    public boolean palindrome(){
        Node left,right;
        if (head.data==9999)
        {
            System.out.println("无元素");
            return false;
        }
        if (head.data!=9999&&head.next==null)
        {
            System.out.println("只有一个元素");
            return true;
        }
        //定义快慢指针，快的每次移动两个，慢的移动一个，在节点数为奇数的时候，当快的指针到达最后一个节点时，
        // 慢的必然是中间节点，当节点数为偶数个是，当快的指针到达倒数第二个时，慢的到达中间的两个的左边的那个。
        Node p=head;
        Node q=head;
        while(p.next!=null&&p.next.next!=null)
        {
            p=p.next.next;
            q=q.next;
        }
        //System.out.println(q.data);
        //System.out.println(q.next.data);

        if (p.next==null){
            //必须先将右边的指针拿出来，否则的话，先将左边的反转，q.next就变了
            right=q.next;
            left=inverseLinkList(q).next;
            //right=q.next;
            //System.out.println(right.data);
        }

        else
        {
            right=q.next;
            left=inverseLinkList(q);

        }
        return isSanme(left,right);
    }

    public boolean isSanme(Node L,Node R)
    {
        System.out.println(L.data+" "+R.data);
        while(L!=null&&R!=null){
            if (L.data==R.data)
            {
                L=L.next;
                R=R.next;

            }
            else
                return false;
        }
        return true;
    }

    //检测链表是不是有环,利用快慢指针，快的如果追上了慢的，则证明有环出现。

    public boolean checkCircle(Node p){
        if (p==null)
            return false;
        Node fast=p.next;
        Node slow=p;
        while(fast!=slow){
            if (fast==null||slow==null)
                return false;
            fast=fast.next.next;
            slow=slow.next;
        }
        return true;
    }

}
