package Array;

/*
* 统计一个数字在排序数组中出现的次数。
*/
public class NumberOfNumbersFound {

    /* 方法一：
     * 查找数字target，所有的target看成一个窗口
     * 搜索问题----》二分法
     * left：左边界
     * right：右边界
     * target数量a = right - left -1
     * */
    public int findOne(int[] nums, int target) {
        /*
         * 1. left = 0， right = num.length -1
         * 2. 计算数组的中间位置：i = (right + left)/2
         * 3. 若中间的数字小于target，target在[n + 1, j]中，i = n + 1
         *    若中间的数字大于target，target在[i, n - 1]中，j = n - 1
         *    若中间的数字等于target，right在[n + 1, j]中，left在[i, n - 1]中
         * 4. 查找到左右边界（两次二分），a = right - left -1
         * */

        //寻找右边界
        int i = 0;
        int j = nums.length - 1;
        while (i <= j) {
            //中间位置i
            int n = (i + j) / 2;
            if (nums[n] <= target)
                i = n + 1;
            else
                j = n - 1;
        }
        int right = i;

        //没有target，返回
        if (j >= 0 && nums[j] != target) {
            return 0;
        }

        //寻找左边界
        i = 0;
        j = nums.length - 1;
        while (i <= j) {
            int n = (i + j) / 2;
            if (nums[n] < target)
                i = n + 1;
            else
                j = n - 1;
        }
        int left = j;
        return right - left - 1;
    }

    public static void main(String[] args) {
        NumberOfNumbersFound numberOfNumbersFound = new NumberOfNumbersFound();
        int target = 8;
        int[] nums = new int[]{5, 7, 8, 8, 8, 9};
        int one = numberOfNumbersFound.findOne(nums, target);
        System.out.println(one);

        FindTwo findTwo = new FindTwo();
        int search = findTwo.search(nums, target);
        System.out.println(search);

    }
}


class FindTwo{
    int helper(int[] nums, int target){
        int i = 0;
        int j = nums.length - 1;
        while (i <= j) {
            //中间位置i
            int n = (i + j) / 2;
            if (nums[n] <= target)
                i = n + 1;
            else
                j = n - 1;
        }
        return i;
    }

    public int search(int[] nums, int target){
        int i = helper(nums, target);
        int j = helper(nums, target - 1);
        int a = i - j;
        return a;
    }
}
