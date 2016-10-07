package org.usc.edu;
import java.util.*;
import java.lang.*;




public class ArrayRemoval {
    public static int removeElement(int[] nums, int val) {
        int length = nums.length;
        int count=0;
        for (int i=0;i<length;i++)
        {
            if(nums[i] == val)
            {
                nums[i] = 0;
            }
        }
        for (int i=0;i<length;i++)
        {
            if(nums[i] == 0)
            {
                count++;
            }
        }
        count = length - count;
        return count;
        
    }
    public static void main(String[] args)
    {
        int [] arr ={3,2,2,3};
        int k =removeElement(arr,3);
        System.out.println(k);
    }

}