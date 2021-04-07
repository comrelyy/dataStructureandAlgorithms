package com.relyy.array;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * @Description
 *     1最大盛水量
 *    2直方图的水量
 * 输入: [0,1,0,2,1,0,1,3,2,1,2,1]
 * 输出: 6
 *
 * ^
 * |
 * |
 * |
 * |                  |
 * |       |          |  |     |
 * |   |   |  |    |  |  |  |  |  |
 * ————————————————————————————————————————>
 *   0 1 2 3 4 5  6  7  8  9  10 11
 *
 * @Created by cairuirui
 * @Date 2021/4/2
 */
public class Trap {

	public static void main(String[] args) {
			int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};

		//int[] arr = {1,1};
		System.out.println(byStack(arr));
		//System.out.println(solution2(arr));
	}

	/**
	 * 求最大面积
	 * @param arr
	 * @return
	 */
	public static int solution1(int[] arr){

		int result = 0;
		int head = 0;
		int tail = arr.length-1;
		while (head < tail){
			int square = Math.min(arr[head], arr[tail]) * (tail - head) ;
			if (square > result){
				result = square;
			}
			if (arr[head] > arr[tail]){
				tail --;
			}else {
				head ++;
			}
		}
		return result;
	}

	/**
	 * 自己根据提示想出来的办法，可以通过，但是时间效率提交通不过
	 * @param arr
	 * @return
	 */
	public static int solution2(int[] arr){
		int result = 0;

		int maxIndex = getMaxValueIndex(0,arr.length,arr);
		int leftMax = maxIndex;
		while (leftMax > 1){
			int leftMax_tmp = getMaxValueIndex(0,leftMax,arr);
			if ((leftMax - leftMax_tmp) > 1){
				for (int i = leftMax_tmp + 1; i < leftMax; i++){
					result += (arr[leftMax_tmp] - arr[i]);
				}
			}
			leftMax = leftMax_tmp;
		}
		int rigrtMax = maxIndex;
		while (rigrtMax < (arr.length - 2)){
			int rigrtMax_tmp = getMaxValueIndex(rigrtMax + 1,arr.length,arr);
			if ((rigrtMax_tmp - rigrtMax) > 1){
				for (int i = rigrtMax + 1; i < rigrtMax_tmp; i++){
					result += (arr[rigrtMax_tmp] - arr[i]);
				}
			}
			rigrtMax = rigrtMax_tmp;
		}

		return result;
	}

	private static int getMaxValueIndex(int left, int right, int[] arr) {
		int max = 0;
		for (int i = left; i < right; i++) {
			if (arr[i] > arr[max]){
				max = i;
			}
		}
		return max;
	}

	/**
	 * 单调栈
	 */
	public static int byStack(int[] arr){
		int result = 0;
		LinkedList<Integer> list = new LinkedList<>();
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			while (!list.isEmpty() && arr[i] > list.peek()){
				int top = list.pop();
				if (list.isEmpty()) break;
				Integer peek = list.peek();

			}
			list.push(i);
		}
		return result;
	}
}
