import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Number: ");
        String number = input.nextLine();
        input.close();
        if(isValidNumber(number))
            System.out.println(number + " : Valid Number");
        else
            System.out.println(number + " : Invalid Number");
    }

    public static boolean isValidNumber(String number){
        if(!isNumberLengthValid(number))
            return false;
        if(!isNumberStartValid(number))
            return false;
        if(!isNumberFormateCorrect(number))
            return false;
        if(!isNumberDigitsAreValid(number))
            return false;
        
    return true;
    }

    public static boolean isNumberStartValid(String number){
        char numberStart = number.charAt(0);
        if(numberStart == '0' || numberStart == '7' || numberStart == '8' || numberStart == '9')
            return true;
        else{
            String numbeStarting = number.substring(0, 3);
            if(numbeStarting.equals("+91"))
                return true;
            else 
                return false;
        }
    }

    public static boolean isNumberLengthValid(String number){
        if(number.length() < 10)
            return false;
        char numberFormate = numberIsInInternationalOrNational(number);
        String numberWithoutSpaces = number.replace(" ", "");
        if(numberFormate == 'I' && numberWithoutSpaces.length() == 13)
           return true; 
        if(numberFormate == 'N' && numberWithoutSpaces.length() == 11)
                return true;
        if(numberFormate == 'W' && numberWithoutSpaces.length() == 10)
            return true;
    return false;
    }

    public static boolean isNumberFormateCorrect(String number){
        char numberFormate = numberIsInInternationalOrNational(number);
        // To check International Formate
        if(numberFormate == 'I'){
            for(int i = 1; i<15; i++){
                if(i == 3 || i == 9){
                    if(number.charAt(i) !=  ' ')
                        return false;
                    continue;
                }
                if(number.charAt(i) == ' ')
                    return false;
            }
        return true;
        }

        // To check National Formate
        if(numberFormate == 'N'){
            for(int i = 0; i < 12; i++){
                if(i == 7){
                    if (number.charAt(i) != ' ')
                        return false;
                    continue;
                }
                if(number.charAt(i) == ' ')
                    return false;
            }
        return true;
        }

        // To check Without Formate or General Formate
        if(numberFormate == 'W'){
            for(int i = 0;  i<10; i++){
                if(number.charAt(i) == ' ')
                    return false;
            }
        return true;
        }
    return false;
    }

    public static boolean isNumberDigitsAreValid(String number){
        char numberFormate = numberIsInInternationalOrNational(number);
        String numberWithoutSpaces = number.replace(" ", "");
        int numberLength = numberWithoutSpaces.length();
        if(numberFormate == 'I'){
            for(int i = 1; i < numberLength; i++){
                if(numberWithoutSpaces.charAt(i) < '0' || numberWithoutSpaces.charAt(i) > '9')
                    return false;
            }
        return true;
        }
        for(int i = 0; i< numberLength; i++){
            if(numberWithoutSpaces.charAt(i) < '0' || numberWithoutSpaces.charAt(i) > '9')
                return false;
        }
    return true;
    }

    public static char numberIsInInternationalOrNational(String number){
        if(number.substring(0, 3).equals("+91"))
            // 'I' : To show International Formate
            return 'I';
        else if(number.charAt(0) == '0'){
                // 'N' : To show National Formate
                return 'N';
            }
        else
            // 'W' : To show Without Formate or General Formate
            return 'W';
    }
}