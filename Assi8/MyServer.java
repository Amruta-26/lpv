import java.io.*;
import java.net.*;

public class MyServer{
	public static void main(String[] args) throws Exception{
		ServerSocket ss = new ServerSocket(5555);
		System.out.println("Server is ready for connection, Waiting for client");
		
		Socket s= ss.accept();
		System.out.println("Connection established");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		OutputStream os = s.getOutputStream();
		PrintWriter pw = new PrintWriter(os,true);
		InputStream is = s.getInputStream();
		BufferedReader receive = new BufferedReader(new InputStreamReader(is));
		while(true){
			String clientMsg="";
			String serverMsg="";
			
			clientMsg=receive.readLine();
			System.out.println("Client : "+clientMsg);
			
			if(clientMsg.equals("bye")){
				break;
			}
			
			System.out.print("Server : ");
			serverMsg=br.readLine();
			
			pw.println(serverMsg);
			
			if(serverMsg.equals("bye")){
				break;
			}
		}
		
		ss.close();
		s.close();
		os.close();
		is.close();
		System.out.println("Connection Closed");
	}
}

