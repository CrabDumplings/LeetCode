package LinkedList;

public class GetKthFromEnd {
    /*
    * 双指针
    * 初始化前指针former和后指针latter
    * 前指针former先向前走k步
    * 循环中，双指针former和latter每轮都向前走一步，直至former走过链表尾节点时跳出
    * 跳出后，latter与尾节点距离为k-1，latter指向倒数第k个节点
    * */
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode former = head, latter = head;
        for(int i = 0; i < k; i++)
            former = former.next;
        while(former != null) {
            former = former.next;
            latter = latter.next;
        }
        return latter;
    }
}
