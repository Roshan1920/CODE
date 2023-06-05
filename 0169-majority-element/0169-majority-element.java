class Solution {
    public int majorityElement(int[] nums) {
     
        int count=0;
        int a=0;
        for(int i=0;i<nums.length;i++){
            if(count==0){
                a=nums[i];
            }
            
            if(nums[i]==a){
                count++;
            }
            else{
                count--;
            }
        }
        return a;
    
    }
}