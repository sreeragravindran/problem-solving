package ProblemSolving.graphs.LongestPath;


import ProblemSolving.graphs.Node;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LongestPathFinderTest {


    /*
    ["SFO", "EWR"],
    ["SJC", "LAX"],
    ["DFW", "SJC"],
    ["EWR", "OAK"],
    ["PHL", "MSP"],
    ["SLC", "ONT"],
    ["LDN", "MSP"],
    ["MSP", "ATL"],
    ["LAX", "SFO"],
    ["EWR", "TRT"],
    ["SJC", "CDG"],
    ["CDG", "NDL"],
    ["EWR", "BOS"],
    ["BOS", "PHL"]
     */
    @Test
    public void should_find_longest_path(){

        List<Pair> pairs = new ArrayList<>();
        pairs.add(new Pair("SFO","EWR"));
        pairs.add(new Pair("DFW","SJC"));
        pairs.add(new Pair("SJC","LAX"));
        pairs.add(new Pair("EWR","OAK"));
        pairs.add(new Pair("PHL","MSP"));
        pairs.add(new Pair("SLC","ONT"));
        pairs.add(new Pair("LDN","MSP"));
        pairs.add(new Pair("MSP","ATL"));
        pairs.add(new Pair("LAX","SFO"));
        pairs.add(new Pair("EWR","TRT"));
        pairs.add(new Pair("SJC","CDG"));
        pairs.add(new Pair("CDG","NDL"));
        pairs.add(new Pair("EWR","BOS"));
        pairs.add(new Pair("BOS","PHL"));

        LongestPathFinder longestPathFinder = new LongestPathFinder(pairs);
        LongestPathFinder.MetaNode meta = longestPathFinder.getLongestPath();

        LinkedList<Node> expected = new LinkedList<>();
        expected.add(new Node("DFW"));
        expected.add(new Node("SJC"));
        expected.add(new Node("LAX"));
        expected.add(new Node("SFO"));
        expected.add(new Node("EWR"));
        expected.add(new Node("BOS"));
        expected.add(new Node("PHL"));
        expected.add(new Node("MSP"));
        expected.add(new Node("ATL"));

        while(meta != null){
            Assert.assertTrue(meta.node.equals(expected.pop()));
            meta = meta.next;
        }
    }
}
