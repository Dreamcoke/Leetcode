package leetcode.simple;

public class Demo283 {
    public static void moveZeroes(int[] nums) {
        int i,j=0;
        for (i = 0; i < nums.length; i++) {
            if (nums[i]!=0)
            {
                nums[j]=nums[i];
                j++;
            }
        }
        for (;j<nums.length;j++){
            nums[j]=0;
        }
    }

    public static void main(String[] args) {
        int[] a={1,2,3,0};
        moveZeroes(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
