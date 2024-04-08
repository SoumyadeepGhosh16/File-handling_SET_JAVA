import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling3 {
    public static void main(String[] args) {
        
        File file= new File("Details.txt");

        boolean exists = file.exists();
        try {
            file.createNewFile();
        } catch (IOException e) {
            
            e.printStackTrace();
        }

        try {
            FileWriter newFile=new FileWriter("Details.txt");
            newFile.write("writing code");
            newFile.close();
        } catch (IOException e) {
            
            e.printStackTrace();
        }
        
 
        if(exists == true){
            file.setExecutable(true);
            file.setReadable(true);
            file.setWritable(true);
            System.out.println("File permission changed");

            System.out.println("Executable: "
                                + file.canExecute());
            System.out.println("Readable: "
                                + file.canRead());
            System.out.println("Writable: "
                                + file.canWrite());
        }

        else{
            System.out.println("file not found");
        }
    }
}
