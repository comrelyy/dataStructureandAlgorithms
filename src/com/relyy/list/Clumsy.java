package com.relyy.list;

/**
 * @Description 本阶层
 * clumsy(10) = 10 * 9 / 8 + 7 - 6 * 5 / 4 + 3 - 2 * 1
 * @Created by cairuirui
 * @Date 2021/4/1
 */
public class Clumsy {

	public static void main(String[] args) {
		System.out.println(solution(10000));
	}

	public static int solution(int n){

		int result = 0;
		int s = n / 4;
		int m = n % 4;
		for (int i = 0; i < s ; i++) {
			if (i == 0){
				result += (n * (n-1) / (n - 2) + (n -3));
			}else {
				result -= ((n - (4 * i)) * (n - (4 * i) - 1) / (n - (4 * i) - 2) - (n - (4 * i) - 3));
			}
		}

		int remain = 0;
		if (m == 3){
			remain = 6;
		}else if (m == 2){
			remain = 2;
		}else if (m == 1){
			remain = 1;
		}

		return s > 0 ? result - remain : remain;
	}
}
