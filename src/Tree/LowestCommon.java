class LowestCommonAncestor {
    public TreeNode solution(TreeNode root, TreeNode p, TreeNode q) {
        // 如果树为空，直接返回null
        if(root == null) 
            return null; 

        // 如果p和q中有等于root的，那么它们的最近公共祖先即为root（一个节点也可以是它自己的祖先）
        if(root == p || root == q) 
            return root; 

        // 递归遍历左子树，只要在左子树中找到了p或q，则先找到谁就返回谁    
        TreeNode left = solution(root.left, p, q); 

        // 递归遍历右子树，只要在右子树中找到了p或q，则先找到谁就返回谁
        TreeNode right = solution(root.right, p, q); 

        if(left == null)
            // 如果在左子树中p和q都找不到，则p和q一定都在右子树中，右子树中先遍历到的那个就是最近公共祖先（一个节点也可以是它自己的祖先）
             return right; 
        else if(right == null)
            // 如果left不为空，在左子树中有找到节点（p或q），这时候要再判断一下右子树中的情况，如果在右子树中，p和q都找不到，则 p和q一定都在左子树中，左子树中先遍历到的那个就是最近公共祖先（一个节点也可以是它自己的祖先）
            return left; 
        else 
            // 当left和right均不为空时，说明p、q节点分别在root异侧, 最近公共祖先即为root
            return root; 
    }
}
