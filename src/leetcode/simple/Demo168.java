package leetcode.simple;

public class Demo168 {
    public static String convertToTitle(int n) {
        String a="A",b;
        StringBuilder stringBuilder=new StringBuilder();
        while(n>0){
            int c=n%26;
            if(c==0){
                    n=n-1;
                    c=26;
            }
            stringBuilder.insert(0,(char)('A'+c-1));
            n=n/26;
        }
        return stringBuilder.toString();

    }

    public static void main(String[] args) {
        System.out.println(convertToTitle(52));
    }
}
