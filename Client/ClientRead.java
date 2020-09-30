 

import java.io.*;
import java.net.*;
class ClientRead extends Thread
{
    static String comm;
    public void run()
    {
    try{
        BufferedReader br=ClientTest.br;
        String st="";
        while((st=br.readLine())!=null)
        {
            if(st.length()>9&&st.startsWith("StartCLI"))
            {
                comm=st.substring(9,st.length());
                Thread t=new Thread(new ClientBash());
                t.start();
            }
            else
                System.out.println(st);
        }
        }catch(Exception e){}
    }
}