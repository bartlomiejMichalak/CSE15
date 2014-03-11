import java.io.*;
import java.net.*;

public class DogServer 
{        public static void main(String a[]) throws IOException 
        {       int port = 4444;
                Socket client = null;
                // Next we create the server socket that we will listen to. 
                ServerSocket servsock = new ServerSocket(port);

                String query = "Are you a Mountain Hawk or a Leopard?";

                while (true) 
                {       // Wait for the next client connection
                        client = servsock.accept();
                        // Create the input and output streams for our communication. 
                        PrintStream out = new PrintStream( client.getOutputStream() );
                        BufferedReader in  = new BufferedReader(new InputStreamReader( client.getInputStream()));
                        // Now you can just write to and read from these streams. 

                        // Send our query
                        out.println(query); out.flush();

                        // get the reply
                        String reply = in.readLine();
                        if (reply.indexOf("Leopard") > -1) 
                        {       System.out.println("On the Internet I know this is a Leopard");
                                out.println("I'm so sorry to hear that.");
                        }
						if (reply.indexOf("Hawk") > -1){
								System.out.println("On the Internet I know this is a Hawk");
								out.println("Congratulations.");
						}
                        else 
                        {       System.out.println("Probably a person or an AI experiment.");
                                out.println("You're a person or something.");
                        }
                        out.flush();
                                
                        // All done. Close this connection 
                        client.close();
                 }
        }
}