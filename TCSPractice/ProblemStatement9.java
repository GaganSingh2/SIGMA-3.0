package TCSPractice;

import java.io.*;

public class ProblemStatement9 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try{
            int i = Integer.parseInt(br.readLine());
            int j = Integer.parseInt(br.readLine());

            if(i>=j || i<0 || j>=9999){
                System.out.println("Invalid Input");
            }
            else{
                int sum = 0;
                for(int k=i; k<=j; k++){
                    sum += k;
                }
                System.out.println(sum);
            }
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
