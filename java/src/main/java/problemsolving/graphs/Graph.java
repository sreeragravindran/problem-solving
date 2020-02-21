package ProblemSolving.graphs;

import java.util.*;

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

    public boolean hasDFSPath(int source, int destination) {
        Node sourceNode = getNode(source);
        Node destinationNode = getNode(destination);
        Set<Integer> visited = new HashSet<>();
        return hasDFSPath(sourceNode, destinationNode, visited);
    }

    private boolean hasDFSPath(Node source, Node destination, Set<Integer> visited) {

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
            if(hasDFSPath(child, destination, visited)){
                return true;
            }
        }

        return false;
    }

    public boolean hasBFSPath(int source, int destinaion){
        Node sourceNode = getNode(source);
        Node destinationNode = getNode(destinaion);
        return hasBFSPath(sourceNode, destinationNode);
    }

    private boolean hasBFSPath(Node source, Node destination){

        LinkedList<Node> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        queue.add(source);

        while(!queue.isEmpty()) {
            queue.forEach(e -> System.out.println(e.id));

//            System.out.println("end of queue");

            Node temp = queue.remove();

            if(visited.contains(temp.id)){
                continue;
            }

            if(temp == destination) {
                return true;
            }

            visited.add(temp.id);

            queue.addAll(temp.adjacents);
        }

        return false;
    }

}
