package leetcode.simple;
//典型的贪心算法题目，如果当天的价格比明天的价格高，则放弃当天的价格，以明天的价格为基准，如果当天的价格比明天的价格低
//说明股票涨了，将明天的价格入栈，再将后天的价格与刚入栈的价格作对比，如果还是高于明天的价格，则说明股票一直在涨，因为继续入栈
//当某天价格低于栈顶的价格时，就按照栈顶的价格卖掉股票。然后重新以这某天的价格作为栈底，然后重复上述步骤。
public class Demo122 {
    public static int maxProfit(int[] prices) {
        if (prices.length==0||prices==null)
            return 0;
        int[] stack=new int[prices.length+1];
        int i;
        int j=0;
        stack[j]=prices[0];
        int sum=0;
        for (i=1;i<prices.length;i++){
            if (stack[j]<prices[i])//当前的价格大于栈顶的价格，入栈
            {
                stack[++j]=prices[i];
            }
            else if (stack[j]>prices[i])//当前的价格小于栈顶的价格，说明股票跌了，所以及时卖出，计算sum，并重新设置栈。
            {
                sum=sum+stack[j]-stack[0];
                j=0;
                stack[j]=prices[i];
            }
            else
                continue;

        }
        //如果股票一直在涨，那么直接从栈顶元素减去栈底元素即可，还有一种情况就是栈里面只剩一天的价格，那么stack[j]-stack[0]=0不影响结果
        sum=sum+stack[j]-stack[0];
        return sum;
    }
    public static void main(String[] args) {
        int[] a={7,6,4,3,1};
        System.out.println(maxProfit(a));
    }
}
