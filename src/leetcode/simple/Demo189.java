package leetcode.simple;

public class Demo189 {
    public void rotate(int[] nums, int k) {
        //法一 暴力破解
        // int i;
        // int j;
        // if(k==0)
        //     return;
        // for(;k>0;k--)
        // {
        //     j=nums[nums.length-1];
        //     for(i=nums.length-2;i>=0;i--)
        //     {
        //         nums[i+1]=nums[i];
        //     }
        //     nums[0]=j;
        // }
        //法二 反转
        k=k%nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }
    public void reverse(int[] a,int head,int tail)
    {
        int temp;
        for(;head<=tail;head++,tail--)
        {
            temp=a[head];
            a[head]=a[tail];
            a[tail]=temp;
        }

    }
}
