package LinkedList;

import java.util.List;

public class LCAddtwoNumbers {

    public class ListNode {

        int val;
        ListNode next;
        ListNode() {};
        ListNode(int val) {this.val = val;};
        ListNode(int val, ListNode next) {this.val = val; this.next = next;};

    }


    public ListNode addTwoNumbers(ListNode l1, ListNode l2){

        int carry =0;

        ListNode current1 = l1;
        ListNode current2 = l2;

        ListNode finalList = new ListNode();

        while(current1.next!=null || current2.next!=null){

            int val = current1.val + current2.val;

            if(carry > 0){
                val = carry + val;
            }
            if(val>=10){
                carry = 1;
                val = val%10;
            }
            ListNode temp = new ListNode(val);
            finalList = temp;
            finalList =finalList.next;
            current1 = current1.next;
            current2 = current2.next;

        }


return null;
    }


}
