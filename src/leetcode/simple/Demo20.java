package leetcode.simple;

public class Demo20 {
    public static boolean isValid(String s) {
        char[] a=s.toCharArray();
        char[] b=new char[s.length()+1];
        int j=1;
        for (int i=0;i<a.length;i++){
            if (a[i]=='{'||a[i]=='('||a[i]=='[')
            {
                b[j++]=a[i];
            }

            else if(a[i]==']'&&b[j-1]=='[')
            {
                System.out.println(b[j-1]);
                System.out.println(a[i]);
                    j=j-1;
            }
            else if(a[i]=='}'&&b[j-1]=='{')
            {
                System.out.println(b[j-1]);
                System.out.println(a[i]);
                j=j-1;
            }
            else if(a[i]==')'&&b[j-1]=='(')
            {
               System.out.println(b[j-1]);
               System.out.println(a[i]);
                j=j-1;
            }
            else
                return false;


        }
        //System.out.println(2);
        if (j==1)
            return true;
        return false;
    }

    public static void main(String[] args) {
        String s="()[]{}";
        System.out.println(isValid(s));
    }
}
