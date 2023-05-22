class Solution {
    public void nextPermutation(int[] nums) {
        
     int n= nums.length;
     int k= n-2;
        
    // check for null
     if(nums.length == 0 || nums== null) return;
    
    //find k 3 1 4 2
        
    for(int i=n-1;i>0;i--)
     {
       if(nums[i]<=nums[i-1])k--;
        else{
        break;
     }
    }
        
        //if k==-1 reverse
        if(k==-1){
              reverse(nums,0,n-1);
            return;
            }
        
        //else replace k with next greater element reverse
        for(int i=n-1;i>0;i--)
        {
          if(nums[i]>nums[k])
            {
            int temp = nums[k];
            nums[k] = nums[i];
            nums[i]= temp;
            break;
         }
        }
        reverse(nums,k+1,n-1);
    }
    
    void reverse(int[] nums, int start, int end)
    {
        while(start<end){
           int temp= nums[start];
            nums[start]= nums[end];
            nums[end] = temp;
            start++;
            end--;
            
        }
}
}