package sort;

public class Select {
    public static void select(int[] a)
    {
        for (int i=0;i<a.length;i++)
        {
            int temp=a[i];//将未排序的第一个元素存到temp
            int k=i;//将未排序的第一个元素的下标保存到k
            int p;//作为两个元素交换的过渡值
            for (int j=i+1;j<a.length;j++)
            {

                if(temp<a[j])//找出未排序元素的最小值和下标
                {
                    temp=a[j];
                    k=j;
                }

            }
            //如果未排序的第一个元素本身就是最小值了，那么此时的i与k就是相等的，相当于自身交换
            p=a[i];
            a[i]=temp;
            a[k]=p;
        }
    }

    public static void main(String[] args) {
        //String[] a=new String[]{"B","C","A"};
        int[] a={2,1,4,5,7,3,8};
        select(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
