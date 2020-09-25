package leetcode.simple;

public class Demo167 {
    public int[] twoSum(int[] numbers, int target) {
//        int i,j=0;
//        Map<Integer,Integer> map=new HashMap<>();
//        for(i=0;i<numbers.length;i++){
//            map.put(i,numbers[i]);
//        }
//        while(target-map.get(j)>0){
//            if(map.containsValue(target-map.get(j))){
//                int n=j;
//                int m=map.con
//            }
//        }
        int i=0,j=numbers.length-1;
        int[] a=new int[2];
        while(i<j){
            if(numbers[i]+numbers[j]>target)
                j--;
            if(numbers[i]+numbers[j]==target)
                break;
            if(numbers[i]+numbers[j]<target)
                i++;
        }
        a[0]=i;
        a[1]=j;
        return a;

    }
}
