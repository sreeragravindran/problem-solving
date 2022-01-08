package problemsolving.linkedList;

public class ReverseMergeLinkedLists {

    public static Node reverseMerge(Node<Integer> head1, Node<Integer> head2) {
        Node<Integer> temp = null;
        Node<Integer> outputHead = null;
        while(head1 != null || head2 != null) {
            if(head1 != null && head2 != null) {
                if(head1.data < head2.data) {
                    temp = outputHead;
                    outputHead = head1;
                    head1 = removeHead(head1);
                    outputHead.next = temp;
                } else {
                    temp = outputHead;
                    outputHead = head2;
                    head2 = removeHead(head2);
                    outputHead.next = temp;
                }
            } else if (head1 != null) {
                temp = outputHead;
                outputHead = head1;
                head1 = removeHead(head1);
                outputHead.next = temp;
            } else {
                temp = outputHead;
                outputHead = head2;
                head2 = removeHead(head2);
                outputHead.next = temp;
            }
        }
        return outputHead;
    }

    private static Node<Integer> removeHead(Node<Integer> head) {
        Node<Integer> oldHead = head;
        head = oldHead.next;
        oldHead.next = null;
        return head;
    }

}