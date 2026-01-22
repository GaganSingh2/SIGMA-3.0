import java.util.Scanner;

public class Reverse_Alpha_InString {

    public static String revStr(String str){
        char ch[] = str.toCharArray();
        int si = 0, ei = ch.length-1;

        while (si<=ei) {
           
            if(((ch[si]>='A' && ch[si]<='Z') || (ch[si]>='a' && ch[si]<='z')) && ((ch[ei]>='A' && ch[ei]<='Z') || (ch[ei]>='a' && ch[ei]<='z'))){
                char tmp = ch[si];
                ch[si] = ch[ei];
                ch[ei] = tmp;
                si++;
                ei--;
            }
            else if (!((ch[si]>='A' && ch[si]<='Z') || (ch[si]>='a' && ch[si]<='z'))) {
                si++;
            }
            else if(!((ch[ei]>='A' && ch[ei]<='Z') || (ch[ei]>='a' && ch[ei]<='z'))){
                ei--;
            }
            
            
        }
        return new String(ch);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        System.out.println(revStr(str));
    }
}
// A56WH8j