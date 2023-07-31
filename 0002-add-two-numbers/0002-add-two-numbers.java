/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode list1, ListNode list2) {
        ListNode extra = new ListNode(); //creating a extra node so that data can be stored
        ListNode temp = extra;  //creating temp using extra node
        int carry = 0 ;   //carry pointer
        while(list1!=null || list2!=null || carry!=0){ 
            int sum=0;
            if(list1!=null){
                sum+=list1.val;
                list1 = list1.next;
            }
            if(list2!=null){
                sum+=list2.val;
                list2 = list2.next;
            }
            sum+=carry;  
            carry=sum/10;  

            ListNode ll = new ListNode(sum%10);  
            temp.next = ll;  
            temp = temp.next; 
        }
        return extra.next; 
    }
}



