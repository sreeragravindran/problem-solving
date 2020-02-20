package ProblemSolving.graphs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.LinkedList;

public class Graph {

    private class Node {
        private int id;
        LinkedList<Node> adjacents = new LinkedList<>();

        private Node(int id){
            this.id = id;
        }
    }

    private HashMap<Integer, Node> nodes = new HashMap<>();

    private Node getNode(int id){
        if(!nodes.containsKey(id)) {
            nodes.put(id, new Node(id));
        }
        return nodes.get(id);
    }

    public Graph addEdge(int source, int destination) {
        Node sourceNode = getNode(source);
        Node destinationNode = getNode(destination);
        sourceNode.adjacents.add(destinationNode);
        return this;
    }

    public boolean hasPathDFS(int source, int destination) {
        Node sourceNode = getNode(source);
        Node destinationNode = getNode(destination);
        Set<Integer> visited = new HashSet<>();
        return hasPathDFS(sourceNode, destinationNode, visited);
    }

    private boolean hasPathDFS(Node source, Node destination, Set<Integer> visited) {

        if(visited.contains(source.id)){
            return false;
        }

        if(source == destination) {
            return true;
        }

        if(source.adjacents.contains(destination)){
            return true;
        }

        visited.add(source.id);

        for(Node child: source.adjacents){
            if(hasPathDFS(child, destination, visited)){
                return true;
            }
        }

        return false;
    }

}
