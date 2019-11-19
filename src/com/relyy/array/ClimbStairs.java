package com.relyy.array;

import java.util.ArrayList;
import java.util.List;

/**
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 *
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 *
 * 注意：给定 n 是一个正整数。
 *
 * 示例 1：
 *
 * 输入： 2
 * 输出： 2
 * 解释： 有两种方法可以爬到楼顶。
 * 1.  1 阶 + 1 阶
 * 2.  2 阶
 * 示例 2：
 *
 * 输入： 3
 * 输出： 3
 * 解释： 有三种方法可以爬到楼顶。
 * 1.  1 阶 + 1 阶 + 1 阶
 * 2.  1 阶 + 2 阶
 * 3.  2 阶 + 1 阶
 *
 */
public class ClimbStairs {

    public static void main(String[] args) {
        int result = solution(45);
        System.out.println(result);
    }

    private static int solution(int n) {
        int[] arr = new int[n + 1];

        return climb(n,arr);
    }

    private static int climb(int n, int[] arr) {
        if (n < 3 ) return n;
        if (arr[n] == 0){
            arr[n] = climb(n-1,arr) + climb(n-2,arr);
        }
        return arr[n];
    }
}
