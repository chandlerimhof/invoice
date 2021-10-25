import java.io.*;
import java.util.Scanner;

public class WriterReader {
    WriterReader(){
        createFile();
    }


    public void createFile(){
        try{
            File file = new File("obj.txt");
            if(file.createNewFile()){
                System.out.println("File Created");
            } else loadFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void loadFile(){

        System.out.println("Loading file...");

    }

}
