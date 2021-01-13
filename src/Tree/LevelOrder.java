class LevelOrder {
    // 借助队列的先入先出特性来实现
    public int[] solution(TreeNode root) {
        // 当树的根节点为空，则直接返回空列表
        if(root == null) 
          return new int[0];
          
        Queue<TreeNode> queue = new LinkedList<>(){{ add(root); }};
        ArrayList<Integer> ans = new ArrayList<>();
        while(!queue.isEmpty()) {
            TreeNode node = queue.poll();
            ans.add(node.val);
            //  若node 的左（右）子节点不为空，则将左（右）子节点加入队列 queue
            if(node.left != null) queue.add(node.left);
            if(node.right != null) queue.add(node.right);
        }
        int[] res = new int[ans.size()];
        for(int i = 0; i < ans.size(); i++)
            res[i] = ans.get(i);
        return res;
    }
}
