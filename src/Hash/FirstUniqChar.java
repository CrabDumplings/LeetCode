class FirstUniqChar {
    /**
      * 遍历字符串 s ，使用哈希表统计各字符数量是否大于1 
      * 再遍历字符串 s ，在哈希表中找到首个数量为1的字符，并返回
      */
    public char solution(String s) {
        HashMap<Character, Boolean> dic = new HashMap<>();
        char[] sc = s.toCharArray();
        
        // 若dic中不包含键c，则向 dic 中添加键值对(c, True) ，代表字符 c 的数量为1
        for(char c : sc)
            dic.put(c, !dic.containsKey(c));
        // 若dic中包含键c ，则修改键c的键值对为(c, False) ，代表字符c 的数量大于1
        for(char c : sc)
            if(dic.get(c)) return c;
            
        // 代表字符串没有数量为1的字符
        return ' ';
    }
}
