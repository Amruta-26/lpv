import java.io.*;
import java.net.*;

public class MyClient{
	public static void main(String[] args) throws Exception{
		Socket s = new Socket("127.0.0.1",5555);
		System.out.println("Connection established");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		OutputStream os = s.getOutputStream();
		PrintWriter pw = new PrintWriter(os,true);
		InputStream is = s.getInputStream();
		BufferedReader receive = new BufferedReader(new InputStreamReader(is));
		while(true){
			String clientMsg="";
			String serverMsg="";
			
			System.out.print("Client : ");
			clientMsg=br.readLine();
			
			pw.println(clientMsg);
			if(clientMsg.equals("bye")){
				break;
			}
			
			serverMsg=receive.readLine();
			System.out.println("Server : "+serverMsg);
			
			if(serverMsg.equals("bye")){
				break;
			}
		}
		
		s.close();
		os.close();
		is.close();
		System.out.println("Connection Closed");
	}
}

