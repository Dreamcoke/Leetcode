package leetcode.simple;
class Demo01 {
    public int[] twoSum(int[] nums, int target) {
        int[] a=new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[i]+nums[j]==target)
                {
                    a[0]=i;
                    a[1]=j;
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(123);
    }
}