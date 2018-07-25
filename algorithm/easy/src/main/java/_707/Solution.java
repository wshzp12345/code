package _707;

/**
 * @Auther: Albert
 * @Date: 2018/7/25 12:54
 * @Description:
 */
public class Solution {
    ListNode head = null, tail = null;
    int length = 0;

    /**
     * Initialize your data structure here.
     */
    public Solution() {

    }

    /**
     * Get the value of the index-th node in the linked list. If the index is invalid, return -1.
     */
    public int get(int index) {
        if (invalid(index)) {
            return -1;
        }

        ListNode node = find(index);
        return node.getVal();
    }

    /**
     * Add a node of value val before the first element of the linked list. After the insertion, the new node will be
     * the first node of the linked list.
     */
    public void addAtHead(int val) {

        ListNode cur = new ListNode(val);
        if (head == null) {
            head = tail = cur;
        } else {
            cur.next = head;
            head = cur;
        }
        length++;
    }

    /**
     * Append a node of value val to the last element of the linked list.
     */
    public void addAtTail(int val) {
        ListNode cur = new ListNode(val);
        if (head == null) {
            head = tail = cur;
        } else {
            tail.next = cur;
            tail = cur;
        }
        length++;
    }

    /**
     * Add a node of value val before the index-th node in the linked list. If index equals to the length of linked
     * list, the node will be appended to the end of linked list. If index is greater than the length, the node will not
     * be inserted.
     */
    public void addAtIndex(int index, int val) {
        if(index>length){
            return;
        }
        ListNode cur = new ListNode(val);

        if (index == 0) {
            addAtHead(val);
        } else if (length == 0) {
            head = tail = cur;
            length++;
        } else if (index == length) {
            addAtTail(val);
        } else if (index > length) {
            return;
        } else {
            ListNode node = find(index - 1);
            cur.next = node.next;
            node.next = cur;
            length++;
        }
    }

    private boolean valid(int index) {
        return length <= index || index < 0;
    }

    private ListNode find(int index) {
        ListNode find = head;
        for (int i = 0; i < index; i++) {
            find = find.next;
        }
        return find;
    }

    /**
     * Delete the index-th node in the linked list, if the index is valid.
     */
    public void deleteAtIndex(int index) {
        if (valid(index)) {
            return;
        }
        if (index == 0) {
            head = head.next;

        } else {
            ListNode node = find(index - 1);
           if(node.next ==tail)
               tail  = node;
            node.next = node.next.next;
        }

        length--;
    }

    // if index invalid  return ture
    private boolean invalid(int index) {
        return length - 1 <= index || index < 0;
    }

    class ListNode {
        ListNode next;
        int val;

        public ListNode(int i) {
            val = i;
        }

        public int getVal() {
            return val;
        }

        public void setVal(int i) {
            val = i;
        }

        public String toString() {
            return String.valueOf(val);
        }

    }

    public String toString() {
        String s = "[";
        ListNode cur = head;
        while (cur != null) {
            s += cur.toString() + ",";
            cur = cur.next;
        }
        return s + "]";
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
//        solution.addAtHead(8);
//        System.out.println(solution.get(1));
//        solution.addAtTail(81);
//        solution.deleteAtIndex(2);
//        solution.addAtHead(26);
//        solution.deleteAtIndex(2);
//        System.out.println(solution.get(1));
//        solution.addAtTail(24);
//        solution.addAtHead(15);
//        solution.addAtTail(0);
//        solution.addAtTail(13);
//        solution.addAtTail(1);
//        solution.addAtIndex (6, 33);
//        solution.addAtIndex(6, 33);
//        solution.get(6);
//        solution.addAtIndex(2, 91);
//        solution.addAtHead(82);
//        solution.deleteAtIndex(6);
//        solution.addAtIndex(4, 11);
//        solution.addAtHead(3);
//        solution.addAtIndex(7, 14);
//        solution.deleteAtIndex(1);
//        solution.get(6);
//        solution.addAtTail(99);
//        solution.deleteAtIndex(11);
//        solution.deleteAtIndex(7);
//        solution.addAtTail(5);
//        solution.addAtTail(92);
//        solution.addAtIndex(7, 92);
//        solution.addAtHead(57);
//        solution.get(2);
//        solution.get(6);
//        solution.addAtTail(39);
//        solution.addAtTail(51);
//        solution.addAtTail(3);
//        solution.addAtTail(22);
//        solution.addAtIndex(5, 26);
//        solution.addAtIndex(9, 52);
//        solution.addAtHead(69);
//        solution.addAtIndex(5, 58);
//        solution.addAtTail(79);
//        solution.addAtHead(7);
//        solution.addAtHead(41);
//        solution.addAtHead(33);
//        solution.addAtHead(88);
//        solution.addAtHead(44);
//        solution.addAtHead(8);
//        solution.addAtTail(72);
//        solution.addAtHead(93);
//        solution.deleteAtIndex(18);
//        solution.addAtHead(1);
//        solution.get(9);
//        solution.addAtHead(46);
//        solution.get(9);
//        solution.addAtHead(92);
//        solution.addAtHead(71);
//        solution.addAtHead(69);
//        solution.addAtIndex(11, 54);
//        solution.deleteAtIndex(27);
//        solution.addAtTail(83);
//        solution.deleteAtIndex(12);
//        solution.get(20);
//        solution.addAtIndex(19, 97);
//        solution.addAtHead(77);
//        solution.addAtTail(36);
//        solution.deleteAtIndex(3);
//        solution.addAtHead(35);
//        solution.addAtIndex(16, 68);
//        solution.deleteAtIndex(22);
//        solution.deleteAtIndex(36);
//        solution.deleteAtIndex(17);
//        solution.addAtHead(62);
//        solution.addAtTail(89);
//        solution.addAtTail(61);
//        solution.addAtHead(6);
//        solution.addAtTail(92);
//        solution.addAtIndex(28, 69);
//        solution.deleteAtIndex(23);
//        solution.deleteAtIndex(28);
//        solution.addAtIndex(7, 4);
//        solution.addAtHead(0);
//        solution.addAtHead(24);
//        solution.addAtTail(52);
//        solution.get(1);
//        solution.addAtIndex(23, 3);
//        solution.get(7);
//        solution.addAtHead(6);
//        solution.addAtHead(68);
//        solution.addAtHead(79);
//        solution.addAtIndex(45, 90);
//        solution.addAtIndex(41, 52);
//        solution.get(28);
//        solution.addAtHead(25);
//        solution.get(9);
//        solution.get(32);
//        solution.addAtTail(11);
//        solution.addAtHead(90);
//        solution.addAtHead(24);
//        solution.addAtTail(98);
//        solution.addAtTail(36);
//        solution.get(34);
//        solution.addAtTail(26);
        System.out.println(solution.get(0));
        solution.addAtIndex(1, 2);
        System.out.println(solution.get(0));

        System.out.println(solution.get(0));
        System.out.println(solution);
        System.out.println(solution.get(0));
    }
}
