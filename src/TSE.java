import java.rmi.Remote;
import java.rmi.RemoteException;

public interface TSE extends Remote {
    public CandidatoEleitoral registrarCandidato(String numero, String sigla, String cargo, String nome) throws RemoteException;
}
