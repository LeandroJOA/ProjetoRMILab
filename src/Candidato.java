import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Candidato extends Remote {

    public Integer obterVotos() throws RemoteException;

    public String obterNome() throws RemoteException;

    public String obterPartido() throws RemoteException;

    public Boolean creditarVoto() throws RemoteException;

    public Boolean impugnarCandidato() throws RemoteException;
}
