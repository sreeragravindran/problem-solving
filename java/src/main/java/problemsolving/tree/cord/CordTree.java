package problemsolving.tree.cord;

public class CordTree {
    abstract class Node {
        int len;
        abstract boolean isLeaf();
    }

    class InternalNode extends Node {
        Node left;
        Node right;

        public boolean isLeaf() { return false; }
    }

    class LeafNode extends Node {
        String data;
        public boolean isLeaf() { return true; }
    }

    Character GetCharacterAt(Node cord, int N) {
        if(cord.len < N) {
            return null;
        }

        if(cord.isLeaf()) {
            return ((LeafNode)cord).data.charAt(N);
        }

        Character charfromLeft = GetCharacterAt(((InternalNode)cord).left, N);
        Character charFromRight = null;
        if(charfromLeft == null) {
            charFromRight = GetCharacterAt(((InternalNode)cord).right, N - ((InternalNode)cord).left.len);
        }

        return charfromLeft != null ? charfromLeft : charFromRight;
    }
}
