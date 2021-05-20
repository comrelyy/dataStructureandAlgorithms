package com.relyy.array;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description 无重复字符的最长子串长度
 * @Created by cairuirui
 * @Date 2021/5/17
 */
public class LongestSubstring {

	public static void main(String[] args) {
		System.out.println(solution("abcabcbb"));
	}

	/**
	 * 滑动窗口的解法
	 * @param s
	 * @return
	 */
	public static int solution(String s){
		int result = 0;
		if(null == s || s.length() == 0){
			return result;
		}
		Map<Character, Integer> map = new HashMap<>();
		int length = s.length();
		int left = 0;
		for (int i = 0; i < length; i++) {
			Integer value = map.getOrDefault(s.charAt(i), -1);
			if (value.equals(-1)){

			}else {
				if (value >= left) {
					left = value + 1;
				}
			}
			result = Math.max(i-left+1,result);
			map.put(s.charAt(i),i);
		}
		return result;
	}
}
