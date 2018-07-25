package _3;

/**
 * Description: Given a string, find the length of the longest substring without repeating characters.
 *
 * @auther: Albert
 * @date: 2018/7/23 22:39
 */

public class Solution {
    /**
     * Description: use two index: a ,b a anchor at the header of substring , b moving forward; then check evey
     * character at b if char exit is substing  a -> b-1 then, b-1-a is cur biggest len. or b moving forward until find
     * any char in a -> b-1 or b reach to s.length . when char exit is substring . a will move to b, b will moving
     * forward 1 step.
     *
     * @param:
     * @return:
     * @auther: Albert
     * @date: 2018/7/23 22:39
     */

    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.equals("")) {
            return 0;
        }
        char[] ss = s.toCharArray();
        int a, b, cache;
        a = b = cache = 0;
        while (b < s.length() - 1) {
            CheckResult checkResult = check(ss, a, b + 1);
            if (checkResult.b) {
                b += 1;
                continue;
            } else {
                cache = Math.max(b + 1 - a, cache);
                a = checkResult.i + 1;
                b += 1;
            }
        }
        return Math.max(b + 1 - a, cache);
    }

    private CheckResult check(char[] ss, int a, int b) {
        for (int i = a; i < b; i++) {
            if (ss[i] == ss[b])
                return new CheckResult(false, i);
        }
        return new CheckResult(true, 0);
    }

    private class CheckResult {
        boolean b;
        int i;

        public CheckResult(boolean b, int i) {
            this.b = b;
            this.i = i;
        }
    }

    public static void main(String[] args) {
        String s = "bbtablud";
        System.out.print(new Solution().lengthOfLongestSubstring(s));
    }
}
