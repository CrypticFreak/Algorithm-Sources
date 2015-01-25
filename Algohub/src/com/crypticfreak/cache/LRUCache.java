package javacodes.cache;

import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

/**
 * Created by Ankur K on 5/9/14.
 * Question : Design and implement a data structure for Least Recently Used (LRU) cache. It should support the following operations: get and set.
 * get(key) - Get the value (will always be positive) of the key if the key exists in the cache, otherwise return -1.
 * set(key, value) - Set or insert the value if the key is not already present. When the cache reached its capacity,
 * it should invalidate the least recently used item before inserting a new item.
 * Online Judge : http://oj.leetcode.com/problems/lru-cache/
 * Accepted : Yes
 */
public class LRUCache {

  private final int capacity;
  private class KeyTime{
    final private Integer key;
    long timeStamp;
    KeyTime(Integer key, Long timeStamp){
      this.key = key;
      this.timeStamp = timeStamp;
    }
  }

  private HashMap<Integer, Integer> dataHashmap = new HashMap<Integer, Integer>();
  private HashMap<Integer, Long> keyTimeHashMap = new HashMap<Integer, Long>();

  private PriorityQueue<KeyTime> keyTimePriorityQueue = new PriorityQueue<KeyTime>(1000,new Comparator<KeyTime>() {
    @Override
    public int compare(KeyTime keyTime, KeyTime keyTime2) {
      if(keyTime.timeStamp - keyTime2.timeStamp < 0)
        return -1;
      if(keyTime.timeStamp - keyTime2.timeStamp > 0)
        return 1;
      return 0;
    }
  });

  public LRUCache(int capacity) {
    this.capacity = capacity;
  }

  public int get(int key){
    Integer result = dataHashmap.get(key);
    long currentTime = System.currentTimeMillis();
    keyTimeHashMap.put(key, currentTime);
    if(result == null) return -1;
    return result;
  }

  public void set(int key, int value){
    shrink();
    System.out.println(dataHashmap.keySet().toString());
    boolean isPresent = dataHashmap.containsKey(key);

    dataHashmap.put(key, value);
    long currentTime = System.currentTimeMillis();
    keyTimeHashMap.put(key, currentTime);
    if(!isPresent){
      keyTimePriorityQueue.offer(new KeyTime(key, currentTime));
      keyTimeHashMap.put(key, currentTime);
    }
    System.out.println(dataHashmap.keySet().toString());
  }

  private void shrink(){
    while(dataHashmap.size() >= capacity){
      /*try {
        Thread.sleep(1L);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }*/
      KeyTime element = keyTimePriorityQueue.poll();
      Long value = keyTimeHashMap.get(element.key);
      if(element.timeStamp != value){
        element.timeStamp = value;
        keyTimePriorityQueue.offer(element);
      }
      else {
        dataHashmap.remove(element.key);
        keyTimeHashMap.remove(element.key);
      }
    }
  }
}