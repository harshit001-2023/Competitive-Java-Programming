public class MergeLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2){
        ListNode dummyHead = new ListNode(0);

        ListNode tail = dummyHead;

        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                tail.next = list1;
                list1 = list1.next;
            }else{
                tail.next = list2;
                list2 = list2.next;
            }

            tail = tail.next;
        }
        if(list1 != null){
             tail.next = list1;
        }else {
            tail.next = list2;
        }

        return dummyHead.next;
    }

    public static void main(String[] args) {
        // 1. Manually create the first list: [1, 2, 4]
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);

        // 2. Manually create the second list: [1, 3, 4]
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        // 3. Create an object and call your method
        MergeLists solver = new MergeLists();
        ListNode mergedList = solver.mergeTwoLists(l1, l2);

        // 4. Print the result
        System.out.println("Merged list:");
        while (mergedList != null) {
            System.out.print(mergedList.val + " -> ");
            mergedList = mergedList.next;
        }
        System.out.println("null");
    }
}








