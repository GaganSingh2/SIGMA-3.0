package Hashing.HashSet;

import java.util.*;

import Recursion.numberExample;

public class ImplementationOfHashSetUsingLinkedListBucket {

    static class MyHashSet<K> {
        // Initial number of buckets (power of 2 improves distribution)
        private static final int defaultCapacity = 16;

        // Threshold to decide when resizing is needed
        // 0.75 means resize when 75% of bucket is filled
        private static final double loadFactor = 0.75;

        // Array of bucket(each bucket is a LinkedList)
        private LinkedList<K> bucket[];

        // Stores number of element in HashSet
        private int size;

        /*
         * Constructor
         * - Initializes table with default capacity
         * - Size starts from 0
         */
        public MyHashSet() {
            this.bucket = new LinkedList[defaultCapacity];
            this.size = 0;
        }

        /*
         * Hash-function Method
         * - Converts object hashCode into a valid index
         * - Math.abs avoids negative index
         */
        private int hashFunction(K key) {
            int hc = key.hashCode();
            return Math.abs(hc) % bucket.length;
        }

        /*
         * RESIZE / REHASH operation
         * - Doubles the capacity
         * - Recalculates index for each element
         */
        private void resize() {
            // Store refernce of old bucket in the newBucket
            LinkedList<K> newBucket[] = bucket;
            /// Resize the Bucket with double capacity
            bucket = new LinkedList[newBucket.length * 2];

            // Reset Size(will be recalculated during re-insertion)
            size = 0;
            // Re-Insert all the element into Resize Bucket
            for (LinkedList<K> buck : newBucket) {
                if (buck != null) {
                    for (K key : buck) {
                        add(key); // ReHashing happens here
                    }
                }
            }
        }

        /*
         * ADD operation
         * - Checks load factor before inserting
         * - Resizes table if threshold exceeded
         */
        public boolean add(K key) {
            // Calculate load factor (λ = n / N)
            double lambda = (double) size / bucket.length;
            // If load factor exceeds threshold → rehash
            if (lambda > loadFactor) {
                System.out.println("Bucket is Resized!");
                resize();
            }

            // Calulate bucket index for the key
            int bIdx = hashFunction(key);
            // Create bucket if it does not exist
            if (bucket[bIdx] == null) {
                bucket[bIdx] = new LinkedList<>();
            }

            // Prevent duplicate elements(HashSet rule)
            if (bucket[bIdx].contains(key)) {
                System.out.println(key + " is Already Inserted!");
                return false;
            }
            // Insert element into bucket
            bucket[bIdx].add(key);
            System.out.println(key + " is Inserted In THe HashSet!");

            // Increase size after successful insertion
            size++;
            return true;
        }

        /*
     * REMOVE operation
     * - Deletes element if present
     */
        public boolean remove(K key) {
            // Find bucket index
            int bIdx = hashFunction(key);

            // If bucket does not exist, nothing to remove
            if (bucket[bIdx] == null) {
                System.out.println(key + " is Not Exist In HashSet!!");
                return false;
            }

            // Remove element from bucket
            boolean removed = bucket[bIdx].remove(key);
            // Decrease size only if removal was successful
            if (removed) {
                System.out.println(key + " is Removed!");
                size--;
            }
            return removed;
        }

        /*
         * CONTAINS operation
         * - Checks if element exists in HashSet
         */
        public boolean contains(K key) {
            // Find bucket index for the key
            int bIdx = hashFunction(key);

            if (bucket[bIdx] == null) {
                System.out.println(key + " is Not Exist in HashSet!!");
                return false;
            }

            System.out.println(key + " is Available in HashSet!");
            return bucket[bIdx].contains(key);
        }

        //Return number of elements in HashSet
        public int size(){
            return size;
        }

    }
}
