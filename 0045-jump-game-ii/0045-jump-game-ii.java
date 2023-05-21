class Solution {
    public int jump(int[] nums) {
        int jump=0;
        int pos= 0;
        int des = 0;
        
        for(int i=0;i<nums.length-1;i++)
        {
            //no need to check last element
            
            des= Math.max(des,nums[i]+i);
            
            if(pos==i){
              pos=des;
                jump++;
            }
       
        }
         return jump;

    }
}
