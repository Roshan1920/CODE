class Solution {
    public int majorityElement(int[] nums) {
     
        int count=0;
        int curr=0;
        //count to keep  track of the count of the current majority element
        //curr to variable stores the current majority element candidate.
        for(int i=0;i<nums.length;i++){
            if(count==0){
                curr=nums[i];
            }
            
            if(nums[i]==curr){
                count++;
                // increment the count variable because we found another occurrence of the candidate majority element.
            }
            else{
                count--;
                //nums[i] is not equal to curr , decrement the count variable because we have found a different element.
            }
        }
        return curr;
        //return the value of curr as the majority element.
    
    }
}