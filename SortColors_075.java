package com.uiniya.leecode;

import java.util.Arrays;

/**
 * Package:com.uiniya.leecode
 * ClassName:SortColors_075
 * Date:2022/8/27 21:51
 * Author:
 * Description:
 */
public class SortColors_075 {

    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        Solution solution = new Solution();
        solution.sortColors(nums);
        System.out.println(Arrays.toString(nums));

    }
}

class Solution {
    public void sortColors(int[] nums) {

        int n0 = 0;
        int n1 = 0;

        for (int i = 0; i<nums.length; i++){
            int num = nums[i];
            nums[i] = 2;
            if (num < 2){
                nums[n1++] = 1;
            }
            if (num < 1){
                nums[n0++] = 0;
            }
        }
    }
}
