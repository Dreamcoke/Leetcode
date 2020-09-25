package leetcode.simple;

import java.util.Arrays;

/*
给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。

初始化 nums1 和 nums2 的元素数量分别为 m 和 n。
你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
输入:
nums1 = [1,2,3,0,0,0], m = 3
nums2 = [2,5,6],       n = 3

输出: [1,2,2,3,5,6]
 */
public class Demo88 {
    //先将两个数组整合到一个数组里面，然后在排序
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
          System.arraycopy(nums2,0,nums1,m,n);
        Arrays.sort(nums1);
        }
        //找出两个数组的最小值，依次放入nums1中，前提是把nums1中的数提前拿出来，因此需要空间复杂度O（m）
    public static void merge1(int[] nums1, int m, int[] nums2, int n) {
        int[] nums1_copy=new int[m];
        System.arraycopy(nums1,0,nums1_copy,0,m);

        int p1=0;
        int p2=0;
        int p=0;
        while((p1<m)&&(p2<n)){
            nums1[p++]=(nums1_copy[p1]<nums2[p2])? nums1_copy[p1++]:nums2[p2++];
        }
        //如果nums1_cpoy数组没有元素了，则直接将num2的剩余元素添加到nums1中去
        if (p1==m)
            System.arraycopy(nums2,p2,nums1,p,n-p2);
        //如果nums2数组没有元素了，则直接将num1_copy的剩余元素添加到nums1中去
        if (p2==n)
            System.arraycopy(nums1_copy,p1,nums1,p,m-p1);
    }




    public static void main(String[] args) {
        int[] a={1,2,3,0,0,0};
        int[] b={2,5,6};
        merge(a,3,b,3);
        for (int i=0;i<6;i++)
            System.out.println(a[i]);
    }
}
