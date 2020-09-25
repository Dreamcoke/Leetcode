package leetcode.simple;

public class Demo67 {
    public static String addBinary(String a, String b) {
        StringBuilder stringBuilder=new StringBuilder();
        int ca=0;//进位标志符，1代表进位，0代表不进位
        for(int i=a.length()-1,j=b.length()-1;i>=0||j>=0;i--,j--)
        {
            int sum=ca;
            sum+=(i>=0? a.charAt(i)-'0':0);//判断第i位的数值，如果是‘1’或者‘0’，则减去‘0’的十进制数，等于1或者0；如果是小于0，
            // 则代表向前补0
            sum+=(j>=0? b.charAt(j)-'0':0);
            stringBuilder.append(sum%2);//如果二者之和为2，则sum%2刚好为0，否则为1，添加进去；
            ca=sum/2;//如果二者为2，则sum/2为1，表示进位，下次循环就带进去计算，否则为0

        }

        stringBuilder.append( ca==1? ca:"");

        return stringBuilder.reverse().toString();
    }

    public static void main(String[] args) {
        String k=addBinary("10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101",
                "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011");
        System.out.println(k);
        }
}
