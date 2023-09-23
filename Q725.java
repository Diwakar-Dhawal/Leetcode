/*  Q 725 : Split Linked List in Parts
    Difficulty : Medium
    Problem Statement : Given the head of a singly linked list and an integer k, split the linked list into k consecutive linked list parts.
                        The length of each part should be as equal as possible: no two parts should have a size differing by more than one. This may lead to some parts being null.
                        The parts should be in the order of occurrence in the input list, and parts occurring earlier should always have a size greater than or equal to parts occurring later.
                        Return an array of the k parts.*/
                    
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class Q725 {

    public ListNode[] splitListToParts(ListNode head, int k) {
        int len=0;
        ListNode temp = head;
        while(temp!=null)
        {
            len++;
            temp = temp.next;
        }
        int part = len/k;
        int extra = len%k;
        ListNode results[] = new ListNode[k];
        temp = head;
        for(int i=0;i<k;i++)
        {
            results[i]=temp;
            int currentPart = part+(extra-- > 0 ? 1 : 0);
            for(int j=0;j<currentPart-1;j++)
            {
                temp = temp.next;
            }
            if(temp!=null)
            {
                ListNode next = temp.next;
                temp.next = null;
                temp = next;
            }
        }
        return results;
        

    }
}