
import java.io.*;
import java.net.*;
class ClientWrite extends Thread
{
    public void run()
    {
        try
        {
            PrintStream ps=ClientTest.ps;
            BufferedReader kbd=new BufferedReader(new InputStreamReader(System.in));
            while(true)
            {
                String s=kbd.readLine();
                ps.println(s);
                ps.flush();
            }	

        }catch(Exception e)
        {
            interrupt();
        }
    }
}
