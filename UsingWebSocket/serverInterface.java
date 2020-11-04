package com.client.side;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class serverInterface {
	public static void main(String args[]) throws Exception
	{
		
		System.out.println("SERVER IS UP");
		ServerSocket server = new ServerSocket(7777);
		
		System.out.println("WAITING FOR CLIENT REQUEST");
		Socket request= server.accept();
		
		System.out.println("CONNECTION SUCCESSFUL");
		
		BufferedReader br= new BufferedReader(new InputStreamReader(request.getInputStream() ));
		
		String msg=br.readLine();
		
		System.out.println("Message from client -> "+msg);
	}

}
