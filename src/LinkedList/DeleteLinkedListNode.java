package LinkedList;

class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val = x;
    }
}
public class DeleteLinkedListNode {
    /*
    * 1. 找到节点
    *    pre = head
    *    cur = head.next
    *    当cur = null 或 cur = value，跳出循环
    * 2. 修改应用，要删除的节点cur的上一个节点pre
    *    pre.next = cur.next
    * */

    public ListNode deleteNode(ListNode head, int val){
        //如果要删除的元素为头节点，直接返回为head.next
        if(head.val == val)
            return head.next;
        //pre = head;  cur = head.next;
        ListNode pre = head;
        ListNode cur = head.next;

        while(cur != null && cur.val != val){
            pre = cur;
            cur = cur.next;
        }
        if(cur!= null)
            pre.next = cur.next;
        return head;
    }
}
