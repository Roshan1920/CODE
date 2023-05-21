class Solution {
    public void rotate(int[] nums, int k) {
        int n= nums.length;
        k= k%n;
        
        reverseArr(nums,0,n-1);
        reverseArr(nums,0,k-1);
        reverseArr(nums,k,n-1);
    }
    static void reverseArr(int[] nums,int s, int e)
    {
        
        
        for(int i=s,j=e;i<j;i++,j--)
        {
          int temp= nums[i];
          nums[i]= nums[j];
          nums[j]= temp;
        }
    }
}
