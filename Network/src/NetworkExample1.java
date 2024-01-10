//InetAddress:Method

import java.net.*;

public class NetworkExample1 {
    public static void main(String args[]) throws UnknownHostException
    {
        InetAddress ip = InetAddress.getLocalHost();
        System.out.println("LocalHost:"+ip);
    }
}
