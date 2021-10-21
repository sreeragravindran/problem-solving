package problemsolving.tree.LowestCommonAncestor;

import problemsolving.tree.BinaryTreeNode;

public class OptimisedApproach {

    public static BinaryTreeNode search(BinaryTreeNode root, int valueA, int valueB) {
        if (root == null) {
            return null;
        }

        if (root.getData() == valueA || root.getData() == valueB) {
            return root;
        }

        BinaryTreeNode leftNode = search(root.getLeft(), valueA, valueB);
        BinaryTreeNode rightNode = search(root.getRight(), valueA, valueB);

        if (leftNode != null && rightNode != null) {
            return root;
        } else if (leftNode != null) {
            return leftNode;
        } else return rightNode;
    }
}
