package _5;

/**
 * Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
 *
 * @Auther: Albert
 * @Date: 2018/7/24 12:31
 * @Description:
 */
public class Solution {
    /**
     * Description: how to identify every palindrome ?
     * find the middle value,
     *  plan 1 : two index a b , a from left, b from right.   for each a find the
     * equal value, cache a to a'. then a + 1, b-1 until find the val[a] not equal to val[b]. a move forwarding to a' +1 .
     * redo the process, util find every.
     * plan 2: two index a b . start from left, a at 0, b at 0  .
     *
     * @param:
     * @return:
     * @auther: Albert
     * @date: 2018/7/24 12:36
     */

    public String longestPalindrome(String s) {
        return null;
    }
}
