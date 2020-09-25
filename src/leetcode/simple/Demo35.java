package leetcode.simple;

public class Demo35 {
    public int searchInsert(int[] nums, int target) {
        int i,j;
        for(i=0;i<nums.length;i++)
        {
            if (nums[i]==target)
                return i;
            if(nums[i]>target)
                return i;
        }
        return 0;
    }
    //二分查找
    public int searchInsert1(int[] nums,int target){
        int left=0,right=nums.length-1;
        if (nums[nums.length-1]<target)
            return nums.length;
        while(left<=right){
            int mid=(left+right)/2;
            if (nums[mid]==target)
                return mid;
            else if (nums[mid]<target)
                left=mid+1;
            else
                right=mid-1;
        }
        return left;

    }
}
