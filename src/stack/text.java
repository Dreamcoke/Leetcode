package stack;


    public class text {
        public static void main(String []args) {
            double k=0.0;
            for(double i=0.0;i<10000;){
                k=(Math.pow(i,20)*Math.pow(Math.E,-15*i))-(recursion(20)/Math.pow(15,20));
                if(k>-0.0001&&k<0.0001)
                {
                    System.out.println(i);
                    break;
                }
                i=i+0.1;

                //k=k+(Math.pow(12,i)*(Math.pow(Math.E,-12))-(Math.pow(15,i))*(Math.pow(Math.E,-15)))/recursion(i);
            }
            System.out.println("00");


        }

        public static double recursion(int num){
            if(num<=1)
                return 1;
            else
                return num*recursion(num-1);
        }

    }


