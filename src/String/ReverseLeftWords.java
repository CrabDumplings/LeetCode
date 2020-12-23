package String;

public class ReverseLeftWords{

  /**
   * 第一种
   * 字符串切片函数
   */
  public void solutionOne(String s, int n){
    return s.substring(n, s.length()) + s.substring(0, n);
  }
  
   /**
   * 第二种
   * 字符串切片函数
   */
  public void solutionTwo(String s, int n){
    //定义一个StringBuilder
    StringBuilder res = new StringBuilder();
    //添加第n + 1位到最后一位字符
    for(int i = n; i < s.length(); i++)
      res.append(s.charAt(i));
    //添加第1位到第n位字符
    for(int i = 0; i < n; i++)
      res.append(s.charAt(i));
    return res.toString();
  }
}
