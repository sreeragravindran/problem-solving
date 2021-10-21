package problemsolving.graphs;

import lombok.Getter;

import java.util.HashMap;

public class GenericGraph<T extends Node> {

    @Getter
    private HashMap<T, T> nodes = new HashMap<>();

    private T getNode(T node) {
        if (!nodes.containsKey(node)) {
            nodes.put(node, node);
        }
        return nodes.get(node);
    }

    public HashMap<T, T> getNodes() {
        return nodes;
    }

    public void addEdge(T source, T destination) {
        T sourceNode = getNode(source);
        T destinationNode = getNode(destination);
        sourceNode.getAdjacents().add(destinationNode);
    }

}
