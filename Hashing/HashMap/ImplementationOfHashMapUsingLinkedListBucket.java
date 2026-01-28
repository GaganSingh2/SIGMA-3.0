package Hashing.HashMap;

import java.security.Key;
import java.util.ArrayList;
import java.util.LinkedList;

// This class demonstrates how HashMap is implemented internally
// using an array of LinkedLists (bucket method).
public class ImplementationOfHashMapUsingLinkedListBucket {

    // Generic HashMap class (supports any key-value types)
    static class HashMap<K, V> {

        // Node represents one key-value pair stored in HashMap
        // Similar to Node used internally by Java HashMap
        private class Node {
            // Key used for hashing and equality check
            K key;
            // Value associated with the key
            V value;

            // Constructor to initialize key-value pair
            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        // 'size' stores total number of key-value pairs present
        // (number of nodes currently stored in HashMap)
        private int n; // n(Number of pairs or nodes)

        private int N; // N (bucket length)

        // 'bucket' is an array of LinkedLists
        // Each index is called a bucket
        // Used to handle collisions using chaining
        private LinkedList<Node> bucket[];

        // Java does not allow direct creation of generic arrays

        // Compiler warning is safe to suppress here
        @SuppressWarnings("unchecked")
        // Constructor initializes HashMap
        public HashMap() {
            // Initially HashMap is 4-size
            this.N = 4;

            // Creating bucket array of fixed size (4 here for simplicity)
            // Real Java HashMap default capacity = 16
            this.bucket = new LinkedList[4];

            // Initializing each bucket with an empty LinkedList
            // Prevents NullPointerException during insertion
            for (int i = 0; i < 4; i++) {
                this.bucket[i] = new LinkedList<>();
            }
        }

        // Helper Method for finding Bucket Index for storing the key-value
        // its return the idx between 0 to bucket.size-1
        private int hashFunction(K key) {
            int hc = key.hashCode();
            return Math.abs(hc) % N;
        }

        // This Helper method searches for a key inside a specific bucket (LinkedList)
        // Returns the data index (di) if key is found, otherwise returns -1
        private int searchInLL(K key, int bIdx) {
            // Get the LinkedList present at bucket index bIdx
            LinkedList<Node> ll = bucket[bIdx];
            int di = 0;
            for (int i = 0; i < ll.size(); i++) {
                Node node = ll.get(i);

                if (node.key.equals(key)) {
                    return di; // key is found return its position(means we update the value)
                }
                di++;
            }
            return -1; // key is not found means we add new key-value pair
        }

        // Rehashing is done when load factor exceeds threshold
        // It increases bucket size and redistributes existing entries
        private void rehash() {
            // Store reference to old bucket array
            LinkedList<Node> oldBucket[] = bucket;
            // Create a new bucket array with double capacity
            bucket = new LinkedList[N * 2];
            // Update bucket size (N)
            N = 2 * N;
             // Initialize each new bucket with an empty LinkedList
            for (int i = 0; i < bucket.length; i++) {
                bucket[i] = new LinkedList<>();
            }

            // Traverse all old buckets
            for (int i = 0; i < oldBucket.length; i++) {
                 // Get LinkedList at old bucket index
                LinkedList<Node> ll = oldBucket[i];
                //Travrse the LL (Nodes -> add in Rehashed bucket)
                for (int j = 0; j < ll.size(); j++) {
                     // Remove node from old bucket
                    Node node = ll.get(j);
                    // Reinsert into new bucket using put()
                    put(node.key, node.value);
                }
            }
        }

