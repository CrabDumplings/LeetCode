/* 
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级台阶
 * 青蛙可以从第n-1阶台阶跳一级来到第n阶，也可以第n-2阶台阶跳两级来到第n阶台阶
 *
 *
 */


public class FrogJumpsTheStep {
    public int solution(int n) {
        // 没有台阶或者只有一个台阶
        if (n == 0 || n == 1) {
            return 1;
        }
        
        //pre保存f(n-2)，cur保存f(n-1)
        int pre = 1, cur = 2;
        for (int i = 3; i <= n; i++) {
            int tmp = (pre + cur) % 1000000007;
            pre = cur;
            cur = tmp;
        }
        return cur;
    }
}
