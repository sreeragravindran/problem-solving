package problemsolving.graphs.LongestPath;

import problemsolving.graphs.GenericGraph;
import problemsolving.graphs.Node;
import lombok.EqualsAndHashCode;

import java.util.*;

public class LongestPathFinder {

    private GenericGraph<Node> graph;

    private Map<MetaNode, MetaNode> visited;

    public LongestPathFinder(List<Pair> pairs) {
        graph = new GenericGraph<Node>();
        visited = new HashMap<>();
        addEdges(pairs);
    }

    public LongestPathFinder(GenericGraph<Node> graph) {
        this.graph = graph;
    }

    private void addEdge(Pair pair) {
        graph.addEdge(new Node(pair.getOrigin()), new Node(pair.getDestination()));
    }

    private void addEdges(List<Pair> pairs) {
        pairs.forEach(pair -> addEdge(pair));
    }

    public MetaNode getLongestPathDFS() {
        MetaNode rootNode = new MetaNode();
        for (Node node : graph.getNodes().keySet()) {
            MetaNode metaNode = getLongestPathDFS(node);
            if (metaNode.longestDistanceDown > rootNode.longestDistanceDown) {
                rootNode = metaNode;
            }
        }
        return rootNode;
    }

    private MetaNode getLongestPathDFS(Node node) {
        MetaNode current = new MetaNode(node, 0);
        if (visited.containsKey(current)) {
            return visited.get(current);
        }
        for (Node childNode : node.getAdjacents()) {
            MetaNode child = getLongestPathDFS(childNode);
            int temp = child.longestDistanceDown + 1;
            if (temp > current.longestDistanceDown) {
                current.longestDistanceDown = temp;
                current.next = child;
            }
        }
        visited.put(current, current);
        return current;
    }

    @EqualsAndHashCode(of = {"node"})
    public static class MetaNode {
        public Node node;
        public MetaNode next;
        public int longestDistanceDown;

        public MetaNode() {
        }

        public MetaNode(Node node, int longestDistanceDown) {
            this.node = node;
            this.longestDistanceDown = longestDistanceDown;
        }
    }
}
