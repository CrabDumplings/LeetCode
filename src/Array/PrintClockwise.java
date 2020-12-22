package Array;

import java.util.Arrays;

public class PrintClockwise {
    /*
    *
    * 顺时针打印矩阵：循环“从左到右，从上到下，从右到左，从下到上”的顺序
    * 左：l      右：r        上：t        下：b
    * 1. 将元素按顺序添加到打印的列表尾部
    * 2. 边界向内收缩1
    * 3. 边界相遇，打印完毕
    *
    * 边界收缩：上边界---》l + 1
    *         下边界---》b - 1
    *         左边界---》l + 1
    *         右边界---》r - 1
    *
    * */
    public int[] print(int[][] matrix){
        //1. 先判断二维矩阵是否为空
        if(matrix.length == 0){
            return new int[0];
        }

        //2. 设四个边界l，r，t，b
        int l = 0;//左边界
        int t = 0;//上边界
        int r = matrix[0].length - 1;//右边界
        int b = matrix.length - 1;//下边界

        //3. 设数组res存储打印的值，其大小为二维数组的数字个数
        int x = 0;
        int[] res = new int[(matrix[0].length) * (matrix.length)];
        //int[] res = new int[(r + 1) * (b + 1)]

        //4. 循环遍历
        while(true){
            //从左到右
            for (int i = l; i <= r; i++) {
                res[x++] = matrix[t][i];
            }
            //如果上边界t大于下边界b，退出
            if(++t > b)
                break;

            //从上到下
            for (int i = t; i <= b; i++) {
                res[x++] = matrix[i][r];
            }
            if(--r < l)
                break;

            //从右到左
            for (int i = r; i >= l ; i--) {
                res[x++] = matrix[b][i];
            }
            if(--b < t)
                break;

            //从下到上
            for (int i = b; i >= t ; i--) {
                res[x++] = matrix[i][l];
            }
            if(++l > r)
                break;
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1,2,3}, {4,5,6}, {7,8,9}};
        PrintClockwise printClockwise = new PrintClockwise();
        int[] print = printClockwise.print(matrix);
        System.out.println(Arrays.toString(print));
    }
}
