class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        
        int n= nums.length;
        int a= nums[0]*nums[1];
        int b=nums[n-2]*nums[n-1];
        int c= b-a;
        return c;
    }
}