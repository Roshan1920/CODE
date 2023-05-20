class Solution {
  public void sortColors(int[] nums) {
    int zero = -1;
    int one = -1;
    int two = -1;

    for (final int num : nums)
      if (num == 0) {
        nums[++two] = 2;
        nums[++one] = 1;
        nums[++zero] = 0;
      } else if (num == 1) {
        nums[++two] = 2;
        nums[++one] = 1;
      } else {
        nums[++two] = 2;
      }
  }
}
/* class Sort012 {
    public void sort(int[] nums)
    {
        int zero =0,one = 0,two=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)zero++;
            if(nums[i]==1)one++;
            if(nums[i]==2)two++;
        }
        for(int i=0;i<zero;i++)nums[i]=0;
        for(int i=zero;i<one+zero;i++)nums[i]=1;
        for(int i=one+zero;i<nums.length;i++)nums[i]=2;
    }
}
*/
