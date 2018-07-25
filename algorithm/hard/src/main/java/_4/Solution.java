package _4;

/**
 * There are two sorted arrays nums1 and nums2 of size m and n respectively.
 * @Auther: Albert
 * @Date: 2018/7/23 23:49
 * @Description:
 */
public class Solution {
    /**
     * Description:
     *
     *
     * @param:
     * @return:
     * @auther: Albert
     * @date: 2018/7/24 0:04
     */

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int f = nums1.length + nums2.length;
        int [] fi = new int[f];
        for(int i = 0 , j = 0,index =0; index < fi.length; index++ ){
            if(nums1[i]< nums2[j] ){
                fi[index] = nums1[i];
                i++;
            }
            return  0.0;
        }
    }
}
