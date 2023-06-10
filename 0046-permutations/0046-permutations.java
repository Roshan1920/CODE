class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(nums, 0, ans);
        return ans;
    }

    private void helper(int[] nums, int index, List<List<Integer>> ans) {
        if(index >= nums.length) {
            List<Integer> list = new ArrayList<>();
            for(int n : nums) {
                list.add(n);
            }
            ans.add(new ArrayList<>(list));
            return;
        }

        for(int i = index; i < nums.length; i++) {
            swap(nums, index, i);
            helper(nums, index + 1, ans);
            swap(nums, index, i);
        }
    }

    private void swap(int[] arr, int ind1, int ind2) {
        int temp = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2]  = temp;
    }
}