package LinkedList;

/*
* 反转链表
* */
public class ReverseLinkedList {
    /*
    * 双指针
    * 修改next的指向
    * */
    public ListNode reverseList(ListNode head){
        ListNode cur = head;
        ListNode pre = null;
        while(cur != null){
            ListNode tmp = cur.next;//保存cur的下一个节点
            cur.next = pre;
            pre = cur;
            cur = tmp;
        }
        return pre;
    }
}

/*
* 递归
* */

class Solution{
    public ListNode reverseList(ListNode head){
        return recur(head, null);
    }

    public ListNode recur(ListNode cur, ListNode pre){
        if (cur == null) 
            return pre; // 终止条件
        ListNode res = recur(cur.next, cur);  // 递归后继节点
        cur.next = pre;             
        return res;                
    }
}
