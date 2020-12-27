class MoveZeroes {
    // 设置一个index，表示非0数的个数
    // 循环遍历数组0
    // 如果不是0，将非0值移动到第index位置,然后index + 1
    // 遍历结束之后，index值表示为非0的个数
    // 再次遍历，从index位置后的位置此时都应该为0
    public void solution(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return;
        }
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }

        for (int i = index; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
