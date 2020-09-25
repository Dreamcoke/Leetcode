package leetcode.simple;

public class Demo70 {
    //公式 f(n)=f(n-1)+f(n-2)
    //非递归
    public static int climbStairs(int n) {
        if(n==1)
            return 1;
        if(n==2)
            return 2;
        int m=1,j=2,k=0;
        for(int i=3;i<=n;i++)
        {
            k=m+j;//表示f(n)=f(n-1)+f(n-2)，j=f(n-1),m=f(n-2)
            m=j;
            j=k;

        }
        return k;
    }
    //递归
    public static int climbStairs1(int n){
        if (n==1||n==2)
            return n;
        return climbStairs1(n-1)+climbStairs1(n-2);
    }
    //用数组标记递归中的重复值，减少递归的次数
    public static int climbStairs2(int n){
        int[] a=new int[n+1];//定义了n+1长度的数组，下标范围是0-n,并且初始化为0;
        return climbStairs21(n,a);
    }

    public static int climbStairs21(int n,int[] a){
        if (n==1||n==2)
            return n;
        if (a[n]>0)
            return a[n];
        a[n]=climbStairs21(n-1,a)+climbStairs21(n-2,a);
        return a[n];
    }

    public static void main(String[] args) {
        System.out.println(climbStairs1(44));
    }

}
