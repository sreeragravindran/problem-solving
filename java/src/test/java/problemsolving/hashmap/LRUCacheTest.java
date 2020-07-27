package ProblemSolving.hashmap;

import ProblemSolving.hashmap.LRUCache;
import org.junit.Assert;
import org.junit.Test;

import java.util.Set;

public class LRUCacheTest {

    @Test
    public void should_work_as_expected(){

        LRUCache<Integer, Integer> cache = new LRUCache<>(5);
        cache.put(1,1);
        cache.put(2,2);
        cache.put(3,3);
        cache.put(4,4);
        cache.put(5,5);
        cache.put(6,6); // evicts 1

        Assert.assertFalse(cache.viewAll().contains(1));
        cache.get(6);
        cache.get(5);
        cache.get(4);
        cache.get(3);
        cache.get(2);
        cache.put(7,7); // evicts 6
        Assert.assertFalse(cache.viewAll().contains(6));
    }

}
