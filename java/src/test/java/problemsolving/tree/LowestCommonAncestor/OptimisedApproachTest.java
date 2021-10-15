package problemsolving.tree.LowestCommonAncestor;

import problemsolving.tree.BinaryTreeNode;
import org.junit.Assert;
import org.junit.Test;

public class OptimisedApproachTest {

    @Test
    public void shouldFindCommonAncestor(){
        BinaryTreeNode root = new BinaryTreeNode(1);
        BinaryTreeNode two = root.addLeft(2);
        two.addLeft(4);
        two.addRight(5);
        root.addRight(3);

        BinaryTreeNode result = OptimisedApproach.search(root, 4, 5);
        Assert.assertEquals(2, result.getValue());

        result = OptimisedApproach.search(root, 4, 2);
        Assert.assertEquals(2, result.getValue());

        result = OptimisedApproach.search(root, 4, 3);
        Assert.assertEquals(1, result.getValue());

        result = OptimisedApproach.search(root, 3, 5);
        Assert.assertEquals(1, result.getValue());

        result = OptimisedApproach.search(root, 10, 20);
        Assert.assertNull(result);

    }
}
