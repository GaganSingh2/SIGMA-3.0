package TCSPractice;

import java.io.*;

public class InputUsingBufferedReader {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int size = Integer.parseInt(br.readLine());
            int arr[] = new int[size];

            for(int i=0; i<size; i++){
                arr[i] = Integer.parseInt(br.readLine());
            }
            for(int i: arr){
                System.out.print(i+" ");
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
