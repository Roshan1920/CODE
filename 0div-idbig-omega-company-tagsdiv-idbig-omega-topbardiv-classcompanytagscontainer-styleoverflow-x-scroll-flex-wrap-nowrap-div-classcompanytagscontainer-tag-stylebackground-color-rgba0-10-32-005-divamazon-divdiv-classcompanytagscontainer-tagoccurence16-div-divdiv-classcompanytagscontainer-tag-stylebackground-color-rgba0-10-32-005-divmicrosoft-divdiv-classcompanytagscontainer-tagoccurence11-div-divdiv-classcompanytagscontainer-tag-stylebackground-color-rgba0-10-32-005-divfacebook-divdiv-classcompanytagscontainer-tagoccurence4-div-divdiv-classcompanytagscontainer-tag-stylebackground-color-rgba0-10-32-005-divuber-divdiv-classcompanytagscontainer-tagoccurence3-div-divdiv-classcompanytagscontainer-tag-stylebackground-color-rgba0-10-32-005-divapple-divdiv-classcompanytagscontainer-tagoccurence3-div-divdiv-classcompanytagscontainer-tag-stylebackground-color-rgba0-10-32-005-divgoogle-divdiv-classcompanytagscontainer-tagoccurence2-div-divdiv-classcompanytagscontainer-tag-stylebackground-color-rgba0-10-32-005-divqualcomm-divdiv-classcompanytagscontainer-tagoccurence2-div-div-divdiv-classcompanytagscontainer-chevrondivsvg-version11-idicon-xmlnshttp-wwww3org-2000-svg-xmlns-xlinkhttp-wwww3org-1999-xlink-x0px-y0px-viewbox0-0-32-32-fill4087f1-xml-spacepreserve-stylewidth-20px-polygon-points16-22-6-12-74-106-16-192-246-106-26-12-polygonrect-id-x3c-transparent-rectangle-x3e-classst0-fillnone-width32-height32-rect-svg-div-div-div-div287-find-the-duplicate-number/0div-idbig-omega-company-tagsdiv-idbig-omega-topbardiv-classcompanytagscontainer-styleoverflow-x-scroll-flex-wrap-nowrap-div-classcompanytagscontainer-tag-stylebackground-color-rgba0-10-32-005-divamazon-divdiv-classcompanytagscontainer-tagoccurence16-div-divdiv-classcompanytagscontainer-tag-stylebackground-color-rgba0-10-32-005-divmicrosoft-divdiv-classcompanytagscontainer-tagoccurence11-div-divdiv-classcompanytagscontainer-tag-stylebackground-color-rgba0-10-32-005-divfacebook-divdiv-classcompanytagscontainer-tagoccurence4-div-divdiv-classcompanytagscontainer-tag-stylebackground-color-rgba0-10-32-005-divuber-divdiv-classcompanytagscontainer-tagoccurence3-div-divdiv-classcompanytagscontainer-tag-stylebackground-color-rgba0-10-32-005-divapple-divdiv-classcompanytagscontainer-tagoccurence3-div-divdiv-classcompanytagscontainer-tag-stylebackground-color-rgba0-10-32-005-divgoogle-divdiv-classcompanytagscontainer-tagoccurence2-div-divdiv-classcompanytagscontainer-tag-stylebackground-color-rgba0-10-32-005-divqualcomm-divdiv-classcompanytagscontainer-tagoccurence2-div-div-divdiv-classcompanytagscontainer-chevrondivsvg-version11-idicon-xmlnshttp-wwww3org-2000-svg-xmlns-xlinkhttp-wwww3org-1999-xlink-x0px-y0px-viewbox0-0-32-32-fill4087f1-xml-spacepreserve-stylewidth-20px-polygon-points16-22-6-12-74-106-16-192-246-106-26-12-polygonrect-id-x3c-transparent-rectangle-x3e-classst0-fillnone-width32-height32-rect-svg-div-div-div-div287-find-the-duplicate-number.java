class Solution {
    public int findDuplicate(int[] nums) {
     for(int i=0;i<nums.length;i++)
     {
       int index = Math.abs(nums[i]);
         //incase index value is negative it eill become positive with abs
         
         if(nums[index]<0) return index;
         // agar dobaaro koi negative hua to sidha return 
         
         nums[index] = -nums[index];
         //
     }
        return -1;
    }
}