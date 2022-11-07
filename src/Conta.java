import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Conta extends Remote {
    public double obterSaldo() throws RemoteException;

    public void setSaldo(double s) throws RemoteException;

//	public String echo(String input) throws RemoteException;
}