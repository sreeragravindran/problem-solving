package ProblemSolving.graphs;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode(of = {"id"})
public class Node {

    @Getter
    private String id;

    @Getter
    private List<Node> adjacents;

    public Node(String id){
        this.id = id;
        adjacents = new ArrayList<>();
    }
}
