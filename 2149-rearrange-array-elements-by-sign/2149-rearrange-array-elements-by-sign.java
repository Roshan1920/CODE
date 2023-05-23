//EXTRA SPACE USED
//USING TWO POINTER Appr.

class Solution {
    public int[] rearrangeArray(int[] nums) {
         int len = nums.length;
// pos[] aur neg[] 2 new array banayege length /2 size ka, kyuki -ve, +ve equal number mn hai.
        int pos[] = new int[len/2];
        int neg[] = new int[len/2];
        int p=0,n=0;
        for(int i=0; i<len; i++){
            if(nums[i]>=0){
    // if we find a positive number  we will store it in pos[p]
                pos[p]=nums[i];p++;
            } else {
    // if we find a negative number  we will store it in neg[n]
                neg[n]=nums[i];n++;
            }
        }
        p=0;n=0;
        for(int i=0; i<len; i++){
            if(i%2==0){
                nums[i]=pos[p];p++;
    // even inex mein positive ko store kar lenge
            } else {
                nums[i]=neg[n];n++;
     // odd inex mein negative ko store kar lenge
            }
        }
        return nums; 
    }
}