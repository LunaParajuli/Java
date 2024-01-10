
import java.io.*;   //required data input/output stream
import java.net.*;  //required for Socket Class
  public class MyServer{
      public static void main(String args[])
      {
          try
          {
           ServerSocket ss = new ServerSocket(1111);
           Socket s = ss.accept();
           DataInputStream dis = 
                        new DataInputStream(s.getInputStream());
           String str = (String)dis.readUTF();
              System.out.println("message="+str);
              ss.close();
          }
          catch(Exception e)
          {
              System.out.println(e);
          }
      }
  }