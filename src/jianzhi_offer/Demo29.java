package jianzhi_offer;

public class Demo29 {
    public int[] spiralOrder(int[][] matrix) {
        int l=0;
        int t=0;
        int r=matrix[0].length-1;
        int b=matrix.length-1;
        int x=0;
        int[] res=new int[(b+1)*(r+1)];
        while(true){
            for(int i=l;i<=r;i++)
                res[x++]=matrix[t][i];
            if(++t>b) break;
            for(int i=t;i<=b;i++)
                res[x++]=matrix[i][r];
            if(--r<b)
                break;
            for(int i=r;i>=l;i--)
                res[x++]=matrix[b][i];
            if(--b<t)
                break;
            for(int i=b;i>=t;i++)
                res[x++]=matrix[i][r];
            if(++l>r)
                break;

        }
        return res;
    }
}
