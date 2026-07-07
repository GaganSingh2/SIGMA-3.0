package InterviewPrepration.PhaseZeroAI;

public class PredictOutput {

    PredictOutput(){
        super();
        // this(10);//it will give CTE bcz we can use only one Calling statement at a time
        System.out.println("PhaseZero Object is Created");
    }

    PredictOutput(int a){
        System.out.println("This");
    }
    public static void main(String[] args) {
        //Q1)Pridict the Output
        System.out.println(100 + 100 + "PhaseZero");//200PhaseZero
        System.out.println("PhaseZero Company"+100+100);//PhaseZero Company100100

        //Q2)
        PredictOutput p = new PredictOutput();
    }
}