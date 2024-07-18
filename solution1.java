import java.util.*;
public class solution1 {
	public static boolean isPrime(int num) {
		//Your code goes here
        
		boolean ans1 = true;
		if(num==2){
            return true;
		}
		else{
			//ans1 = true;
			for(int i=2; i<=(Math.sqrt(num));i++){
				if(num%i==0){
				   
					return false;
				}
			}
			if(ans1==true){
				//System.out.println("YES");
				return true;
			}
			else{
				//System.out.println("NO");
				return false;
			}
		}
		//return true;

	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the number: ");
		int num = sc.nextInt();
		boolean ans = isPrime(num);
		
		if (ans) {
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}

	}
}