import java.io.*;
import java.net.*;
class ServerTest
{
	public static PrintStream ps;
	public static BufferedReader br;
    public static void main(String args[])throws Exception
    {
        ServerSocket ss=new ServerSocket(80);
        System.out.println("Waiting for connection");
        Socket s=ss.accept();
        System.out.println("Connected");
        ps=new PrintStream(s.getOutputStream());
        br=new BufferedReader(new InputStreamReader(s.getInputStream()));
        Thread t1=new Thread(new ServerRead());
        Thread t2=new Thread(new ServerWrite());
        t1.start();
        t2.start();

    }
}