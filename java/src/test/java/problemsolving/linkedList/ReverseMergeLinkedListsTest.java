package problemsolving.linkedList;

import org.junit.Assert;
import org.junit.Test;

import java.util.Stack;

public class ReverseMergeLinkedListsTest  {

    @Test
    public void shouldWork() {
        Node head1 = new Node(4);
        head1.addNext(new Node(6)).addNext(new Node(9)).addNext(new Node(10));

        Node head2 = new Node(5);
        head2.addNext(new Node(7)).addNext(new Node(8)).addNext(new Node(10));
        Node<Integer> reversedHead = ReverseMergeLinkedLists.reverseMerge(head1, head2);

        Stack<Integer> reverseOrder = new Stack<>();
        reverseOrder.push(4);
        reverseOrder.push(5);
        reverseOrder.push(6);
        reverseOrder.push(7);
        reverseOrder.push(8);
        reverseOrder.push(9);
        reverseOrder.push(10);
        reverseOrder.push(10);
        while(reversedHead != null) {
            Assert.assertEquals(reverseOrder.pop(), reversedHead.data);
            reversedHead = reversedHead.next;
        }
    }
}