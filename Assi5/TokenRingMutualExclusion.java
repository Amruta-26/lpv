import java.util.*;

class TokenRing
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Process numbers");
		int n=sc.nextInt();
		
		System.out.println("Initiating Process");
		for(int i=0;i<n;i++){
			System.out.println("Process "+i);
			
		}
		
		System.out.println("Enter Sender");
		int sender=sc.nextInt();
		
		System.out.println("Enter Receiver");
		int receiver= sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Message");
		String msg=sc.nextLine();
		
		boolean msg_pass=false;
		
		for(int token=0;token<n;token++)
		{
			System.out.println("The token is at process "+token);
			
			if(token==sender)
			{
				System.out.println("Sender Found");
				System.out.println("Message Attached");
				msg_pass=true;
			}
			else if(token==receiver){
				System.out.println("Token Reached at receiver ");
				System.out.println(msg+" Message reached");
				msg_pass=false;}
			if(msg_pass)
			{
				System.out.println(token+" passed to process "+(token+1)%n);
			}
		}
	}
}

