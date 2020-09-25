package leetcode.simple;

import java.util.HashMap;
import java.util.Map;

//给定一个整数数组和一个整数 k，判断数组中是否存在两个不同的索引 i 和 j，使得 nums [i] = nums [j]，
// 并且 i 和 j 的差的绝对值最大为 k
//思路：利用哈希表，以<值，索引>存储，如果该值没有映射关系，则添加进去，如果有映射关系，则判断该值的索引与当前索引的关系
//如果小于等于k则返回return，否则的话就更新该值的索引。因为如果此处大于k了后面的再有重复的值也就大于k了，所以直接舍弃，用当前的键值对继续往后判断。
public class Demo219 {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])==false){
                map.put(nums[i],i);
            }
            else {
                if (Math.abs(map.get(nums[i])-i)<=k)
                    return true;
                else
                    map.put(nums[i],i);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] a={1,2,3,4};
        System.out.println(containsNearbyDuplicate(a,2));
    }
}
