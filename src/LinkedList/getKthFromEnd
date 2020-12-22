package LinkedList;

class Solution {
    public int[] reversePrint(ListNode head) {
        //1. 先创建一个栈
        LinkedList<Integer> stack = new LinkedList<Integer>();
        //2. 遍历链表
        while(head != null){
            stack.addLast(head.val);
            head = head.next;
        }
        //3. 创建一个数组存放
        int[] num = new int[stack.size()];
        for( int i = 0; i < num.length; i++){
            num[i] = stack.removeLast();
        }
        return num;
    }
}
