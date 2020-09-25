package leetcode.simple;

public class Demo27 {
    public static int removeElement(int[] nums, int val) {
            int i,j=0;
                for (i = 0; i < nums.length; i++) {
                    if (nums[i] != val) {
                        nums[j]=nums[i];
                        j++;
                    }
                }
                return j;

    }

    public static void main(String[] args) {
        int[] a={0,1,2,2,3,0,4,2};
        int len=removeElement(a,2);
        for (int i = 0; i < len; i++) {
            System.out.println(a[i]);
        }
    }
}
