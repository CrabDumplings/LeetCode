class MaxDepth {

    // 后序遍历（DFS)
    // 左子树的深 与右子树的深度中的最大值+1 
    int solutionOne(TreeNode root) {
        if(root == null) return 0;
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
    
    
    // 层序遍历（BFS）
    // 每遍历一层，则计数器+1 ，直到遍历完成，则可得到树的深度。
    int solutionTwo(TreeNode root) {
        // 当root为空，直接返回深度0 
        if(root == null) return 0;
        List<TreeNode> queue = new LinkedList<>() {{ add(root); }}, tmp;
        int res = 0;
        
        // 当queue为空时跳出
        // 初始化一个空列表tmp，用于临时存储下一层节点
        // 遍历 queue 中的各节点 node ，并将其左子节点和右子节点加入 tmp
        // 执行 queue = tmp ，将下一层节点赋值给 queue
        // 统计层数： 执行 res += 1 ，代表层数加 11
        while(!queue.isEmpty()) {
            tmp = new LinkedList<>();
            for(TreeNode node : queue) {
                if(node.left != null) tmp.add(node.left);
                if(node.right != null) tmp.add(node.right);
            }
            queue = tmp;
            res++;
        }
        return res;
}

