package one;

/*
 * n是传入进来的二进制数
 * n != 0 是循环条件，n为0时，则已经逐位判断结束
 * res += n & 1
 * 若此位上的数字为0，0 & 1 = 0，res不变；
 * 若此位上的数字为1，1 & 1 = 1，res加1；
 * n >>>= 1，将数字n无符号右移
 * */

public class NumberOf1InBinary {
    public int num(int n){
        int res = 0;
        while(n != 0){
            res += n & 1;
            n >>>= 1;
        }
        return res;
    }

    public static void main(String[] args) {
        int i = 0000010111101;
        NumberOf1InBinary numberOf1InBinary = new NumberOf1InBinary();
        int num1 = numberOf1InBinary.num(i);
        System.out.println(num1);

        int num2 = numberOf1InBinary.hammingWeight(i);
        System.out.println(num2);
    }

    /*
     * n是传入进来的二进制数
     * n != 0 是循环条件
     * n & (n - 1)：数字n最右边的1变成0，其余不变
     *
     */

    public int hammingWeight(int n) {
        int res = 0;
        while(n != 0){
            res ++;
            n &= (n - 1);
        }
        return res;
    }
}
