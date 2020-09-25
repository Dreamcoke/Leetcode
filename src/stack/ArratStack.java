package stack;
//数组的顺序栈
public class ArratStack {
    private String[] items;
    private int count;//栈内元素个数
    private int n;//栈的大小

    public ArratStack(int n){
        this.items=new String[n];
        this.count=0;
        this.n=n;
    }

    //进栈
    public boolean push(String item)
    {
        if (count==n)
            return false;
        items[count]=item;
        count++;
        return true;
    }
    //出栈
    public String pop(){
        if (count==0)
            return null;
        count--;
        return items[count];

    }

}
