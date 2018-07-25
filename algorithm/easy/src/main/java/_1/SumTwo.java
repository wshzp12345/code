package _1;

import java.util.HashMap;
import java.util.Map;

public class SumTwo {
    public int[] twoSum(int[] nums, int target) {
        int [] m =new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i =0; i< nums.length; i++){
//            if(nums[i]<=target){
                if(map.containsKey(nums[i])){
                    fillArray(m,map.get(nums[i]),i);
                    return m;
                }else{
                    map.put(target-nums[i],i);
                }
//            }
        }
        fillArray(m,-1,-1);
        return m;

    }

    private void fillArray(int[] m,int i, int j){
        m[0]=i;
        m[1]=j;
    }
}
