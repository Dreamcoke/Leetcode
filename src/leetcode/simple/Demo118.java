package leetcode.simple;

import java.util.ArrayList;
import java.util.List;

public class Demo118 {
    public static List<List<Integer>> generate(int numRows) {
    List<List<Integer>> lists=new ArrayList<List<Integer>>();
    if (numRows==0)
        return lists;
    lists.add(new ArrayList<>());
    lists.get(0).add(1);
    for(int i=1;i<=numRows;i++){
        List<Integer> row=new ArrayList<>();
        List<Integer> prerow=lists.get(i-1);

        row.add(1);
        for(int j=1;j<i;j++){
            row.add(prerow.get(j-1)+prerow.get((j)));
        }
        row.add(1);
        lists.add(row);
    }
    return lists;
    }

    public static void main(String[] args) {
        System.out.println(generate(5));
    }
}
