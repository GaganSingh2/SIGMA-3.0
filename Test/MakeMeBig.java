package Test;

import java.util.Scanner;

public class MakeMeBig {

    public static int makeMeBig(int num){
        String str = String.valueOf(num);
        char[] ch = str.toCharArray();

                // System.out.println(dig2);
        for(int i=0; i<ch.length; i++){
            for(int j=i+1; j<ch.length; j++){
                int dig1 = ch[i]-'0';
                int dig2 = ch[j]-'0';
                if(dig1<dig2){
                    char tmp = ch[i];
                    ch[i] = ch[j];
                    ch[j] = tmp;
                }
            }
        }

        int val = 0, place = ch.length-1; 
        
        for(int i=0; i<ch.length; i++){
            int digit = ch[i]-'0';
            val = val + digit * place;
            place /= 10;
        }
        return val;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = sc.nextInt();
        System.out.println(makeMeBig(num));
    }
}
