package com.relyy.array;

/**
 * 给定两个大小为 m 和 n 的有序数组 nums1 和 nums2。
 *
 * 请你找出这两个有序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。
 *
 * 你可以假设 nums1 和 nums2 不会同时为空。
 *
 * 示例 1:
 *
 * nums1 = [1, 3]
 * nums2 = [2]
 *
 * 则中位数是 2.0
 * 示例 2:
 *
 * nums1 = [1, 2]
 * nums2 = [3, 4]
 *
 * 则中位数是 (2 + 3)/2 = 2.5
 *
 *中位数：存在一个有序序列，如果有序序列中元素个数为奇数个，这中位数就是中间数，
 * 如果有序序列中元素个数为偶数个，则中位数就是中间两个数的平均数;左右两边元素相等
 */
public class FindMedian {

	public static void main(String[] args) {
		int[] nums1 = {1,2};
		int[] nums2 = {3,4};
		double result = solutionBySelf(nums1,nums2);
		System.out.println(result);
	}

	/**
	 *
	 * @param nums1
	 * @param nums2
	 * @return
	 */
	private static double solutionBySelf(int[] nums1, int[] nums2) {
		int n = nums1.length;
		int m = nums2.length;
		int[] nums = new int[n + m];
		int i = 0;
		int j = 0;
		int count = 0;
		while ( i < n && j < m) {
			if (nums1[i] < nums2[j]) {
				nums[count++] = nums1[i++];
			} else {
				nums[count++] = nums2[j++];
			}
		}
		while (i < n){
			nums[count++] = nums1[i++];
		}

		while (j < m){
			nums[count++] = nums2[j++];
		}

		double result = 0.0;
		if (nums.length % 2 ==0){
			result = (nums[nums.length / 2] + nums[nums.length / 2 - 1]) / 2.0;
		}else {
			result =  nums[(nums.length - 1) / 2] * 1.0;
		}
		return result;
	}

	/**
	 * 问题转化：求有序数组的第k小数
	 * @param nums1
	 * @param nums2
	 * @return
	 */
	private static double solution(int[] nums1, int[] nums2) {

		return 0;
	}
}