        // Put or updates a key-value pair in HashMap 
        //TC: O(lambda) = O(1) (worst case is O(n) this one arise when rhasing is happen but it happen after more time)
        public void put(K key, V value) {
            // Calculate bucket index using hash function
            int bIdx = hashFunction(key);
            // Search for key inside the bucket's LinkedList
            // Returns index if key exists, otherwise -1
            int dataIdx = searchInLL(key, bIdx); 

            // If key already exists → update value
            if (dataIdx != -1) {
                Node node = bucket[bIdx].get(dataIdx);
                node.value = value;
                System.out.println(key+" is Already Existed in HashMap so Update existed value with "+value);
            } 
            // If key does not exist → insert new node
            else {
                System.out.println(key+" is inserted with value "+value);
                bucket[bIdx].add(new Node(key, value));
                n++; // increase number of Pairs
            }

            // Calculate load factor (λ = n / N)
            double lambda = (double) n / N;
            // If load factor exceeds threshold → rehash
            if (lambda > 2.0) {
                rehash();
            }
        }

        //Contains Key (Key already exist or not) O(1)
        public boolean containsKey(K key){
            int bIdx = hashFunction(key);
            int dataIdx = searchInLL(key, bIdx);

            if (dataIdx != -1) { //Key is existed
                return true;
            }
            else{ //Key is not existed
                return false;
            }
        }

        //Contains Value (Given Value exist or not) O(n)
        public boolean containsValue(V value){
            for(int i=0; i<bucket.length; i++){

                LinkedList<Node> ll = bucket[i];

                for(int j=0; j<ll.size(); j++){
                    Node node = ll.get(j);
                    if(node.value.equals(value)){
                        return true;
                    }
                }
            }
            return false;
        }

        //Get the Value O(1)
        public V get(K key){
            int bIdx = hashFunction(key);
            int dataIdx = searchInLL(key, bIdx);
            if (dataIdx != -1) {
                Node node = bucket[bIdx].get(dataIdx);
                return node.value;
            }
            else{
                return null;
            }
        }


        //Remove the Key-value O(1)
        public V remove(K key){
            int bIdx = hashFunction(key);
            int dataIdx = searchInLL(key, bIdx);

            if(dataIdx != -1){
                Node node = bucket[bIdx].remove(dataIdx);
                System.out.println(key+" deleted along with value "+node.value);
                n--;
                return node.value;
            }
            else{
                System.out.println(key+" is not present in HashMap so its not Deleted!");
                return null;
            }
        }

        //Return KeySet O(n)
        public ArrayList<K> keySet(){
            if (isEmpty()) {
                System.out.println("Keys are not Present!");
                return new ArrayList<>();
            }
            ArrayList<K> keys = new ArrayList<>();

            for(int i=0; i<bucket.length; i++){
                LinkedList<Node> ll  = bucket[i];
                for(Node node: ll){
                    keys.add(node.key);
                }
            }

            //Print the Keys
            System.out.println("Display THe All Keys: ");
            for(K n: keys){
                System.out.println("Key: "+n);
            }
            return keys;
        }

        //Return ValueSet O(n)
        public ArrayList<V> valueSet(){
            if (isEmpty()) {
                System.out.println("Values are not Present!");
                return new ArrayList<>();
            }
            ArrayList<V> values = new ArrayList<>();

            for(int i=0; i<bucket.length; i++){
                LinkedList<Node> ll  = bucket[i];
                for(Node node: ll){
                    values.add(node.value);
                }
            }

            //Print the Keys
            System.out.println("Display THe All Values: ");
            for(V v: values){
                System.out.println("Value: "+v);
            }
            return values;
        }
        //Empty
        public boolean isEmpty(){
            return n==0;
        }
    }

    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("India", 100);
        map.put("China", 150);
        map.put("Nepal", 50);
        System.out.println("India is Exist: "+map.containsKey("India"));
        System.out.println("Austrailia is Exist: "+map.containsKey("Austrailia"));
        map.put("India", 200);
        System.out.println("Value of India: "+map.get("India"));
        System.out.println("Value of Austrailia: "+map.get("Austrailia"));
        map.remove("Nepal");
        map.remove("Austrailia");
        map.keySet();
        // map.remove("India");
        // map.remove("China");
        // map.keySet();
        map.valueSet();
        System.out.println("100 value is Exist: "+map.containsValue(100));
         System.out.println("150 value is Exist: "+map.containsValue(150));
    }
}
