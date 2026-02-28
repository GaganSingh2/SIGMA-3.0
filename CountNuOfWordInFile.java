import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CountNuOfWordInFile {

    public static void main(String[] args) {
        BufferedWriter buff = null;
        try{
            buff = new BufferedWriter(new FileWriter("E:/J_Spider/FileHandling/IOFILE/NewFile/TestBuff2.txt"));
            buff.write("Hello");
            buff.newLine();
            buff.write("Gagan");
            buff.newLine();
            buff.write("How are you");
            buff.flush();
            System.out.println("Write Completed!");

        }
        catch(IOException e){
            e.printStackTrace();
        }
        finally{
            
			try {
				buff.close();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		
        }
    }
}