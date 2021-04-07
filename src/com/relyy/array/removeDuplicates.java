package com.relyy.array;

/**
 * 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 *
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 *
 * 示例 1:
 *
 * 给定数组 nums = [1,1,2],
 *
 * 函数应该返回新的长度 2, 并且原数组 nums 的前两个元素被修改为 1, 2。
 *
 * 你不需要考虑数组中超出新长度后面的元素。
 *
 * 给定一个有序（升序）数组 nums 请你原地删除重复出现的元素，使每个元素最多出现两次 ，返回删除后数组的新长度
 *  * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 *  * nums = [0,0,1,1,1,1,2,3,3]
 *
 */
public class removeDuplicates {

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,1,2,3,3};
        //int[] nums = {1,1,1,1,2,2,3};

        //int newArrayIndex = reserve1(nums);
        int newArrayIndex = reserve2(nums);
        System.out.println(newArrayIndex);
        for (int i = 0; i < newArrayIndex ; i++) {
            System.out.println(nums[i]);
        }
    }

    public static int reserve1(int nums[]){
        int current = 0;
        int forword = 1;
        int newArrayIndex = 0;
        while (current <= forword && forword < nums.length){
            if (nums[current] == nums[forword]){
                forword++;
                continue;
            }

            newArrayIndex++;
            nums[newArrayIndex] = nums[forword];
            current = forword;
            forword ++;
        }
        return ++newArrayIndex;
    }

    public static int reserve2(int nums[]){
        int current = 0;
        int forword = 1;
        int newArrayIndex = 0;
        int count = 0;
        while (current <= forword && forword < nums.length){
            if (nums[current] == nums[forword]){
                count++;
                if (count == 1){
                    nums[++newArrayIndex] = nums[forword];
                }
                forword++;
                continue;
            }

            nums[++newArrayIndex] = nums[forword];
            current = forword;
            forword ++;
            count = 0;

        }
        return ++newArrayIndex;
    }
}
