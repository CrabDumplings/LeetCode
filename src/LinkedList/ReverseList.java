//递归
class ReverseList {
    ListNode pre = null;
    public ListNode solution(ListNode head) {
        if (head == null ) 
          return head;
        if (head.next == null) {
            head.next = pre;
            return head;
        }
        ListNode next = head.next;
        head.next = pre;
        pre = head;
        return solution(next);
    }
}
