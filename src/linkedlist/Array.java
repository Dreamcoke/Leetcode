package linkedlist;

public class Array {
    static int size=5;
    public static void main(String[] args) {
        int[] arr=new int[10];
        for(int i=0;i<5;i++)
            arr[i]=i;
        add(arr,5,12);
        show(arr);
        System.out.println();
        delete(arr,2);
        show(arr);
        System.out.println();
        change(arr,1,99);
        show(arr);
        System.out.println();
        int a=find(arr,5);
        System.out.println(a);
    }

    public static void add(int[] arr,int index,int x){
            if (arr.length==size) {
                System.out.println("无位置可以插入");
                return;
            }
            if (index<0 ||index>size){
                System.out.println("插入坐标不合法");
                return;
            }
            for (int i = size; i > index; i--) {
                    arr[i]=arr[i-1];
            }
            arr[index]=x;
            ++size;
    }

    public static void delete(int[] arr,int index){
        if(arr.length==0){
            System.out.println("没有元素可删除");
            return;
        }

        for (int i = index+1; i < arr.length; i++) {
                    arr[i-1]=arr[i];
        }
        size=size-1;
    }

    public static int find(int[] arr,int index){
        if (size==0)
        {
            System.out.println("无元素");
            return -1;
        }
        if (index<0||index>size-1){
            System.out.println("访问下标不合法");
            return -1;
        }

        return arr[index];
    }

    public static void change(int[] arr,int index,int x){
        if (size==0)
        {
            System.out.println("无元素");
            return ;
        }
        if (index<0||index>size){
            System.out.println("访问下标不合法");
            return ;
        }

        arr[index]=x;
    }

    public static void show(int[] arr){
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]+" ");
        }
    }

}
