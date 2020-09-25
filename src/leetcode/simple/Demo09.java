package leetcode.simple;

public class Demo09 {
    public static boolean is(int x){
        /*String str=String.valueOf(x);
        System.out.println(str);
        char[] ch=str.toCharArray();
        for(int i=0,j=ch.length-1;i<j;i++,j--){
            if (ch[i]==ch[j])
                continue;
            else
                return false;
        }
        return true;*/

        String str=(new StringBuffer(x+"")).reverse().toString();
        return str.equals(x+"");
    }
    public static void main(String[] args) {
        System.out.println(is(101));
    }
}
