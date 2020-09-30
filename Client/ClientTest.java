import java.io.*;
import java.net.*;
import java.util.*;
class ClientTest
{
    public static PrintStream ps;
    public static BufferedReader br;

    public static void main(String args[])throws Exception
    {
        try
        {
            System.out.println("Enter server IP (Keep it in square brackets in case of IPv6");
            String key=new Scanner(System.in).nextLine().trim();
            System.out.println("Waiting for server");
            Socket s=new Socket(key,80);
            System.out.println("Connected");
            ps=new PrintStream(s.getOutputStream());
            br=new BufferedReader(new InputStreamReader(s.getInputStream()));
            Thread t1=new Thread(new ClientRead());
            Thread t2=new Thread(new ClientWrite());
            t1.start();
            t2.start();
        }
        catch(Exception e)
        {
            System.out.println("Server not ready.");
        }
    }
}