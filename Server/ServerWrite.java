 

import java.io.*;
import java.net.*;
class ServerWrite extends Thread
{
	public void run()
	{
	try
	{
	PrintStream ps=ServerTest.ps;
	BufferedReader kbd=new BufferedReader(new InputStreamReader(System.in));
	while(true)
	{
		String s=kbd.readLine();
		ps.println(s);
		ps.flush();
	}	
	
		}catch(Exception e){}
	}
}
