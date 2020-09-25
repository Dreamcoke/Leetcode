package leetcode.simple;

public class Demo922 {
    //方法一 双指针法 A[0],A[2],A[4]存储偶数，A[1],A[3],A[5]存储奇数
    //先检查A[i]是不是偶数，如果不是偶数，则从A[j]里面选择一个偶数进行互换
    public static int[] sortArrayByParityII_1(int[] A) {
        int j=1;
        for(int i=0;i<A.length;i+=2)
        {
            if(A[i]%2!=0)
            {
                while(A[j]%2!=0)
                    j=j+2;
                int temp=A[i];
                A[i]=A[j];
                A[j]=temp;
            }

        }
        return A;
    }
    //方法二  按照下标，下标为偶数，就从数组里面选一个偶数，下标为奇数，就从数组里面选择一个奇数
        public static int[] sortArrayByParityII_2 ( int[] A){
            for (int i = 0; i < A.length; i++) {
                if (i % 2 == 0) {
                    for (int j = i; j < A.length; j++) {
                        if (A[j] % 2 == 0) {
                            int temp = A[j];
                            A[j] = A[i];
                            A[i] = temp;
                            break;
                        }
                    }
                }
                if (i % 2 != 0) {
                    for (int j = i; j < A.length; j++) {
                        if (A[j] % 2 != 0) {
                            int temp = A[j];
                            A[j] = A[i];
                            A[i] = temp;
                            break;
                        }
                    }

                }

            }
            return A;

        }
        //方法三 增加空间，再建一个数组，将偶数放在新数组下标为偶数的位置。
        public static int[] sortArrayByParityII_3 ( int[] A){
            int[] ans = new int[A.length];
            int j = 0;
            for (int i = 0; i < A.length; i++) {

                if (A[i] % 2 == 0) {
                    ans[j] = A[i];
                    j = j + 2;
                }

            }
            j = 1;
            for (int i = 0; i < A.length; i++) {

                if (A[i] % 2 != 0) {
                    ans[j] = A[i];
                    j = j + 2;
                }

            }
            return ans;
        }


    public static void main(String[] args) {
        int[] a={4,2,7,5};
        sortArrayByParityII_1(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
