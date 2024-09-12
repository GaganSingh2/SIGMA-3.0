import java.util.Scanner;

public class QusOfRecursion {
    public static void printDec(int num){
        if (num==1) {
            System.out.print(num);
            return;
        }
        System.out.print(num+" ");
        printDec(num-1);
    }

    public static void printInc(int num){
        if (num==1) {
            System.out.print(num+" ");
            return;
        }
        printInc(num-1);
        System.out.print(num+" ");
    }


    public static int fact(int num){
        if (num==0) {
            return 1;
        }
        int fnm1 = fact(num-1);//fnm1 means ye ak variable hai 
        int fn = num * fnm1;
        return fn;
    }

    public static int sumOfNnaturalnum(int num){
        if (num==1) {
            return 1;
        }
        int snm1 = sumOfNnaturalnum(num-1);
        int sum = num + snm1;
        return sum;
    }

    public static int fibonacci(int num){
        if (num==0) {
            return 0;
        }
        if (num==1) {
            return 1;
        }
        int fnm1 = fibonacci(num-1);
        int fnm2 = fibonacci(num-2);
        int sum = fnm1 + fnm2;
        return sum;

    }

    public static boolean isSorted(int arr[], int i){
        //Base case
        if (i==arr.length-1) {
            return true;
        }
        if (arr[i]>arr[i+1]) {
            return false;
        }
        return isSorted(arr, i+1);
    }

    public static int firstOccurenceElement(int arr[], int i,int key){
        
        //Base Case
        if (i==arr.length) {
            return -1;
        }
        if(arr[i]==key) {
            return i;
        }
        return firstOccurenceElement(arr, i+1, key);
    }

    public static int lastOccurenceElement(int arr[], int i, int key){
        //Base Case
        if (i==arr.length) {
            return -1;
        }
        int isFound = lastOccurenceElement(arr, i+1, key);
        if (isFound == -1 && arr[i]==key) {
            return i;
        }
        return isFound;
    }

    public static int power(int val, int pow){//Time Complexity:- O(n)
        //Base case
        if (pow==0) {
            return 1;
        }
        int pnm1 = power(val, pow-1);
        int res = val * pnm1;
        return res;
    }

    public static int optimizedPower(int val, int pow){
        //Base Case
        if (pow==0) {
            return 1;
        }
        // //int halfpowersq = optimizedPower(val, pow/2) * optimizedPower(val, pow/2); //is line ke wajah se av v program ka TC O(n) hi hai kyuki yaha function 2 bar call ho rha hai.

        int halfpower = optimizedPower(val, pow/2); //ab iske wajah se humara fuction ak baar call hoga or TC O(logn) lagega.
        int halfpowersq = halfpower * halfpower;

        //if power is odd
        if (pow%2 != 0) {
            halfpowersq = val * halfpowersq;
        }
        return halfpowersq;
    }

    public static double pow(double val, int pow){
        if (pow==0) {
            return 1;
        }
        else if (pow==1) {
            return val;
        }
        double ans = pow(val, pow/2);
        //if power is Even
        if (pow%2==0) {
            return ans * ans;
        }
        //if power is Odd
        else{
            return val * ans * ans;
        }     
    }
    public static double myPow(double val, int pow){
        //if power is negative
        if (pow<0) {
            val = 1/val;
            pow = -pow;
        }
        return pow(val, pow);
    }

