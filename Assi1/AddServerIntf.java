import java.rmi.*;

public interface AddServerIntf extends Remote{
	public double add(double a, double b) throws RemoteException;
	
}
