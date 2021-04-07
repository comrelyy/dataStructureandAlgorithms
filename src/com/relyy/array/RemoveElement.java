package com.relyy.array;

/**
 * 1 给定一个数组 nums 和一个值 val，你需要原地移除所有数值等于 val 的元素，返回移除后数组的新长度。
 *
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 *
 * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 *
 * 示例 1:
 *
 * 给定 nums = [3,2,2,3], val = 3,
 *
 * 函数应该返回新的长度 2, 并且 nums 中的前两个元素均为 2。
 *
 * 你不需要考虑数组中超出新长度后面的元素。
 *
 */
public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {2,2,2};//{2,1,2};//{0,1,2,2,3,0,4,2};
        int val = 2;

        //int lastNotVal = getLastNotVal1(nums, val);
        int lastNotVal = getLastNotVal2(nums,val);

        for (int i = 0; i < lastNotVal; i++) {
            System.out.println(nums[i]);
        }
    }

    /**第一题解法 开始**/
    private static int getLastNotVal1(int[] nums, int val) {
        int lastNotVal = 0;
        for(int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                if (nums[lastNotVal] == val) {
                    nums[lastNotVal] = nums[i];
                    nums[i] = val;
                }
                lastNotVal++;
            }
        }
        return lastNotVal;
    }

    private static int getLastNotVal2(int[] nums, int val) {
        int lastNotVal = nums.length;
        int i = 0;
       while (i < lastNotVal){
           if(nums[i] == val){
               nums[i] = nums[lastNotVal-1];
               lastNotVal--;
               /**这里i并没有变化*/
           }else {
               i++;
           }
       }
        return lastNotVal;
    }
    /**第一题解法 结束**/

}
