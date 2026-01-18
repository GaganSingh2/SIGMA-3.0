package Queue;

import java.util.*;

class Interleave2HalvesOfQueue {

    public static void interleave2Halves(Queue<Integer> q){
        int hSize = q.size()/2;
        Queue<Integer> firstHalf = new LinkedList<>();

        //Divide the Original queue in 2 half 
        for(int i=0; i<hSize; i++){
            firstHalf.add(q.remove());
        }

        //add one value from sec queue and one value from fir queue
        while (!firstHalf.isEmpty()) {
            q.add(firstHalf.remove());
            q.add(q.remove());
        }

        while (!q.isEmpty()) {
            System.out.print(q.peek()+" ");
            q.remove();
        }
    }

    public static void main(String[] args) {
        Queue<Integer> fir = new LinkedList<>();  
        fir.add(1);
        fir.add(2);
        fir.add(3);
        fir.add(4);
        fir.add(5);
        fir.add(6);
        fir.add(7);
        fir.add(8);
        fir.add(9);
        fir.add(10);

        interleave2Halves(fir);
    }
}