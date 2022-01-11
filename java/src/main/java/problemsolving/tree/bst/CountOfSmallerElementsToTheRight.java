package problemsolving.tree.bst;

public class CountOfSmallerElementsToTheRight {

    private static class Node {
        int data;
        Node left;
        Node right;
        int leftCount;

        public Node(int data) {
            this.data = data;
        }
    }

    private Node root;
    private int[] output;

    private Node addNodeRecursive(Node node, int value, int smallerElementsCount, int index) {
        if (node == null) {
            node = new Node(value);
            output[index] = smallerElementsCount;
            return node;
        } else if (value > node.data) {
            node.right = addNodeRecursive(node.right, value, smallerElementsCount + 1 + node.leftCount, index);
        } else {
            node.leftCount++;
            node.left = addNodeRecursive(node.left, value, smallerElementsCount, index);
        }
        return node;
    }

    public int[] findCount(int[] input) {
        output = new int[input.length];
        Node node;
        for(int i=input.length -1; i >= 0; i--) {
            node = addNodeRecursive(root, input[i], 0, i);
            // set root to the parent node created
            if(i == input.length -1) {
                root = node;
            }
        }
        return output;
    }
}

