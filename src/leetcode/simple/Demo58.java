package leetcode.simple;

public class Demo58 {
    public static int lengthOfLastWord(String s) {
        if(s==null)
            return 0;
        String[] a=s.split(" ");
        if(a.length==0)
            return 0;
        return a[a.length-1].length();
    }

    public static void main(String[] args) {
        String a="ds";
        lengthOfLastWord(a);
    }
}
