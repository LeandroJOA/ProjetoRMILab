import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Eleitor  extends Remote {

    public String obterNome() throws RemoteException;

    public String obterTitulo() throws RemoteException;

    public Boolean votou() throws RemoteException;
}
