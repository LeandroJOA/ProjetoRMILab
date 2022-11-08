import java.rmi.Remote;
import java.rmi.RemoteException;
<<<<<<< HEAD
import java.util.ArrayList;

public interface Candidato extends Remote {

    public Integer obterVotos(String votos) throws RemoteException;
=======

public interface Candidato extends Remote {

    public Integer obterVotos() throws RemoteException;
>>>>>>> leandro

    public String obterNome() throws RemoteException;

    public String obterPartido() throws RemoteException;

<<<<<<< HEAD
    public void creditarVoto() throws RemoteException;

    public void impugnarCandidato() throws RemoteException;
}
=======
    public Boolean creditarVoto() throws RemoteException;

    public Boolean impugnarCandidato() throws RemoteException;
}
>>>>>>> leandro
