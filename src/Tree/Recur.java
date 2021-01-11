class Recur {
    /**
      * 树的深度 等于左子树的深度与右子树的深度中的最大值+1
      * 对二叉树做后序遍历
      */
    public boolean isBalanced(TreeNode root) {
        return solution(root) != -1;
    }

    // left，right记录root左右子节点的深度
    private int solution(TreeNode root) {
        // 后序遍历
        // 遍历二叉树的每个节点,先左子树，再右子树，最后根节点
        if (root == null) 
          // 返回其深度0
          return 0;
        // 底朝上遍历
        int left = solution(root.left);
        // 节点的深度为-1，则进行剪枝，开始向上返回，之后的迭代不再进行
        if(left == -1) 
          return -1;
        int right = solution(root.right);
        if(right == -1) 
          return -1;
        // 最开始计算的是左子树最左侧的一个叶节点，其左右子节点不存在，left=0，right=0，满足条件，返回该叶节点的深度max(0,0)+1=1;
        return Math.abs(left - right) < 2 ? Math.max(left, right) + 1 : -1;
    }
}
