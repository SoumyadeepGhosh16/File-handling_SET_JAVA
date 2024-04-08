import java.io.File;

public class FileHandling1 {
    public static void main(String[] args) {
        
        String fname=args[0];

        File f = new File(fname);

        System.out.println("file name: "+ f.getName());

        System.out.println("path "+f.getPath());

        System.out.println("absolute path: "+f.getAbsolutePath());

        System.out.println("Parent:" + f.getParent());

        System.out.println("Exists :" + f.exists());

        if (f.exists()) {
            System.out.println("Is writable:"
                               + f.canWrite());
            System.out.println("Is readable" + f.canRead());
            System.out.println("Is a directory:"
                               + f.isDirectory());
            System.out.println("File Size in bytes "
                               + f.length());
        }
    }
}
