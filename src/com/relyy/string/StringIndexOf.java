package com.relyy.string;

/**
 * @Description
 * 实现 strStr() 函数。
 *
 * 给你两个字符串 haystack 和 needle ，
 * 请你在 haystack 字符串中找出 needle 字符串出现的第一个位置（下标从 0 开始）。
 * 如果不存在，则返回  -1 。如果needle 字符串为空则返回0；
 * @Created by cairuirui
 * @Date 2021/4/20
 */
public class StringIndexOf {

	public static void main(String[] args) {
		String haystack = "aaaaa", needle = "bba";
		System.out.println(solution(haystack,needle));
	}

	public static int solution(String haystack, String needle){
		int index = -1;
		if (haystack.length() == 0){
			index = -1;
		}
		if (needle.length() == 0) {
			index = 0;
		}
		if (haystack.length() > 0 && needle.length() > 0){
			char[] haystackChars = haystack.toCharArray();
			char[] needleChars = needle.toCharArray();
			int haystackLength = haystack.length();
			int needleLength = needle.length();
			char firstChar = needleChars[0];
			char lastChar = needleChars[needleLength - 1];
			int first = 0;
			int last = needleLength - 1;
			while (last < haystackLength){
				while (haystackChars[first] != firstChar){
					first ++;
					last ++;
					if (last >= haystackLength) break;
				}
				if (last >= haystackLength) break;
				while (haystackChars[last] != lastChar){
					first ++;
					last ++;
					if (last >= haystackLength) break;
				}
				if (last >= haystackLength) break;
				for (int i = 1; i < needleLength - 1; i++){
					if (haystackChars[first + i] != needleChars[i]) {
						first ++;
						last ++;
						break;
					}
				}

				index = first;
				break;
			}
		}
		return index;
	}
}