    public static int tilingProblem(int n){
        //Base Case
        if (n==0 || n==1) {
            return 1;
        }
        //if tiles set as vertically
        int fnm1 = tilingProblem(n-1);

        //if tiles set as horizontally
        int fnm2 = tilingProblem(n-2);

        int totways = fnm1 + fnm2;
        return totways;

        //one line solution 
        //return tilingProblem(n-1) + tilingProblem(n-2);
    }

    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]){
        //Base Case
        if (idx == str.length()) {
            System.out.println("After Removing Duplicate String: "+newStr);
            return;
        }

        //find the index of current CHaracter
        char currChar = str.charAt(idx);

        //if currChar is already exist in newStr
        if (map[currChar-'a'] == true) {
            removeDuplicates(str, idx+1, newStr, map);
        }
        else{//if currCHar is not exist in newStr
            map[currChar-'a'] = true;
            removeDuplicates(str, idx+1, newStr.append(currChar), map);
        }
    }

    public static int pairingFriend(int num){
        //Base Case
        if (num==1 || num==2) {
            return num;
        }

        //if friend is stay single
        int fnm1 = pairingFriend(num-1);

        //if friend is stay with other friend
        int fnm2 = pairingFriend(num-2);
        int pairways = (num-1) * fnm2;

        int totways = fnm1 + pairways;
        return totways;

        //one line solution
        //return pairingFriend(num-1) + (num-1) * pairingFriend(num-2);
    }

    public static void printBinStrings(int num, int lastPlace, String str){
        //Base Case
        if (num==0) {
            System.out.println("Binary Representation with no Consecutive Ones: "+str);
            return;
        }

        //print 0 all times
        printBinStrings(num-1, 0, str+"0");
        //agr last place pe 0 hoga tabhi 1 store hoga str me 
        if (lastPlace==0) {
            printBinStrings(num-1, 1, str+"1");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Q1) Print numbers from n to 1 (Decreasing order).
        // System.out.println("Enter Max value: ");
        // int num = sc.nextInt();
        // printDec(num);

        //Q2)Print numbers from 1 to n(Increasing order)
        // System.out.println("Enter Number: ");
        // int num = sc.nextInt();
        // printInc(num);

        //Q3)Print a factorial of a number.
        // System.out.println("Enter a number: ");
        // int num = sc.nextInt();
        // int res = fact(num);
        // System.out.println("Factorial: "+res);

        //Time Complexity:- O(n).
        //Space Complexity:- O(n).

        //Q4) print sum of first n natural numbers.
        // System.out.println("ENter a number: ");
        // int num = sc.nextInt();
        // int res = sumOfNnaturalnum(num);
        // System.out.println("Sum: "+res);

        //Time Complexity:- O(n).
        //Space Complexity:- O(n).

        //Q5)Print Nth fibonacci number.
        // System.out.println("Enter a Number: ");
        // int num = sc.nextInt();
        // int res = fibonacci(num);
        // System.out.println("Result: "+res);

        //Time COmplexity:- O(2^n)
        //Space Complexity:- O(n).

        //Q6)Check if the given array is sorted or not.
        // System.out.println("Enter the length of Array: ");
        // int len = sc.nextInt();

        // int arr[] = new int[len];
        // System.out.println("Ennter the value in Array: ");
        // for(int i=0; i<len; i++){
        //     arr[i] = sc.nextInt();
        // }
        // System.out.print("Array: ");
        // for(int i=0; i<len; i++){
        //     System.out.print(arr[i]+" ");
        // }
        // System.out.println();
        // boolean res = isSorted(arr, 0);
        // if (res==true) {
        //     System.out.println("Array is Sorted.");
        // }
        // else{
        //     System.out.println("Array is not Sorted.");
        // }

        //Time Complexity:- O(n)
        //Space COmplexity:- O(n)

        //Q7)WAF to find the first occurence of an element in an array
        // System.out.println("Enter the length of Array: ");
        // int len = sc.nextInt();
        // int arr[] = new int[len];

        // System.out.println("Enter the value in Array: ");
        // for(int i=0; i<len; i++){
        //     arr[i] = sc.nextInt();
        // }
        // System.out.print("Array: ");
        // for(int i=0; i<len; i++){
        //     System.out.print(arr[i]+" ");
        // }
        // System.out.println();
        // System.out.println("ENter the key: ");
        // int key = sc.nextInt();

        // int res = firstOccurenceElement(arr, 0, key);
        // System.out.println("Index: "+res);

        //Time Complexity:- O(n)
        //Space Complexity:- O(n)

        //Q8)WAF to find the last occurence of an element in an array
        // System.out.println("Enter the length of Array: ");
        // int len = sc.nextInt();
        // int arr[] = new int[len];

        // System.out.println("Enter the value in Array: ");
        // for(int i=0; i<len; i++){
        //     arr[i] = sc.nextInt();
        // }
        // System.out.print("Array: ");
        // for(int i=0; i<len; i++){
        //     System.out.print(arr[i]+" ");
        // }
        // System.out.println();
        // System.out.println("ENter the key: ");
        // int key = sc.nextInt();
        
        // int res = lastOccurenceElement(arr, 0, key);
        // System.out.println("Index: "+res);


        //Q9) Find the x to the power of n (x^n).
        // System.out.println("Enter the value: ");
        // int val = sc.nextInt();
        // System.out.println("Enter the times of Power: ");
        // int pow = sc.nextInt();
        // int result = power(val, pow);
        // System.out.println(val+" to the power of "+pow+": "+result);

        //Time Complexity:- O(n)
        
        //Q10) Find the x to the power of n (x^n). with Optimized method
        // System.out.println("ENter the value: ");
        // int val = sc.nextInt();
        // System.out.println("ENter the times of power: ");
        // int pow = sc.nextInt();
        // int res = optimizedPower(val, pow);
        // System.out.println(val+" to the power of "+pow+": "+res);
   
        //Time Complexity:- O(logn)

        //[50Leet]Find the x to the power of n (x^n). with Optimized method (iss qus me added hai ki jab power minus me diya ho uper wale qus me without minus wala qus solve hoga)
        // System.out.println("Enter the Value: ");
        // double val = sc.nextInt();
        // System.out.println("ENter the Power: ");
        // int pow = sc.nextInt();
 
        // double res = myPow(val, pow);
        // System.out.println(val+" to the power of "+pow+": "+res);

        //Q11) [Tiling Problem]GIven a "2 X n" board and tiles of size "2 x 1", count the number of ways to tile the given board using the 2x1 tiles.(A tile can either be placed horizontaly or vertically).
        // System.out.println("ENter the width: ");
        // int n = sc.nextInt();
        // int ways = tilingProblem(n);
        // System.out.println("Total ways to set the tile on 2 x "+n+" borad: "+ways);


        //Q12)Remove duplicates in String with the help of Recursion.
        // System.out.println("Enter the String: ");
        // String str = sc.nextLine();
        // System.out.println("Before Removing the Duplicate Strings: "+str);
        // StringBuilder newStr = new StringBuilder("");
        // boolean map[] = new boolean[26];
        // removeDuplicates(str, 0, newStr, map);


        //Q13)Given n friends, each one can remain single or can be paired up with some other friends. Each friend can be paired only once.Find out the total number of ways in which friends can remain single or can be paired up.
        // System.out.println("Enter the Number of Friends: ");
        // int num = sc.nextInt();
        // int ways = pairingFriend(num);
        // System.out.println("Total Ways: "+ways);
        

        //Q14)[Binary Strings Problem]Print all binary strings of size N without consecutive ones.(Consecutive ones means:- lagatar two times 1 nhi aa skta hai)
        System.out.println("ENter the Number: ");
        int num = sc.nextInt();
        String str = "";
        printBinStrings(num, 0, str);
    }
}
 