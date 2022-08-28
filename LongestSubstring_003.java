package com.uiniya.leecode;

import java.util.HashMap;
import java.util.Map;

/**
 * Package:com.uiniya.leecode
 * ClassName:LongestSubstring_003
 * Date:2022/8/28 10:31
 * Author:
 * Description:最长字符串：最长无重复字符的子字符串的长度
 * 利用HashMap的key不重复做判断，将字符串的每一个字符当作key在map中查找
 * 如果不等于null，就说明该字符已经当作key存入了map中，就结束本次循环。
 * 如果等于null，map中没有相同的key，就把该字符当作key存入map中，并更新result的值
 * j-i+1：本层循环的次数=本次找到的字符串的长度，与之前的result做对比，把较大的更新为result
 */
public class LongestSubstring_003 {

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "abcabcdcbea";

        int i = solution.lengthOfLongestSubstring(s);
        System.out.println(i);
    }
}

class Solution{
    public int lengthOfLongestSubstring(String s){
        int result = 0;
        Map<Character, Integer> map;
        for (int i = 0; i < s.length(); i++){
            map = new HashMap<>();
            for (int j = i; j < s.length(); j++) {
                if (map.get(s.charAt(j)) != null){
                    break;
                }else {
                    map.put(s.charAt(j), j);
                    //j-i+1:字符串长度=本层循环次数
                    result = Math.max(result, j-i+1);
                }
            }
        }
        return result;
    }
}