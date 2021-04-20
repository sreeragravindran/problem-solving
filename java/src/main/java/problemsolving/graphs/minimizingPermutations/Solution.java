package ProblemSolving.graphs.minimizingPermutations;

import groovy.lang.Tuple2;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {

    private int minimumCount = Integer.MAX_VALUE;

    public static class Node {
        int[] array;
        List<Node> adjacents;

        public Node(int[] array){
            this.array = array;
            this.adjacents = new ArrayList<>();
        }
    }
    // node representing arr in a sequence

    public int minOperations(int[] arr){
        // construct graph of all permutations
        // if there are multiple, take route for each
        minimumCount = Integer.MAX_VALUE;
        Node root = new Node(arr);
        constructGraphOfPermutations(arr, root, 0);
        return minimumCount;
    }

    private void constructGraphOfPermutations(int[] array, Node node, int count){

        List<Tuple2<Integer, Integer>> reversablePortions = findReversablePortions(array);

        if(reversablePortions.size() == 0){
            // it is sorted
            minimumCount = Math.min(count, minimumCount);
        }
        else {
            reversablePortions.forEach(e -> {

                // reverse the array and add as adjacent to the node
                int[] reversedArray = reversePortion(array, e.getFirst(), e.getSecond());
                Node child = new Node(reversedArray);
                node.adjacents.add(child);
                constructGraphOfPermutations(reversedArray, child, count + 1);
            });
        }
    }

    private List<Tuple2<Integer, Integer>> findReversablePortions(int[] arr){

        int startIndex = 0;
        int endIndex = 0;
        List<Tuple2<Integer, Integer>> result = new ArrayList<>();

        for(int i =0; i < arr.length-1; i++){
            startIndex = i;
            endIndex = i;
            while(i < arr.length-1 && arr[i] >= arr[i+1]){
                endIndex= i+1;
                i++;
            }
            if(endIndex > startIndex){
                result.add(new Tuple2<>(startIndex, endIndex));
            }
        }

        return result;
    }

    public int[] reversePortion(int[] sourceArr, int startIndex, int endIndex){
        int[] reversedArray = sourceArr.clone();
        for(int i= endIndex, j = startIndex; i >= startIndex; i--, j++){
            reversedArray[j] = sourceArr[i];
        }
        return reversedArray;
    }
}
