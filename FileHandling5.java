// Java program explaining the working of sync() method

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandling5 {
    public static void main(String[] args) throws IOException{
        
        FileDescriptor file_descriptor=null;
        FileOutputStream file_out= null;

        byte[] buffer = {71,69,75,83};

        try{
            file_out = new FileOutputStream("Details.txt");

        file_descriptor = file_out.getFD();

        file_out.write(buffer);

        file_descriptor.sync();
            System.out.print("\nUse of Sync Successful ");
        }catch(Exception except){
            except.printStackTrace();
        }
        finally{
            if(file_out!=null)
                file_out.close();
        }
    }
}
