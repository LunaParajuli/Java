
import java.io.*;   //required data input/output stream
import java.net.*;  //required for Socket Class
  public class MyClient{
      public static void main(String args[])
      {
          try
          {
           Socket s = new Socket("localhost",1111);
           DataOutputStream dout = 
                        new DataOutputStream(s.getOutputStream());
           dout.writeUTF("Hello Server"); //Writes a string to the underlying output stream
          }
          catch(Exception e)
          {
              System.out.println(e);
          }
      }
  }