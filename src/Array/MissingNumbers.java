package Array;

public class MissNum {
    public int solutionOne(int nums[]){
        /*
        * 比较下角标i是否等于num[i]
        * */
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != i){
                return i;
            }
        }
        return nums.length;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 2, 3, 4, 7, 8, 9};

        MissNum missNum = new MissNum();
        int one = missNum.solutionOne(nums);
        System.out.println(one);

        int two = missNum.solutionTwo(nums);
        System.out.println(two);
    }

    public int solutionTwo(int nums[]){
        /*
        * 排序数组中的搜索问题-----》二分法
        * 将num[i] = i化为左子树，num[i] != i化为右子树
        * 左边界为i，右边界为j
        * 中点 m = (i + j) / 2
        * 右子树第一个元素的索引为缺失的数字
        * */

        int i= 0;//左边界
        int j = nums.length - 1;

        while(i <= j){
            int m = (i + j)/2;
            if(nums[m] == m){
                i = m + 1;
            }else{
                j = m - 1;
            }
        }
        return i;
    }
}
