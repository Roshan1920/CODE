/*class Solution {
         public int maxSubArray(int[] nums) {
       
        int max = Integer.MIN_VALUE;
        
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++)
            {
                int sum=0;
                for(int k=i;k<=j;k++)
                {
                    sum = sum+nums[k];
                }
                 max= Math.max(sum,max);
            }
           
        }
        
        return max;
    }
    
}*/

class Solution {
         public int maxSubArray(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE, sum = 0;
        
        for(int i=0;i<n;i++){
            sum += nums[i];
            max = Math.max(sum,max);
            
            if(sum<0) sum = 0;
        }
        
        return max;
    }
    
}