package org.usc.edu;

//https://leetcode.com/problems/search-insert-position/
public class InsertPos {
    public int searchInsert(int[] nums, int target) {
        if(nums.length==0 || target == 0){
            return 0;
        }//if end
        int i=0;
        for(i=0;i<nums.length;i++){
            if(nums[i]==target){
                break;
            }
            else{
                if(nums[i] > target){
                    break;
                }//end inside if
            }//end else
        }//end for
        return i;
    }
}