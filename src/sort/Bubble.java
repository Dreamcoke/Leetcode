package sort;

public class Bubble {

    public static void bubble(int[] arr){
        int temp;
        int k=arr.length;
        for (int i = 0; i < k; k--) {
            boolean flag=false;
            for (int j = i; j < k-1; j++) {
                if (arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=true;
                }

            }
            if (!flag)
                break;
        }
    }

    public static void main(String[] args) {
        int[] arr={5,2,6,9,1,11};
        bubble(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
