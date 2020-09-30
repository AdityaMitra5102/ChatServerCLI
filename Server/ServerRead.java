 

import java.io.*;
import java.net.*;
class ServerRead extends Thread
{
	public void run()
	{
	try{
		BufferedReader br=ServerTest.br;
		String st="";
		while((st=br.readLine())!=null)
		{
			System.out.println(st);
		}
		}catch(Exception e){}
	}
}