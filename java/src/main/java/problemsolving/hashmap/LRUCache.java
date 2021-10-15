package problemsolving.hashmap;

import java.util.*;

public class LRUCache<K,V> {

    Map<K, V> _cache;
    int _capacity = 2;

    public LRUCache(Integer capacity){
        _cache = new LinkedHashMap<>();
        _capacity = capacity;
    }

    public Optional<V> get(K key){
        if(_cache.containsKey(key)){
            // make it as most recently used
           V value = _cache.remove(key);
           _cache.put(key, value);
           return Optional.of(value);
        }
        return Optional.empty();
    }

    public void put(K key, V value){
        if(_cache.size() == _capacity){
            // remove the least recently used
           K lruKey = _cache.keySet().iterator().next();
           _cache.remove(lruKey);
        }
        if(_cache.containsKey(key)){
            // make the new one the most recently used
            _cache.remove(key);
        }
        _cache.put(key, value);
    }

    public Set<K> viewAll(){
        Set<K> set = new HashSet<>();
        _cache.forEach((k, v) -> set.add(k));
        return set;
    }
}
