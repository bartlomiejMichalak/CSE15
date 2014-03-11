

import java.io.*;
import java.net.*;

class Dog 
{       public static void main(String a[]) throws IOException 
        {       // Specify your server with a url or an IP address. 
                // if you try this on your system, insert your system name 
                //  such as "sol.pace.edu" in the server string instead of loopback.
                //String loopback = "127.0.0.1"; // "localhost" will also work. 
  
                String loopback = "localhost";
                String server = "128.180.148.157";           // Open our connection to the server, at port 4444
                //String server = "128.180.61.145";
                //String server = "192.168.1.248";
                Socket sock = new Socket(server,4444);
    
                // Get I/O streams from the socket
                BufferedReader dis = new BufferedReader(new InputStreamReader( sock.getInputStream() ));
                PrintStream PrintStreamdat =  new PrintStream(sock.getOutputStream() );
                
                
                String fromServer = dis.readLine();  
                System.out.println("Got this from server: " + fromServer);
                
                String myReply = null;
                BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
                myReply = in.readLine();
                PrintStreamdat.println(myReply);
        
                fromServer = dis.readLine();
                System.out.println("More from Server: "+ fromServer);
        
               
                sock.close();
        }  
}