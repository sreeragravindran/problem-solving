package problemsolving.arrays.SortKSortedArray;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class KSortedArraySorter {

    //[6,5,3,2,8,10,9], 3
//        6, 6, 6, 6
//        5, 5, 5, 5, 5
//        3, 3, 3, 3, 3, 3
//        2, 2, 2, 2, 2, 2, 2
//           8, 8, 8, 8, 8, 8
//             10,10,10,10,10
//                 9, 9, 9, 9
    public List<Integer> sort(int[] kSortedArray, int k) {

//        if(kSortedArray .length < k){
//            throw new Exception("array length has be >= k");
//        }

        List<Integer> sortedList = new ArrayList<>();
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // construct the first heap of size k + 1
        for(int i=0; i<=k; i++ ){
            minHeap.add(kSortedArray[i]);
        }

        sortedList.add(minHeap.poll());
        for(int i=1; i < kSortedArray.length - k; i++){
            minHeap.add(kSortedArray[i+k]);
            sortedList.add(minHeap.poll());
        }

        // add the remaining elements in heap to the list
        while(!minHeap.isEmpty()){
            sortedList.add(minHeap.poll());
        }

        return sortedList;
    }
}
