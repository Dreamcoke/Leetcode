package leetcode.simple;
//贪心算法，每次从左往右比较，删除最大的数字，同时还要考虑临界。规律 ：当a[i]>a[i+1]时 删除a[i]
public class Demo402 {
    public static String removeKdigits(String num, int k) {

        //System.out.println(a);
        if (num.equals("0")||k==0)
            return num;
        if(num.length()==k)
            return "0";
        String b="0";

        for (int i=0;i<k;i++){
            int m=0;
            char[] a=num.toCharArray();
            for (int j=0;j<a.length-1;j++) {
                if (a[j] >a[j+1]) {
                    num=num.substring(0,j)+num.substring(j+1);
                    m=1;
                    b = num;
                    break;
                }

            }
            //如果循环比较完一次后，m仍然等于1，既有两种情况 （1）所有的数都相同（2）倒数第二位比倒数第一位小。
            //在这两种情况下都还需要删除最后一位就可以了。
            if (m==0)
            {
                num = num.substring(0,num.length()-1);
                b=num;
            }
            System.out.println(b);
        }
        int j=0;
        //在10200情况下，删除1后，要清理0。
        for (int i=0;i<b.length();i++)
        {
            if (b.charAt(i)!='0')
            {
                j++;
                b=b.substring(i,b.length());
                break;
            }
        }
        if(j==0)
            b="0";
        return b;
    }

    public static void main(String[] args) {
        String string="10200";
        System.out.println(removeKdigits(string,2));
    }
}
