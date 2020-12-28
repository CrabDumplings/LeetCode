/**
 * 数组是有序的，那么重复的元素一定会相邻
 * 删除重复元素，实际上就是将不重复的元素移到数组的左侧
 * 用2个指针，一个在前记作i，一个在后记作j
 */

class RemoveDuplicates {
    public int solutuion(int[] nums) {
        int i=0
        int j=1;
        while(j<nums.length){
          //相等，j后移1位
          if(nums[i] == nums[j]){
            j++;
          }else{
            //不相等，将j位置的元素复制到 i+1 位置上，i 后移一位，j 后移 1 位
            nums[++i] = nums[j];
          }
       }
        return i+1;
    }
}
