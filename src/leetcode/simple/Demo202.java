package leetcode.simple;

public class Demo202 {

    public int getnext(int n){
        int sumnext=0;
        while(n!=0){
            int d=n%10;
            n=n/10;
            sumnext+=d*d;
        }
        return sumnext;

    }

//    public boolean isHappy(int n){
//        HashSet<Integer> hashSet=new HashSet<>();
//        while(n!=1&&!hashSet.contains(n)){
//            hashSet.add(n);
//            n=getSum(n);
//        }
//        return n==1;
//    }

    public boolean isHappy(int n){
        int fast_runner=getnext(n);
        int slow_runner=n;
        while(fast_runner!=1&&fast_runner!=slow_runner){
            fast_runner=getnext(getnext(fast_runner));
            slow_runner=getnext(slow_runner);
        }
        return fast_runner==1;
    }
}
