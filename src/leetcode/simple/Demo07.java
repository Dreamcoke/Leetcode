package leetcode.simple;

public class Demo07 {

    public static int reverse(int x) {
        int count=0;
        int total=0;
        int[] a=new int[10];
        while(x!=0)
        {
            a[count]=x%10;
            count++;
            x=x/10;
        }

        int b=count-1;
        for(int i=0;i<count;i++)
        {
            total+=a[i]*(Math.pow(10,b));
            b--;
        }
        if (total==2147483647||total==-2147483648)
            total=0;
        return total;
    }

    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }

}
