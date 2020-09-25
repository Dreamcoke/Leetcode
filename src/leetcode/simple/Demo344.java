package leetcode.simple;

public class Demo344 {
    public static void reverseString(char[] s) {
        char temp;
        for(int i=0,j=s.length-1;i<=j;i++,j--){
            temp=s[i];
            s[i]=s[j];
            s[j]=temp;
        }
    }

    public static void main(String[] args) {
        char[] a={'f','d'};
        reverseString(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
