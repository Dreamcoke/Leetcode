package sort;

public class Insert {
    public static void insert(int[] arr){
        int temp;
        for (int i = 1; i < arr.length; i++) {
            temp=arr[i];
            int j;
            for (j=i-1;j>=0;j--)
            {
                if (temp>arr[j])
                {
                    arr[j+1]=arr[j];

                }
                else
                    break;
            }
            arr[j+1]=temp;
        }
    }

    public static void main(String[] args) {
        int[] arr={1,6,8,2,4};
        insert(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }


}
