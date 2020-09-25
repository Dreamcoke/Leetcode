package sort;

public class Shell {
    public static void shell(int[] a){
        int N=a.length;
        int h=N/2;
        while(h>=1){
            for (int i = h; i < N; i++) {
                for(int j=i;j>=h;j-=h){
                    if (a[j]<a[j-h])
                    {
                        int temp=a[j];
                        a[j]=a[j-h];
                        a[j-h]=temp;
                    }
                }
            }
            h=h/2;
        }
    }

    public static void main(String[] args) {
        int[] a={2,5,1,3,6,4};
        shell(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
