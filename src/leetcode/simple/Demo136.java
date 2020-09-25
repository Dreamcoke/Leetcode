package leetcode.simple;

//import org.omg.PortableInterceptor.INACTIVE;

import java.util.HashMap;
import java.util.Map;

public class Demo136 {
    public int singleNumber(int[] nums) {
        if (nums==null||nums.length==0)
            return 0;
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }
            else
                map.put(nums[i],2);
        }
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i])==1)
                return nums[i];
        }

        return 0;
    }
}
