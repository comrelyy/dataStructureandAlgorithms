package com.relyy.array;

/**
 * @Description
 * 丑数，除了自己和1 以外的质因数只有2，3，5
 * 1 给定一个数，判断是不是丑数
 * 2 给定一个整数n,请找出并返回第n个丑数
 * @Created by cairuirui
 * @Date 2021/4/12
 */
public class FindUglyNum {
	public static void main(String[] args) {
		System.out.println(solution1(0));
	}


	public static boolean solution1(int num){
		if (num < 1) return false;
		if (num == 1) return true;

		while (true) {
			while (num % 2 == 0) num /= 2;
			while (num % 3 == 0) num /= 3;
			while (num % 5 == 0) num /= 5;
			if (num == 1) {
				return true;
			}else {
				return false;
			}
		}
	}
}
