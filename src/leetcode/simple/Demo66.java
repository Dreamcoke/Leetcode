package leetcode.simple;

public class Demo66 {
    public static int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--)
        {
            digits[i]++;
            digits[i]=digits[i]%10;
            if (digits[i]!=0)
                return digits;
        }
        digits=new int[digits.length+1];
        digits[0]=1;
        return digits;
    }

    public static void main(String[] args) {
        int[] a={9,8,7,6,5,4,3,2,1,0};
        int[] b=plusOne(a);
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
}

