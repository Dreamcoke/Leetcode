package leetcode.simple;

public class Demo171 {
    public int titleToNumber(String s) {
        char[] a=s.toCharArray();
        int length=a.length;
        int sum=0;
        int j=0;
        for(int i=length-1;i>=0;i--){
            sum+=(int)a[i]*Math.pow(26,j++);
        }
        return sum;
    }
}
