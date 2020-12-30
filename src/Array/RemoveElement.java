class RemoveElement {
    public int solutionOne(int[] nums, int val) {
        int ans = 0;
        for(int num: nums) {
            if(num != val) {
                nums[ans] = num;
                ans++;
            }
        }
        return ans;
    }
    
    /*
     * 遍历数组 nums
     * 如果出现数字与需要移除的值不相同时，则i自增1，继续下一次遍历
     * 相同的时候，将 nums[i]与nums[ans-1] 交换
     */
    public int solutionTwo(int[] nums, int val) {
        int ans = nums.length;
        for (int i = 0; i < ans;) {
            if (nums[i] == val) {
                nums[i] = nums[ans - 1];
                ans--;
            } else {
                i++;
            }
        }
        return ans;
    }
}
