package leetcode.simple;

import java.util.Arrays;

public class Demo169 {
    //暴力
    public static int majorityElement(int[] nums) {
        int max=0;
        int k=0;
        int val=0;
        int max_val=0;
        for(int i=0;i<nums.length;i++)
        {
            k=0;
            for(int j=0;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                {
                    k++;

                }

            }
            if(k>nums.length/2)
            {
                return nums[i];
            }

        }
        return 0;
    }
    //先排序
    public static int majorityElement1(int[] nums){
        Arrays.sort(nums);
        return(nums[nums.length/2]);
    }
    public static int majorityElement2(int[] nums){
        int k=0;
        int count=0;
        for (int i=0;i<nums.length;i++){

            if (count==0)
                 k=nums[i];
            if (k == nums[i]) {
                count++;
            }
            else
                count--;
        }
        return k;
    }
    public static void main(String[] args) {
        int[] a={1,1,2,2,3,3,3,3};
        System.out.println(majorityElement2(a));
    }
}
