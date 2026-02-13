import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class LinkedListProblems {
    static ListNode reverseList(ListNode head) {
        //206. Reverse Linked List
        /*Given the head of a singly linked list, reverse the list, and return the reversed list.
        
        Example 1:
        
        Input: head = [1,2,3,4,5]
        Output: [5,4,3,2,1]
        */

        if(head == null || head.next == null){
            return head;
        }

        ListNode newHead = reverseList(head.next);
        ListNode headNext = head.next;
        headNext.next = head;
        head.next = null;

        return headNext;
    }

    public static void main(String[] args) {
        //input system for LinkedList
        
        try {
            System.setIn(new FileInputStream("input.txt"));
            System.setOut(new PrintStream(new FileOutputStream("output.txt")));
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error");
        }

        Scanner sc = new Scanner(System.in);
        


    }
    
}
