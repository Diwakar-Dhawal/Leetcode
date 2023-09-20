/*  Q287. Find the Duplicate Number
    Difficulty : Medium
    Problem Statement : Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.There is only one repeated number in nums, return this repeated number.
                        You must solve the problem without modifying the array nums and uses only constant extra space.*/

import java.util.HashSet;

public class Q287 {
    public static void main(String[] args) {
        int [] nums = {1,2,4,6,2,3};
        System.out.println(findDuplicate(nums));
    }
    public static int findDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(set.contains(nums[i]))
                return nums[i];
            else
                set.add(nums[i]);
        }
        return 0;
        
    }
}
