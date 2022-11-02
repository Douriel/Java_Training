import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        File myFile = new File("C:\\Users\\I561156\\Desktop\\myFile.txt");
        try {
            myFile.createNewFile();
            System.out.println("File created");
        }catch (IOException ioe){

        }

    }
}