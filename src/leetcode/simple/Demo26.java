package leetcode.simple;

public class Demo26 {
    //方法一
    public static int removeDuplicates(int[] nums){
        int len=nums.length;
        int i,j=0,k=0,sum=0;
        for (i = 0; i < len; i++) {
            j=j+1;
            k=0;
            if (j>=len)
                break;
            while (nums[i]==nums[j]){
                j++;
                k++;
                if (j>=len)
                    return len-(j-i-1);
            }
            if (k==0&&(j-i)!=1)
            {
                nums[i+1]=nums[j];
                continue;
            }

            else
            {
                nums[i+1]=nums[j];
            }
            sum=sum+k;

        }
        len=len-sum;
        return len;
       }
  //方法2
       public static int test(int[] nums){
            int i=0,j;
            j=1;
            while (j<nums.length)
            {
                if (nums[i]!=nums[j])
                {
                    nums[i+1]=nums[j];
                    i++;

                }
                j++;

            }
            return i+1;
       }



    public static void main(String[] args) {
        int[] a={1,1,2,3};
        int len=test(a);
        for (int i = 0; i < len; i++) {
            System.out.println(a[i]);
        }
    }
}
