package com.relyy.array;

/**
 * @Description
 * 给你一个整数数组 nums 和两个整数 k 和 t 。
 * 请你判断是否存在 两个不同下标 i 和 j，使得 abs(nums[i] - nums[j]) <= t ,
 * 同时又满足 abs(i - j) <= k 。
 *  0 <= nums.length <= 2 * 10^4
 * -2^31 <= nums[i] <= 2^31 - 1
 * 0 <= k <= 10^4
 * 0 <= t <= 2^31 - 1

 * @Created by cairuirui
 * @Date 2021/4/18
 */
public class ContainsNearbyAlmostDuplicate {

	public static void main(String[] args) {
		int[] arr = {2147483646,2147483647};
		int k = 3;
		int t = 3;
		System.out.println(solution(arr,k,t));
	}

	/**
	 * 执行时间超过要求
	 * @param arr
	 * @param k
	 * @param t
	 * @return
	 */
	public static boolean solution(int[] arr,int k,int t){
		if (k <= 0) return false;
		if (arr.length == 1) return false;

		for (int i = 0; i < arr.length; i++){
			int j = 1;
			while (j <= k){
				int lowNum = i - j;
				int highNum = i + j;

				if (lowNum >= 0){
					if (Math.abs((long)arr[i] -(long)arr[lowNum]) <= (long)t){
						System.out.println(lowNum + ":" + i);
						return true;
					}
				}
				if (highNum < arr.length){
					if (Math.abs((long)arr[i] -(long)arr[highNum]) <= (long)t){
						System.out.println(highNum + ":" + i);
						return true;
					}
				}
				j++;
			}
		}
		return false;
	}
}
