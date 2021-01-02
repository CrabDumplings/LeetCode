class MirrorTree {

    // 递归遍历二叉树，交换每个节点的左右子节点
    TreeNode solution(TreeNode root) {
        // 当root为空时，直接返回null 
        if(root == null) return null;
        TreeNode leftRoot = mirrorTree(root.right);
        TreeNode rightRoot = mirrorTree(root.left);
        root.left = leftRoot;
        root.right = rightRoot;
        return root;
    }
}
