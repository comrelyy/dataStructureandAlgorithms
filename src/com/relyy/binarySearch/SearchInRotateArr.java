package com.relyy.binarySearch;

/**
 * @Description
 * 已知存在一个按非降序排列的整数数组 nums ，数组中的值不必互不相同。
 *
 * 在传递给函数之前，nums 在预先未知的某个下标 k（0 <= k < nums.length）上进行了 旋转 ，
 * 使数组变为 [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]]（下标 从 0 开始 计数）。
 * 例如， [0,1,2,4,4,4,5,6,6,7] 在下标 5 处经旋转后可能变为 [4,5,6,6,7,0,1,2,4,4] 。
 * 给你 旋转后 的数组 nums 和一个整数 target ，请你编写一个函数来判断给定的目标值是否存在于数组中。
 * 如果 nums 中存在这个目标值 target ，则返回 true ，否则返回 false 。
 *
 * @Created by cairuirui
 * @Date 2021/4/7
 */
public class SearchInRotateArr {

	public static void main(String[] args) {
		//int[] nums = {2,5,6,0,0,1,2};
		int[] nums = {3,4,5,1,2};
		System.out.println(findMin(nums));
	}

	public static boolean solution(int[] nums,int target){
		if (nums.length == 0) return false;
		int head = 0;
		int tail = nums.length - 1;
		while (head <= tail){
			if (nums[head] > target && nums[tail] < target) return false;
			if (nums[head] == target || nums[tail] == target){
				return true;
			}
			head++;
			tail--;
		}
		return false;
	}

	/**
	 *
	 * @param nums
	 * @return
	 */
	public static int findMin(int[] nums){
		//int result = 0;
		//if (nums.length == 1) return nums[0];
		//if (nums.length == 2) return nums[0] < nums[1] ? nums[0] : nums[1];
		int tail = nums.length - 1;
		if (nums[0] > nums[tail]){
			while (tail > 0){
				if (nums[tail] < nums[tail - 1]) {
					return nums[tail];
				}
				tail--;
			}
		}
		return nums[0];
	}
}
