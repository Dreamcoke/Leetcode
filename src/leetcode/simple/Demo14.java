package leetcode.simple;

public class Demo14 {
    //最长公共前缀，法1，先将第一个字符按从尾到头的顺序取出来，依次去匹配在剩余的字符串中的位置看是不是等于0，如果等于0，则k++；
    //如果k等于数组长度减一，则结束。
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length==0)
            return "";
        String s=strs[0];
        int k=0;
        String ans;
        for (int i=s.length();i>0;i--)
        {
            ans=s.substring(0,i);
            System.out.println(ans);
            k=0;
            for (int j=1;j<strs.length;j++)
            {

               // System.out.println(j);
                if (strs[j].indexOf(ans)==0)
                {
                    k++;
                    if (k==strs.length-1)
                        return ans;
                }
                else
                    break;
            }
        }
        return "";
    }
//法二 分治法
    public static String longestCommonPrefix1(String[] strs) {
        if (strs==null||strs.length==0)
            return "";
        return longestCommonPrefix2(strs,0,strs.length-1);
    }
//切分
    public static String longestCommonPrefix2(String[] strs,int l,int r){
        if (l==r)
            return strs[l];
        int mid=(l+r)/2;
        String lcpleft=longestCommonPrefix2(strs,l,mid);
        String lcpright=longestCommonPrefix2(strs,mid+1,r);
        return commonPrefix(lcpleft,lcpright);
    }
//判断递归最深的挨着的两个字符。
    public static String commonPrefix(String left,String right){
        int min=Math.min(left.length(),right.length());
        for (int i=0;i<min;i++){
            if (left.charAt(i)!=right.charAt(i))
            {
                return left.substring(0,i);
            }
        }
        return left.substring(0,min);
    }

    public static void main(String[] args) {
        String[] a={"ac","acc","acw"};
        String b="fl";
        //System.out.println(b.indexOf(a[0]));
        System.out.print(longestCommonPrefix1(a));
    }
}
