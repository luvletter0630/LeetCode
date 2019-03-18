package LongestSbtChar;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static int lengthOfLongestSubstring(String s) {
        char [] arry = s.toCharArray();
        Map map = new HashMap();
        int cnt = 0;
        for (int i = 0; i < arry.length; i ++){
            if (map.containsKey(arry[i])){
                if (cnt < map.size()){
                    cnt = map.size();
                }
                map.clear();
            }
            map.put(arry[i],i);
        }
        return cnt;
    }
}
