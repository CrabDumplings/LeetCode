class LowestCommonAncestor {
    public TreeNode solution(TreeNode root, TreeNode p, TreeNode q) {
        // root 是p,q的最近公共祖先
        // 节点root为空时跳出
        while(root != null) {
            if(root.val < p.val && root.val < q.val) // p,q 都在 root 的右子树中
                root = root.right;                   // 遍历至右子节点
            else if(root.val > p.val && root.val > q.val) // p,q 都在 root 的左子树中
                root = root.left;                         // 遍历至左子节点
            else break;
        }
        return root;
    }
}
