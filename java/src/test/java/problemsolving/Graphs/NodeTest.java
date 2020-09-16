package ProblemSolving.Graphs;

import ProblemSolving.graphs.Node;
import org.junit.Assert;
import org.junit.Test;

public class NodeTest {

    @Test
    public void nodes_are_equal_if_the_names_are_same() {
        Node node1 = new Node("abc");
        Node node2 = new Node("abc");

        Assert.assertTrue(node1.equals(node2));
    }
}
