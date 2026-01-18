package Queue;

import java.util.*;

class Interleave2HalvesOfQueue {

    public static void interleave2Halves(Queue<Integer> fir){
        int hSize = fir.size()/2;
        Queue<Integer> sec = new LinkedList<>();

        //Divide the Original queue in 2 half 
        for(int i=0; i<hSize; i++){
            sec.add(fir.remove());
        }

        //add one value from sec queue and one value from fir queue
        while (!sec.isEmpty()) {
            fir.add(sec.remove());
            fir.add(fir.remove());
        }

        while (!fir.isEmpty()) {
            System.out.print(fir.peek()+" ");
            fir.remove();
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