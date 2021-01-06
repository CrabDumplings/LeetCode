class MajorityElement {
    public int solution(int[] nums) {
        // 票数统计 votes = 0 ， 众数 x
        int x = 0;
        int votes = 0;
        // 当votes = 0 ，假设当前数字 num 是众数
        for(int num : nums){
            if(votes == 0) 
              x = num;
            if(num == x){
              // num = x 时，票数 votes 自增 1 
              num = 1;
            }else{
              // num != x 时，票数 votes 自减 1
              num = -1;
            }
            votes += num;
        }
        return x;
    }
}
