package coding.oop;

import java.util.List;

/*
reduce (also known as fold) is a function that takes in an array, a combining function, and an initial value and builds up a result by calling the combining function on each element of the array, left to right.
For example, we can write sum() in terms of reduce:
def add(a, b):
    return a + b

def sum(lst):
    return reduce(lst, add, 0)

This should call add on the initial value with the first element of the array, and then the result of that with the second element of the array, and so on until we reach the end, when we return the sum of the array.
Implement your own version of reduce.
 */
public class ReduceImpl {

    interface Adder{
        int add(int a, int b);
    }

    public int sum(List<Integer> list) {
        Adder adder = (a,b) -> a + b;
        return reduce(list, adder, 0);
    }

    private int reduce(List<Integer> list, Adder adder, int initialValue) {
        for(int i : list) {
            initialValue = adder.add(initialValue, i);
        }
        return initialValue;
    }
}
