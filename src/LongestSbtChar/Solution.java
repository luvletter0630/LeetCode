package LongestSbtChar;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static int lengthOfLongestSubstring(String s) {
        char [] arry = s.toCharArray();
        Map<Character,Integer> map = new HashMap<Character, Integer>();
        int cnt = 0;
        for (int i = 0,j = 0; i < arry.length; i ++){
            if (map.containsKey(arry[i])){
                j = (j > map.get(arry[i]) + 1) ? j : map.get(arry[i]) + 1;
                if (i - j > cnt){
                    cnt = i - j;
                }
            }
            if (i - j + 1> cnt){
                cnt = i - j + 1;
            }
            map.put(arry[i],i);
        }
        return cnt;
    }
}
