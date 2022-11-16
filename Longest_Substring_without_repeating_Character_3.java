import java.util.HashMap;
import java.util.Map;

public class Longest_Substring_without_repeating_Character_3 {
    public int lengthOfLongestSubstring(String s) {
        // ! Failed not working
        /*
         * String[] l = s.split("");
         * int count = 1;
         * for (int i = 0; i < l.length; i++) {
         * 
         * if (l[0].equalsIgnoreCase(l[i + 1])) {
         * return count;
         * }
         * count++;
         * }
         * return count;
         */

        // Map<Character, Integer> map = new HashMap<>();
        // int i = 0;
        // int j = 0;
        // int max = 0;
        // while (j < s.length()) {
        // map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);
        // if (map.size() == j - i + 1) {
        // max = Math.max(max, j - i + 1);
        // j++;
        // } else if (map.size() < j - i + 1) {
        // while (map.size() < j - i + 1) {
        // map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
        // if (map.get(s.charAt(i)) == 0)
        // map.remove(s.charAt(i));
        // i++;
        // }
        // j++;
        // }
        // }
        // return max;

        {
            int maxLen = 0;
            int[] pos = new int[128];
            int start = 0, end = 0;

            for (char ch : s.toCharArray()) {
                start = Math.max(start, pos[ch]);
                maxLen = Math.max(maxLen, end - start + 1);
                pos[ch] = end + 1;

                end++;
            }

            return maxLen;
        }

    }

    public static void main(String[] args) {
        Longest_Substring_without_repeating_Character_3 obj = new Longest_Substring_without_repeating_Character_3();
        System.out.println(obj.lengthOfLongestSubstring("pwwkew"));
    }
}
