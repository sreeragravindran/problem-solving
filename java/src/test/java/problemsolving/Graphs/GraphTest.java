package problemsolving.Graphs;

import problemsolving.graphs.Graph;
import org.junit.Assert;
import org.junit.Test;

public class GraphTest {

    @Test
    public void dfs_tests() {
        Graph graph = new Graph();

        graph.addEdge(1 , 2)
                .addEdge(2, 3)
                .addEdge(4,5)
                .addEdge(2, 5)
                .addEdge(5, 1)
                .addEdge(3, 2)
                .addEdge( 3,6).addEdge(6,7);


        Assert.assertTrue(graph.hasDFSPath(1,5));
        Assert.assertTrue(graph.hasDFSPath(1,7));
        Assert.assertTrue(graph.hasDFSPath(2,1));

    }

    @Test
    public void bfs_tests() {
        Graph graph = new Graph();

        graph.addEdge(1 , 2)
                .addEdge(2, 3)
                .addEdge(4,5)
                .addEdge(2, 5)
                .addEdge(5, 1)
                .addEdge(3, 2)
                .addEdge( 3,6).addEdge(6,7);


//        Assert.assertTrue(graph.hasBFSPath(1,5));
        Assert.assertTrue(graph.hasBFSPath(1,7));
//        Assert.assertTrue(graph.hasBFSPath(2,1));
//        Assert.assertTrue(graph.hasBFSPath(4,7));

//        Assert.assertFalse(graph.hasBFSPath(7,6));

    }
}
