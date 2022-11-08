import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface Candidato extends Remote {

    public Integer obterVotos(String votos) throws RemoteException;

    public String obterNome() throws RemoteException;

    public String obterPartido() throws RemoteException;

    public void creditarVoto() throws RemoteException;

    public void impugnarCandidato() throws RemoteException;
}