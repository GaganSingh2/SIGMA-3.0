// package Stack;

// import java.util.Scanner;

// public class FakeNumber {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         boolean res = false;
//         System.out.println("Enter National Number: ");
//         String num = sc.nextLine();
//         System.out.println("Number: " + num);
//         if (num.charAt(0) == '0') {
//             System.out.println("Check For National Number!");
//             res = varifyNatNum(num);
//             if (res)
//                 System.out.println("Valid Number");
//             else
//                 System.out.println("Invalid Number");
//         } else if (num.charAt(0) == '+' && num.charAt(1) == '9' && num.charAt(2) == '1') {
//             System.out.println("Check For Inter-National Number");
//             res = verifyInterNatNum(num);
//             if (res)
//                 System.out.println("Valid Number");
//             else
//                 System.out.println("Invalid Number");
//         } else {
//             System.out.println("InValid Number!");
//         }

//     }

//     public static boolean varifyNatNum(String num) {

//         // For Space after 6-digit
//         if (num.charAt(6) != ' ') {
//             return false;
//         }
//         // Begins With 7, 8, 9
//         if (num.charAt(1) != '7' && num.charAt(1) != '8'
//                 && num.charAt(1) != '9') {
//             return false;
//         }

//         boolean flag = false;
//         int digit = 0;
//         for (int i = 1; i < num.length(); i++) {
//             if (num.charAt(i) >= '0' && num.charAt(i) <= '9') {
//                 digit++;
//             } else if (num.charAt(i) >= 'a' && num.charAt(i) <= 'z') {
//                 return false;
//             }
//         }
//         if (digit == 10) {
//             flag = true;
//         }

//         return flag;
//     }

//     public static boolean verifyInterNatNum(String num) {

//         // For Space after +91(at 3rd idx) and At 9th Idx
//         if (num.charAt(3) != ' ') {
//             return false;
//         }
//         if (num.charAt(9) != ' ') {
//             return false;
//         }
//         // Begins With 7, 8, 9
//         if (num.charAt(4) != '7' && num.charAt(4) != '8'
//                 && num.charAt(4) != '9') {
//             return false;
//         }

//         boolean flag = false;
//         int digit = 0;
//         for (int i = 4; i < num.length(); i++) {
//             if (num.charAt(i) >= '0' && num.charAt(i) <= '9') {
//                 digit++;
//             } else if (num.charAt(i) >= 'a' && num.charAt(i) <= 'z') {
//                 return false;
//             }

//         }
//         if (digit == 10) {
//             flag = true;
//         }

//         return flag;
//     }

// }




//-------------------------------------------------------------------------------------------------------------------
import java.util.Scanner;

public class FakeNumberDetect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        System.out.print(fakeNumber(num));
    }
    public static boolean fakeNumber(String num){
        /***
         * beginning -  +91 || 0 || 7,8,9
         * international - +91 ***** *****
         * national - 0***** *****
         * no extra space or digit
         * actual number should be of 10 digits excluding national and international format and spacing
         */
        boolean isTrue = true;
        String[] srr = num.split(" ");
        int size = srr.length;
        if (size == 3) {
            if(!srr[0].equals("+91")){
                isTrue = false;
            }
            else isTrue = checkNumber(srr,1);
        } else if (size==2) {
            char ch = srr[0].charAt(0);
            if(ch!='0') isTrue = false;
            else isTrue = checkNumber(srr,0);
        }
        else isTrue = false;

        return isTrue;
    }
    public static boolean checkNumber(String[] srr, int i){
        boolean isTrue = true;
        char ch = 'a';
        if(i==0) ch = srr[0].charAt(1);
        else ch = srr[1].charAt(0);

        if(ch=='7'||ch=='8'||ch=='9'){
            int len1 = srr[i].length(), len2 = srr[i+1].length();
            len1 += len2;
            if(len1 != 11 && i==0) isTrue=false;
            else if(len1!=10 && i==1) isTrue=false;
        }else isTrue=false;

        //For Detecting the Character in Number
        for(int part=i; part<=i+1; part++){
            for(int j=0; j<srr[part].length(); j++){
                if(srr[part].charAt(j)>='a' && srr[part].charAt(j)<='z'){
                isTrue = false;
                break;
            }
            }
            
        }
        return isTrue;
    }

}