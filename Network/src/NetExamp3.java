

import java.net.*;

public class NetExamp3 {
    public static void main(String args[]) throws UnknownHostException
    {
        InetAddress ip = InetAddress.getByName("192.168.1.14");
        System.out.println("LocalHost:"+ip.getHostName());
    }
}
