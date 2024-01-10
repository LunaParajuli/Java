
import java.io.*;

public class FileDemo {
     public static void  main(String args[]) throws IOException{
         File f1 = new File ("FileDemo.java");
         
         f1.createNewFile();
          
         System.out.println("Filename:" +f1.getName());
         System.out.println("Path:" +f1.getPath());
         System.out.println("Abs ath:" +f1.getAbsolutePath());
         System.out.println("Parent:" +f1.getParent());
         System.out.println(f1.exists()?  "exists":"does not exist");
         
         System.out.println("File size:"+f1.length()+"Bytes");
         
         
                 
                 
     }
}
