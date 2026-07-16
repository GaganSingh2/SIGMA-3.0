package InterviewPrepration.PhaseZeroAI;

public class CountVowelInEachWord {
    public static void countVowel(String str){
        int cnt = 0;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if (ch == ' ' || i == str.length()-1) {
                System.out.println("Count: "+cnt);
                cnt=0;
            }
            else if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'O' || ch == 'I' || ch == 'U'){
                cnt++;
            }
        }
    }
    public static void main(String[] args) {
        String str = "Gagan Kumar Singh";
        countVowel(str);
    }
}
