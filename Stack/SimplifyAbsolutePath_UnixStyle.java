import java.util.Scanner;
import java.util.Stack;
public class SimplifyAbsolutePath_UnixStyle {
    public static String simplifyAbsolutePath(String path){
        if(path.charAt(0) != '/'){ //because path always starts with '/'
            return null;
        }
        //1Step: split string based on '/'
        String tmp[] = path.split("/"); 
        Stack<String> stk = new Stack<>();

        //2nd Step------
        for(int i=0; i<tmp.length; i++){
            //ignore . and space
            if(tmp[i].equals(".") || tmp[i].equals("")){
                continue;
            }
            //remove top of stack value if ".." is comes
            else if(tmp[i].equals("..")){
                if(!stk.isEmpty()){
                    stk.pop();
                }
                else{
                    continue;
                }
            }
            //Otherwise, push into stack
            else{
                stk.push(tmp[i]);
            }
        }
       
        StringBuilder sb = new StringBuilder("");
        //3rd Step: Join all element in Stack using '/' (using leading '/')
        for(String dir: stk){
            sb.append("/").append(dir);
        }
        return (sb.length()>0)?sb.toString():"/";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Absolute Path in Unix Style: ");
        String path = sc.next();
        String simplifyPath = simplifyAbsolutePath(path);
        System.out.println("Before Simplify Unix Path: "+path);
        if(simplifyPath != null){
            System.out.println("After Simplify Unix Path: "+simplifyPath);
        }
        else{
            System.out.println("Invalid Absolute Path!!");
        }
    }
}
