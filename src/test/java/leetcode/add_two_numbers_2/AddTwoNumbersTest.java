package leetcode.add_two_numbers_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AddTwoNumbersTest {

    private AddTwoNumbers addTwoNumbers;

    @BeforeEach
    void setUp() {addTwoNumbers = new AddTwoNumbers();}

    @Test
    void test() {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode results = AddTwoNumbers.addTwoNumbers(l1, l2);
        Assertions.assertEquals(7, results.val);
        Assertions.assertEquals(0, results.next.val);
        Assertions.assertEquals(8, results.next.next.val);

    }
}