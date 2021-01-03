class KthLargest {
    // 转化为求 “此树的中序遍历倒序的第k个节点”
    // 递归遍历时计数，统计当前节点的序号
    // 递归到第k个节点时，应记录结果res
    
    // 中序遍历 + 提前返回
    
    int res;
    int k;
    public int solution(TreeNode root, int k) {
        this.k = k;
        dfs(root);
        return res;
    }
    
    // 中序遍历的倒序 为 “右、根、左” 顺序
    void dfs(TreeNode root) {
        if(root == null) return;
        dfs(root.right);
        if(k == 0) return;
        if(--k == 0) res = root.val;
        dfs(root.left);
    }
}
