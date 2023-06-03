class Solution {
    public int search(int[] nums, int target) {
    int left = 0, right = nums.length - 1, mid;
    while (left <= right) {
        mid = (right - left) / 2 + left;
        if (nums[mid] == target)
        {
            return mid;
        } 
        else if (nums[mid] > target)
        {
            if (nums[mid] > nums[right] && nums[left] >target) 
            {
                left = mid + 1;
            } else
            {
                right = mid - 1;
            }
        } 
        else 
        {
            if (nums[mid] < nums[left] && nums[left] <=target)
            {
                right = mid - 1;
            } else 
            {
                left = mid + 1;
            }
        }
    }
    return -1;

    }
}