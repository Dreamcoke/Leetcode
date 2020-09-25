package jianzhi_offer;

public class

Array_search {
    //法一 暴力，但也有一些约束条件，比如判断为空，第一个数大于目标数，最后一个数小于目标数
    public static boolean Find(int target, int [][] array) {
        //二维数组判断是否为空，有三种：1.判断首地址，2.判断是否为{}，既array.length=0;3.判断是否为{{}},既array[0].length=0。
        if (array==null||array.length==0||array[0].length==0)
            return false;
        if (array[array.length-1][array[0].length-1]<target||array[0][0]>target)
            return false;
        for (int i = 0; i < array.length; i++) {
            for (int j=0;j<array[0].length;j++){
                if (array[i][j]==target)
                    return true;
            }
        }
        return false;
    }
    //法二 通过右上角元素判断，可不用遍历整个数组
    public static boolean Find1(int target, int [][] array) {
        if (array==null||array.length==0||array[0].length==0)
            return false;
        int lenx=array.length;
        int leny=array[0].length;
        int row=0;
        int col=leny-1;
        while(row<lenx&&col>=0)
        {
            if (array[row][col]==target)
                return true;
            else if (array[row][col]>target)
            {
                col--;
            }
            else
                row++;
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] a={{},{}};
        System.out.println(a[0].length);
        //System.out.println(Find(9,a));
    }
}
