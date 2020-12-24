package String;

class ReverseWords {
    public String solution(String s) {
        /*
         * 利用双指针
         * 先删除首尾空格
         * 从右向左搜索空格
         * 搜索到首个空格代表最后一个单词出现
         * 跳过单词之间的空格
         *
         */
        s = s.trim(); // 删除首尾空格
        int j = s.length() - 1
        int i = j;
        StringBuilder res = new StringBuilder();
        while(i >= 0) {
            while(i >= 0 && s.charAt(i) != ' ') 
              i--; // 搜索首个空格
            res.append(s.substring(i + 1, j + 1) + " "); // 添加单词
            while(i >= 0 && s.charAt(i) == ' ') 
              i--; // 跳过单词间空格
            j = i; // j 指向下个单词的尾字符
        }
        return res.toString().trim(); // 转化为字符串并返回
    }
}

