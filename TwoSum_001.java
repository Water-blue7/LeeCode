package com.uiniya.leecode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Package:com.uiniya.leecode
 * ClassName:TwoSum_001
 * Date:2022/8/27 21:24
 * Author:
 * Description:
 */
public class TwoSum_001 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {-1, 2, 3, 9, 12, 17};
        int[] result = solution.twoSum(nums, 14);
        System.out.println(Arrays.toString(result));

        Solution2 solution2 = new Solution2();
        int[] result2 = solution2.twoSum(nums, 16);
        System.out.println(Arrays.toString(result2));

    }

}
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            if (map.containsKey(target - nums[i])){
                return new int[]{map.get(target - nums[i]),i};
            }else{
                map.put(nums[i], i);
            }
        }
        return null;
    }
}

class Solution2{
    public int[] twoSum(int[] nums, int target) {
        //定义一个长度为2的数组
        int[] result = new int[2];
        out:for (int i = 0; i < nums.length-1; i++){
            for (int j = i+1; j < nums.length; j++){
                if (nums[i] + nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                    break out;
                }
            }
        }
        return result;
    }
}