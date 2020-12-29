/**
 * 终止条件：当两个链表都为空时，表示链表已合并完成
 * 判断 l1 和 l2 头结点哪个更小
 * 较小结点的 next 指针指向其余结点的合并结
 */


class MergeTwoLists {
    public ListNode solution(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        else if (l2 == null) {
            return l1;
        }
        else if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        }
        else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }

    }
}
