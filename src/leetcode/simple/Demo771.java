package leetcode.simple;

public class Demo771 {
    public int numJewelsInStones(String J, String S) {
        char[] a=J.toCharArray();
        char[] b=S.toCharArray();
        int sum=0;
        for (int i = 0; i < a.length; i++) {
            for (int j=0;j<b.length;j++)
            {
                if (a[i]==b[j])
                    sum++;
            }
        }
        return sum;
    }
}
