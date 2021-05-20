package com.relyy.array;

/**
 * @Description 输入一个整型数组，数组中的一个或连续多个整数组成一个子数组。
 * 求所有子数组的和的最大值。要求时间复杂度为O(n)。
 * 输入: nums = [-2,1,-3,4,-1,2,1,-5,4]
 * 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 * @Created by cairuirui
 * @Date 2021/5/13
 */
public class MaxSubArray {

	public static void main(String[] args) {
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(solution(nums));
	}

	public static int solution(int[] arr){
		int result = arr[0];
		int length = arr.length;
		if (length == 1){
			return result;
		}

		int former = 0;
		int form = 0;
		int end = 0;
		for (int i = 0; i < length; i++) {
			int temp = arr[i];
			if (former > 0){
				temp += former;
			}
			if (temp > result){
				result = temp;
			}
			former = temp;
		}
		System.out.println("from:"+form+"::"+"end:"+end);
		return result;
	}
}
