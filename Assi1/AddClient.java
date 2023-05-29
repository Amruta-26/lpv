import java.rmi.*;
import java.util.*;

public class AddClient{
	public static void main(String[] args)
	{
		try{
			String url= "rmi://localhost/AddServer";
			AddServerIntf addServerIntf = (AddServerIntf)Naming.lookup(url);
			Scanner sc= new Scanner(System.in);
			
			System.out.println("Enter first no.");
			int a = sc.nextInt();
			
			System.out.println("Enter first no.");
			int b = sc.nextInt();
			//sc.nextLine();
			System.out.println("TTye addition is  "+ addServerIntf.add(a,b));
		}
		catch(Exception e)
		{
			System.out.println("Error is"+e);
		}
		
	}
}
