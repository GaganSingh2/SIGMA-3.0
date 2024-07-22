public class argument_in_array {
    
    public static void Update(int marks[],int nonChangable){
        nonChangable = 10;
        for(int i=0; i<marks.length; i++){ //update the given value in main function 
            marks[i] += 5;
        }
    }
    public static void main(String[] args) {
        
        /*Passing array as Argument: 
            1) Pass by value:- isme hhum jo apne function ke andar variable me changes karte hai o changes main functio ya fir calling function me nhhi jati hai.

            2) pass by Reference:-isme hhum jo apne function ke andar variable me changes karte hai o changes main functio ya fir calling function me  jati hai.
            ->Array can be used by default passing by reference.
        */

        int marks[] = {45,64,65};
        int nonChangable = 5; //the value are not updated because value can be update in only array 
        System.out.println("value: "+nonChangable);
        Update(marks,nonChangable);

        //for print the marks
        for(int i=0; i<marks.length; i++){  //print the updated value
            System.out.println("Marks: "+marks[i]);
        }
        

    }
}
