import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling2 {
    public static void main(String[] args) {
        
        //code to create a new file
        File myFile=new File("Details.txt");

        try {
            myFile.createNewFile();
        } catch (IOException e) {
            System.out.println("unable to create this file");
            e.printStackTrace();
        }

        //code to write to a file
        try {
            FileWriter filewriter = new FileWriter("Details.txt");
            filewriter.write("i am studying engineering.");

            filewriter.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }

        //reading from a file
        try {
            Scanner sc = new Scanner(myFile);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //file delete process
        if(myFile.delete()){
            System.out.println("file deleted: "+myFile.getName());
        }
        else{
            System.out.println("some error occoured.Try again later");
        }
        
    }
}
