package practicing;

import java.util.HashMap;
import java.util.Map;

public class LRUCache146 {
//
//	public class LRUCache {
//	    int capacity;
//	    HashMap <Integer,Integer> cache;
//	    int recent;
//	    
//	    public LRUCache(int capacity) {
//	        this.capacity = capacity;
//	        
//	    }
//	    
//	    public int get(int key) {
//	        if(cache.containsKey(key)){
//	            this.recent = key;
//	            return cache.get(key);
//	        }else{
//	            return -1;
//	        }
//	    }
//	    
//	    public void put(int key, int value) {
//	        
//	            if(this.cache.size()>=this.capacity){
//	            cache.put(recent,-1);
//	            cache.put(key,value);
//	        }else{
//	            cache.put(key,value);
//	           
//	        }
//	        
//	       
//	        
//	    }
//	    
//	    
//	}
//
//	/**
//	 * Your LRUCache object will be instantiated and called as such:
//	 * LRUCache obj = new LRUCache(capacity);
//	 * int param_1 = obj.get(key);
//	 * obj.put(key,value);
//	 */
//	
//	public static void main(String[]args) {
//		LRUCache146 lru14 = new LRUCache146();
//		LRUCache lru = lru14.new LRUCache(2);
//		lru.put(1,1);
//		
//	}
	class LRUCache {
	    LinkedNodeList list;
	    Map<Integer, Node> map;
	    Integer cap;
	    public LRUCache(int capacity) {
	        list = new LinkedNodeList();
	        map = new HashMap(capacity);
	        cap = capacity;
	    }
	    
	    public int get(int key) {
	        Node node = map.get(key);
	        if(node == null){
	            return -1;
	        }
	        list.moveToHead(node);
	        return node.val;
	    }
	    
	    public void put(int key, int value) {
	        Node node = map.get(key);
	        if(node != null){
	            list.moveToHead(node);
	            node.val = value;

	        }else{
	             Node newNode = new Node(key, value);
	            if(map.size() == cap){
	                Node tail = list.getTail();
	                map.remove(tail.key);
	                list.removeTail();
	            }
	            map.put(key, newNode);
	            list.addToHead(newNode);
	        }
	    }
	}

	class LinkedNodeList{
	    Node dummyHead;
	    Node dummyTail;
	    
	    LinkedNodeList(){
	        dummyHead = new Node(0,0);
	        dummyTail = new Node(0,0);
	        dummyHead.next = dummyTail;
	        dummyTail.prev = dummyHead;
	    }
	    
	    void moveToHead(Node node){
	        node.prev.next = node.next;
	        node.next.prev = node.prev;
	        addToHead(node);
	    }
	    
	    void addToHead(Node node){
	        Node tmp = dummyHead.next ;
	        dummyHead.next = node;
	        node.next = tmp;
	        node.prev = dummyHead;
	        tmp.prev = node;
	    }
	    
	    void removeTail(){
	        Node newTail = dummyTail.prev.prev;
	        newTail.next = dummyTail;
	        dummyTail.prev = newTail;
	    }
	    
	    Node getTail(){
	        return dummyTail.prev;
	    }
	    
	}

	 class Node{
	        int key;
	        int val;
	        Node next;
	        Node prev;
	        Node(int key, int value){
	            this.key = key;
	            this.val =value;
	        }
	}
}
/*The above is the scratch answer that I was trying not to use doubly linked list. Below is using doubly linked list using dummy head and dummy tail.
 * Good thing about using doubly linked list is that we can move forward and backward to add and remove. However, it is hard to come up with this idea
 * */
